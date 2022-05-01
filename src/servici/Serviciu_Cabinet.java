package servici;

import cabinete.Cabinet;


import java.io.*;
import java.util.SortedSet;
import java.util.TreeSet;

public class Serviciu_Cabinet {
    private static Serviciu_Cabinet single_instance = null;

    private Serviciu_Cabinet()
    {
    }

    public static Serviciu_Cabinet getInstance()
    {
        if (single_instance == null)
            single_instance = new Serviciu_Cabinet();

        return single_instance;
    }
    public static void  citireCabinet() {
        SortedSet<Cabinet> cabinetSortedSet = new TreeSet<Cabinet>();
        try( var in = new BufferedReader(new FileReader("src\\citireCabinet.csv"))) {
            String line = "";

            while( (line = in.readLine()) != null ) {
                String [] fields = line.replaceAll(" ", "").split(",");
                Cabinet cabinet = new Cabinet(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2]);
                //cabinetSortedSet.add(cabinet);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
       // return  cabinetSortedSet;
    }
    public static void scrierePacient(String filePath, Cabinet cabinet)
    {

        File file = new File(filePath);
        try {

            FileWriter outputfile = new FileWriter(file);

            PrintWriter out = new PrintWriter(outputfile);

            out.printf("%d, %d, %s \n", cabinet.getNumar(), cabinet.getEtaj(), cabinet.getSectie());


            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
