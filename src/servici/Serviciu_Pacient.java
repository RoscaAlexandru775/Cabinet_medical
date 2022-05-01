package servici;
import medici.Medic;
import pacienti.Pacient;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serviciu_Pacient {
    private static Serviciu_Pacient single_instance = null;

    private Serviciu_Pacient()
    {
    }

    public static Serviciu_Pacient getInstance()
    {
        if (single_instance == null)
            single_instance = new Serviciu_Pacient();

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
    public static void scrierePacient(String filePath, Pacient pacient)
    {

        File file = new File(filePath);
        try {

            FileWriter outputfile = new FileWriter(file);

            PrintWriter out = new PrintWriter(outputfile);

            out.printf("%s, %s, %s, %s, %s, %s, %s, %s\n", pacient.getNume(), pacient.getPrenume(), pacient.getGen(), pacient.getDataNastere(), pacient.getCnp(), pacient.getGrupaSanguina(), pacient.getEmail(), pacient.getAdresa());


            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
