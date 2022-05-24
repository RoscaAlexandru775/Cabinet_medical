package servici;

import com.opencsv.CSVWriter;
import medici.Medic;
import pacienti.Pacient;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcServiciuPacient {
    static final String JDBC_DB_URL = "jdbc:mysql://localhost:3306/jdbc";
    // JDBC Database Credentials
    static final String JDBC_USER = "root";
    static final String JDBC_PASS = "@Alex775";

    private static JdbcServiciuPacient single_instance = null;

    private JdbcServiciuPacient()
    {
    }

    public static JdbcServiciuPacient getInstance()
    {
        if (single_instance == null)
            single_instance = new JdbcServiciuPacient();

        return  single_instance;
    }

    public static void adaugarePacient(Pacient pacient) {

        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            String insertStr = "INSERT INTO  pacient VALUES(null,?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pst = connection.prepareStatement(insertStr)) {
                pst.setString(1, pacient.getNume());
                pst.setString(2, pacient.getPrenume());
                pst.setString(3, pacient.getGen());
                pst.setString(4, pacient.getDataNastere());
                pst.setString(5, pacient.getCnp());
                pst.setString(6, pacient.getGrupaSanguina());
                pst.setString(7, pacient.getEmail());
                pst.setString(8, pacient.getAdresa());
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
    public List<Pacient> citirePacienti() {
        List<Pacient> list = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from pacient");
            while (resultSet.next()) {

                Pacient pacient = new Pacient(resultSet.getString("nume"), resultSet.getString("prenume"),resultSet.getString("gen"),resultSet.getString("dataNastere"),resultSet.getString("cnp"), resultSet.getString("grupaSanguina"), resultSet.getString("email"),resultSet.getString("adresa") );
                list.add(pacient);
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return list;

    }
    public static void  modificarePacient(int Id , Pacient pacient) {

        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            Statement statement = connection.createStatement();
            String sql = "UPDATE pacient " +
                    "SET Id = " + Id +
                    ",nume = '" + pacient.getNume() +
                    "', prenume = '" + pacient.getPrenume() +
                    "', gen = '" + pacient.getGen() +
                    "', dataNastere = '" + pacient.getDataNastere() +
                    "', cnp = '" + pacient.getCnp() +
                    "', grupaSanguina = '" + pacient.getGrupaSanguina() +
                    "', email = '" + pacient.getEmail() +
                    "', adresa = '" + pacient.getAdresa() +
                    "' WHERE Id = "+ Id + ";";

            statement.executeUpdate(sql);
        } catch (Exception e)
        {
            e.printStackTrace();
        }



    }
    public static void  stergerePacient(int Id) {
        try {
            Connection connection = DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM pacient " + "WHERE id = " + Id + " ;";
            statement.executeUpdate(sql);


        } catch (Exception e)
        {
            e.printStackTrace();
        }



    }
    public static void scrierePacienti(String filePath, List<Pacient> pacientList)
    {

        File file = new File(filePath);


        try {

            FileWriter outputfile = new FileWriter(file);

            CSVWriter writer = new CSVWriter(outputfile);
            String[] header = {"index", "nume", "prenume", "gen","data nastere","cnp","grupaSanguina","email", "adresa"};
            writer.writeNext(header);
            List<String[]> data = new ArrayList<String[]>();
            Integer i = 0;
            for (Pacient pacient: pacientList) {
                i++;
                String[] myStringArray = new String[]{Integer.toString(i) ,pacient.getNume(), pacient.getPrenume(), pacient.getGen(), pacient.getDataNastere(), pacient.getCnp(),pacient.getGrupaSanguina(), pacient.getEmail(), pacient.getAdresa()};
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
