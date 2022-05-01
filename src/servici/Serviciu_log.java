package servici;

import cabinete.Cabinet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Serviciu_log {
    private static Serviciu_log single_instance = null;

    private Serviciu_log()
    {
    }

    public static Serviciu_log getInstance()
    {
        if (single_instance == null)
            single_instance = new Serviciu_log();

        return single_instance;
    }

    public static void scriereInformatii(String filePath, String mesaj)
    {

        File file = new File(filePath);
        try {

            FileWriter outputfile = new FileWriter(file);

            PrintWriter out = new PrintWriter(outputfile);

            Date date = new Date();
            SimpleDateFormat formatter =  new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String dataEmitere = formatter.format(date);

            out.printf("%s, %s \n", mesaj, dataEmitere);


            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
