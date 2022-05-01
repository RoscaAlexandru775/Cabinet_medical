package servici;

import programari.Programare;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serviciu_Programare {
    private static Serviciu_Programare single_instance = null;

    private Serviciu_Programare()
    {
    }

    public static Serviciu_Programare getInstance()
    {
        if (single_instance == null)
            single_instance = new Serviciu_Programare();

        return single_instance;
    }
    public List<Programare> citireProgramare() {
        List<Programare> list = new ArrayList<>();
        try( var in = new BufferedReader(new FileReader("src\\citireProgramare.csv"))) {
            String line = "";

            while( (line = in.readLine()) != null ) {
                String [] fields = line.replaceAll(" ", "").split(",");
                Programare programare = new Programare(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], Integer.parseInt(fields[7]));
                list.add(programare);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void scriereProgramare(String filePath, Programare programare)
    {

        File file = new File(filePath);
        try {

            FileWriter outputfile = new FileWriter(file);

            PrintWriter out = new PrintWriter(outputfile);

            out.printf("%s, %s, %s, %s, %s, %s, %s, %\n", programare.getNumePacient(), programare.getPrenumePacient(), programare.getNumeMedic(), programare.getPrenumeMedic(), programare.getDataInceputProgramare(), programare.getDataSfarsitProgramare(), programare.getAdresaClinica(), programare.getNumarCabinet());


            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
