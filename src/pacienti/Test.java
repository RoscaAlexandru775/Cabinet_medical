package pacienti;

import programari.Programare;
import servici.Serviciu_Programare;
import servici.Serviciu_log;

public class Test {

    public static void main(String[] args) {
        Serviciu_log serviciu_log = Serviciu_log.getInstance();
        serviciu_log.scriereInformatii("src\\log.csv", "123");
    }
}
