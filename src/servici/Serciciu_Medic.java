package servici;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import medici.Medic;
import programari.Programare;


public class Serciciu_Medic {
    private static Serciciu_Medic single_instance = null;

    private Serciciu_Medic()
    {
    }

    public static Serciciu_Medic getInstance()
    {
        if (single_instance == null)
            single_instance = new Serciciu_Medic();

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

    public static void scriereMedic(String filePath, Medic medic)
    {

        File file = new File(filePath);
        try {

            FileWriter outputfile = new FileWriter(file);

            PrintWriter out = new PrintWriter(outputfile);

            out.printf("%s, %s, %s, %s, %s, %s, %s, %s\n", medic.getNume(), medic.getPrenume(), medic.getGen(), medic.getDataNastere(), medic.getCnp(), medic.getEmail(), medic.getAdresa(), medic.getSpecilizare());


            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
