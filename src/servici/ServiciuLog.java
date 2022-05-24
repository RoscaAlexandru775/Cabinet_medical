package servici;

import com.opencsv.CSVWriter;
import medici.Medic;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiciuLog {
    private static ServiciuLog single_instance = null;

    private ServiciuLog()
    {
    }

    public static ServiciuLog getInstance()
    {
        if (single_instance == null)
            single_instance = new ServiciuLog();

        return single_instance;
    }




    public static void scriereInformatii(String filePath, String mesaj) {

        File file = new File(filePath);
        try {

        FileWriter outputfile = new FileWriter(file,true);

        CSVWriter writer = new CSVWriter(outputfile);

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataEmitere = formatter.format(date);
        String[] myStringArray = new String[]{mesaj, dataEmitere};

        writer.writeNext(myStringArray);
        writer.close();
    }
        catch (IOException e) {
        e.printStackTrace();
    }
    }


}
