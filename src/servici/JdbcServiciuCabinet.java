package servici;

import cabinete.Cabinet;
import com.opencsv.CSVWriter;
import pacienti.Pacient;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class JdbcServiciuCabinet {

    static final String JDBC_DB_URL = "jdbc:mysql://localhost:3306/jdbc";
    // JDBC Database Credentials
    static final String JDBC_USER = "root";
    static final String JDBC_PASS = "@Alex775";

    private static JdbcServiciuCabinet single_instance = null;

    private JdbcServiciuCabinet()
    {
    }

    public static JdbcServiciuCabinet getInstance()
    {
        if (single_instance == null)
            single_instance = new JdbcServiciuCabinet();

        return  single_instance;
    }

    public static void adaugareCabinet(Cabinet cabinet) {

        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            String insertStr = "INSERT INTO  cabinet VALUES(null,?, ?, ?)";
            Integer cabinetNumar = cabinet.getNumar();
            Integer cabinetEtaj = cabinet.getEtaj();
            try (PreparedStatement pst = connection.prepareStatement(insertStr)) {
                pst.setString(1, cabinetNumar.toString());
                pst.setString(2, cabinetEtaj.toString());
                pst.setString(3, cabinet.getSectie());
                pst.executeUpdate();
            }catch (Exception e)
            {
                e.printStackTrace();
            }


        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    public SortedSet<Cabinet> citireCabinete() {
        SortedSet<Cabinet> cabinetSortedSet = new TreeSet<>();
        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from cabinet");
            while (resultSet.next()) {

                Cabinet cabinet = new Cabinet(resultSet.getInt("numar"), resultSet.getInt("etaj"),resultSet.getString("Sectie"));
                cabinetSortedSet.add(cabinet);
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return cabinetSortedSet;

    }
    public static void  modificareCabinet(int Id , Cabinet cabinet) {

        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            Statement statement = connection.createStatement();
            String sql = "UPDATE cabinet " +
                    "SET Id = " + Id +
                    ",numar = " + cabinet.getNumar() +
                    ", etaj = " + cabinet.getEtaj() +
                    ", Sectie = '" + cabinet.getSectie() +
                    "' WHERE Id = "+ Id + ";";

            statement.executeUpdate(sql);
        } catch (Exception e)
        {
            e.printStackTrace();
        }



    }

    public static void  stergereCabinet(int Id) {
        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM cabinet " + "WHERE id = " + Id + " ;";
            statement.executeUpdate(sql);


        } catch (Exception e)
        {
            e.printStackTrace();
        }



    }

    public static void scriereCabinete(String filePath, SortedSet<Cabinet> cabinetSortedSet)
    {

        File file = new File(filePath);


        try {

            FileWriter outputfile = new FileWriter(file);

            CSVWriter writer = new CSVWriter(outputfile);
            String[] header = {"index", "numar", "etaj", "Sectie"};
            writer.writeNext(header);
            List<String[]> data = new ArrayList<String[]>();
            Integer i = 0;
            for (Cabinet cabinet: cabinetSortedSet) {
                i++;
                Integer cabinetNumar = cabinet.getNumar();
                Integer cabinetEtaj = cabinet.getEtaj();
                String[] myStringArray = new String[]{Integer.toString(i) , cabinetNumar.toString(), cabinetEtaj.toString(), cabinet.getSectie()};
                data.add(myStringArray);


            }
            writer.writeAll(data);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
