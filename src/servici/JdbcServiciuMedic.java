package servici;

import com.opencsv.CSVWriter;
import medici.Medic;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcServiciuMedic {
    static final String JDBC_DB_URL = "jdbc:mysql://localhost:3306/jdbc";
    // JDBC Database Credentials
    static final String JDBC_USER = "root";
    static final String JDBC_PASS = "@Alex775";

    private static JdbcServiciuMedic single_instance = null;

    private JdbcServiciuMedic()
    {
    }

    public static JdbcServiciuMedic getInstance()
    {
        if (single_instance == null)
            single_instance = new JdbcServiciuMedic();

        return single_instance;
    }
    public static void adaugareMedic(Medic medic) {
        List<Medic> list = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            String insertStr = "INSERT INTO  medic VALUES(null,?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pst = connection.prepareStatement(insertStr)) {
                pst.setString(1, medic.getNume());
                pst.setString(2, medic.getPrenume());
                pst.setString(3, medic.getGen());
                pst.setString(4, medic.getDataNastere());
                pst.setString(5, medic.getCnp());
                pst.setString(6, medic.getEmail());
                pst.setString(7, medic.getAdresa());
                pst.setString(8, medic.getSpecilizare());
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
    public List<Medic> citireMedici() {
        List<Medic> list = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from medic");
            while (resultSet.next()) {

                Medic medic = new Medic(resultSet.getString("nume"), resultSet.getString("prenume"),resultSet.getString("gen"),resultSet.getString("dataNastere"),resultSet.getString("cnp"),resultSet.getString("email"),resultSet.getString("adresa"),resultSet.getString("specializare") );
                list.add(medic);
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return list;

    }
    public static void  modificareMedic(int Id , Medic medic) {

        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            Statement statement = connection.createStatement();
            String sql = "UPDATE medic " +
                    "SET Id = " + Id +
                    ",nume = '" + medic.getNume() +
                    "', prenume = '" + medic.getPrenume() +
                    "', gen = '" + medic.getGen() +
                    "', dataNastere = '" + medic.getDataNastere() +
                    "', cnp = '" + medic.getCnp() +
                    "', email = '" + medic.getEmail() +
                    "', adresa = '" + medic.getAdresa() +
                    "', specializare = '" + medic.getSpecilizare() +
                    "' WHERE Id = "+ Id + ";";

            statement.executeUpdate(sql);
        } catch (Exception e)
        {
            e.printStackTrace();
        }



    }
    public static void  stergereMedic(int Id) {

        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM medic " + "WHERE id = " + Id + " ;";
            statement.executeUpdate(sql);


        } catch (Exception e)
        {
            e.printStackTrace();
        }



    }


    public static void scriereMedici(String filePath, List<Medic> medicList)
    {

        File file = new File(filePath);


        try {

            FileWriter outputfile = new FileWriter(file);

            CSVWriter writer = new CSVWriter(outputfile);
            String[] header = {"index", "nume", "prenume", "gen","data nastere","cnp","email", "adresa", "specializare" };
            writer.writeNext(header);
            List<String[]> data = new ArrayList<String[]>();
            Integer i = 0;
            for (Medic medic: medicList) {
                i++;
                String[] myStringArray = new String[]{Integer.toString(i) ,medic.getNume(), medic.getPrenume(), medic.getGen(), medic.getDataNastere(), medic.getCnp(), medic.getEmail(), medic.getAdresa(), medic.getSpecilizare()};
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
