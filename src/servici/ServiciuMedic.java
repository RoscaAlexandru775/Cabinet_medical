package servici;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;
import medici.Medic;


public class ServiciuMedic {
    private static ServiciuMedic single_instance = null;

    private ServiciuMedic()
    {
    }

    public static ServiciuMedic getInstance()
    {
        if (single_instance == null)
            single_instance = new ServiciuMedic();

        return single_instance;
    }
    public List<Medic> citireMedic() {
        List<Medic> list = new ArrayList<>();
        try( var in = new BufferedReader(new FileReader("src\\citireMedic.csv"))) {
            String line = "";

            while( (line = in.readLine()) != null ) {
                String [] fields = line.replaceAll(" ", "").split(",");
                Medic medic = new Medic(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], fields[7]);
                list.add(medic);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

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
