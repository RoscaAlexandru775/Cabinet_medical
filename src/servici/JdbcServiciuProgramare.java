package servici;

import com.opencsv.CSVWriter;
import pacienti.Pacient;
import programari.Programare;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcServiciuProgramare {
    static final String JDBC_DB_URL = "jdbc:mysql://localhost:3306/jdbc";
    // JDBC Database Credentials
    static final String JDBC_USER = "root";
    static final String JDBC_PASS = "@Alex775";

    private static JdbcServiciuProgramare single_instance = null;

    private JdbcServiciuProgramare()
    {
    }

    public static JdbcServiciuProgramare getInstance()
    {
        if (single_instance == null)
            single_instance = new JdbcServiciuProgramare();

        return  single_instance;
    }
    public static void adaugareProgramare(Programare programare) {

        try {
            Integer numarCabinet = programare.getNumarCabinet();
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            String insertStr = "INSERT INTO  programare VALUES(null,?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pst = connection.prepareStatement(insertStr)) {
                pst.setString(1, programare.getNumePacient());
                pst.setString(2, programare.getPrenumePacient());
                pst.setString(3, programare.getNumeMedic());
                pst.setString(4, programare.getPrenumeMedic());
                pst.setString(5, programare.getAdresaClinica());
                pst.setString(6, programare.getDataInceputProgramare());
                pst.setString(7, programare.getDataSfarsitProgramare());
                pst.setString(8, numarCabinet.toString());
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
    public List<Programare> citireProgramari() {
        List<Programare> list = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from programare");
            while (resultSet.next()) {

                Programare programare = new Programare(resultSet.getString("numePacient"), resultSet.getString("prenumePacient"),resultSet.getString("numeMedic"),resultSet.getString("prenumeMedic"),resultSet.getString("adresaClinica"), resultSet.getString("dataInceputProgramare"), resultSet.getString("dataSfarsitProgramare"),resultSet.getInt("numarCabinet") );
                list.add(programare);
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return list;

    }
    public static void  modificareProgramare(int Id , Programare programare) {

        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            Statement statement = connection.createStatement();
            String sql = "UPDATE programare " +
                    "SET Id = " + Id +
                    ",numePacient = '" + programare.getNumePacient() +
                    "', prenumePacient = '" + programare.getPrenumePacient() +
                    "', numeMedic = '" + programare.getNumeMedic() +
                    "', prenumeMedic = '" + programare.getPrenumeMedic() +
                    "', adresaClinica = '" + programare.getAdresaClinica() +
                    "', dataInceputProgramare = '" + programare.getDataInceputProgramare() +
                    "', dataSfarsitProgramare = '" + programare.getDataSfarsitProgramare() +
                    "', numarCabinet = '" + programare.getNumarCabinet() +
                    "' WHERE Id = "+ Id + ";";

            statement.executeUpdate(sql);
        } catch (Exception e)
        {
            e.printStackTrace();
        }



    }
    public static void  stergereProgramare(int Id) {
        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM programare " + "WHERE id = " + Id + " ;";
            statement.executeUpdate(sql);


        } catch (Exception e)
        {
            e.printStackTrace();
        }



    }
    public static void scriereProgramari(String filePath, List<Programare> programareList)
    {

        File file = new File(filePath);


        try {

            FileWriter outputfile = new FileWriter(file);

            CSVWriter writer = new CSVWriter(outputfile);
            String[] header = {"index", "numePacient", "prenumePacient", "numeMedic","prenumeMedic","adresaClinica","dataInceputProgramare","dataSfarsitProgramare", "numarCabinet"};
            writer.writeNext(header);
            List<String[]> data = new ArrayList<String[]>();
            Integer i = 0;
            for (Programare programare: programareList) {
                i++;
                Integer programareNumarCabinet = programare.getNumarCabinet();
                String[] myStringArray = new String[]{Integer.toString(i) ,programare.getNumePacient() , programare.getPrenumePacient() , programare.getNumeMedic(), programare.getPrenumeMedic(), programare.getAdresaClinica(), programare.getDataInceputProgramare() , programare.getDataSfarsitProgramare() , programareNumarCabinet.toString() };
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
