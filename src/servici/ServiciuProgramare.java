package servici;

import com.opencsv.CSVWriter;
import programari.Programare;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServiciuProgramare {
    private static ServiciuProgramare single_instance = null;

    private ServiciuProgramare()
    {
    }

    public static ServiciuProgramare getInstance()
    {
        if (single_instance == null)
            single_instance = new ServiciuProgramare();

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
