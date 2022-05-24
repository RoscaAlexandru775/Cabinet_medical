package pacienti;

import servici.ServiciuLog;

public class Test {

    public static void main(String[] args) {
        ServiciuLog serviciu_log = ServiciuLog.getInstance();
        serviciu_log.scriereInformatii("src\\log.csv", "123");
    }
}
