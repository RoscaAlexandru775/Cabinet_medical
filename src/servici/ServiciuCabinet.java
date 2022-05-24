package servici;

import cabinete.Cabinet;
import com.opencsv.CSVWriter;
import pacienti.Pacient;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ServiciuCabinet {
    private static ServiciuCabinet single_instance = null;

    private ServiciuCabinet()
    {
    }

    public static ServiciuCabinet getInstance()
    {
        if (single_instance == null)
            single_instance = new ServiciuCabinet();

        return single_instance;
    }
    public SortedSet<Cabinet>  citireCabinet() {
        SortedSet<Cabinet> cabinetSortedSet = new TreeSet<Cabinet>();
        try( var in = new BufferedReader(new FileReader("src\\citireCabinet.csv"))) {
            String line = "";

            while( (line = in.readLine()) != null ) {
                String [] fields = line.replaceAll(" ", "").split(",");
                Cabinet cabinet = new Cabinet(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2]);
                cabinetSortedSet.add(cabinet);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return  cabinetSortedSet;
    }
    public static void scriereCabinet(String filePath, SortedSet<Cabinet> cabinetSortedSet)
    {

        File file = new File(filePath);
        try {

            FileWriter outputfile = new FileWriter(file);

            CSVWriter writer = new CSVWriter(outputfile);
            String[] header = {"index", "numar", "etaj", "sectie"};
            writer.writeNext(header);
            List<String[]> data = new ArrayList<String[]>();
            Integer i = 0;
            for (Cabinet cabinet: cabinetSortedSet) {
                i++;
                Integer cabinetNumar = cabinet.getNumar();
                Integer cabinetEtaj = cabinet.getEtaj();
                String[] myStringArray = new String[]{Integer.toString(i) ,cabinetNumar.toString(), cabinetEtaj.toString(), cabinet.getSectie()};
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
