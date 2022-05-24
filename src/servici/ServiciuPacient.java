package servici;
import com.opencsv.CSVWriter;
import pacienti.Pacient;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServiciuPacient {
    private static ServiciuPacient single_instance = null;

    private ServiciuPacient()
    {
    }

    public static ServiciuPacient getInstance()
    {
        if (single_instance == null)
            single_instance = new ServiciuPacient();

        return single_instance;
    }
    public  List<Pacient> citirePacient() {
        List<Pacient> list = new ArrayList<>();
        try( var in = new BufferedReader(new FileReader("src\\citirePacient.csv"))) {
            String line = "";

            while( (line = in.readLine()) != null ) {
                String [] fields = line.replaceAll(" ", "").split(",");
                Pacient p = new Pacient(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], fields[7]);
                list.add(p);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return  list;
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
