package servici;
import cabinete.Cabinet;
import facturi.Factura;
import medici.Medic;
import pacienti.Pacient;
import pacienti.PacientAbonat;
import programari.Programare;
import servici.*;

import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {


        //incarcare date din fisiere
        ServiciuJDBC serviciuJDBC = ServiciuJDBC.getInstance();
        ServiciuPacient serviciuPacient = ServiciuPacient.getInstance();
        ServiciuMedic serviciuMedic = ServiciuMedic.getInstance();
        ServiciuCabinet serviciuCabinet = ServiciuCabinet.getInstance();
        ServiciuProgramare serviciuProgramare = ServiciuProgramare.getInstance();
        ServiciuLog serviciuLog = ServiciuLog.getInstance();



        Scanner scanner = new Scanner(System.in);
        List<Pacient> pacientList = new ArrayList<Pacient>();
        List<Medic> medicList = new ArrayList<Medic>();
        List<Factura> facturaList = new ArrayList<Factura>();
        List<Programare> programareList = new ArrayList<Programare>();

        SortedSet<Cabinet> cabinetSortedSet = new TreeSet<>();


        pacientList = serviciuPacient.citirePacient();
        medicList = serviciuMedic.citireMedic();
        cabinetSortedSet = serviciuCabinet.citireCabinet();
        programareList = serviciuProgramare.citireProgramare();

        serviciuPacient.scrierePacienti("src\\scrierePacient.csv", pacientList);
        serviciuLog.scriereInformatii("src\\scriereLog.csv", "scriere pacienti csv");
        serviciuMedic.scriereMedici("src\\scriereMedic.csv", medicList);
        serviciuLog.scriereInformatii("src\\scriereLog.csv", "scriere medici csv");
        serviciuCabinet.scriereCabinet("src\\scriereCabinet.csv", cabinetSortedSet);
        serviciuLog.scriereInformatii("src\\scriereLog.csv", "scriere cabinete csv");
        serviciuProgramare.scriereProgramari("src\\scriereProgramare.csv", programareList);
        serviciuLog.scriereInformatii("src\\scriereLog.csv", "scriere programari csv");


        Pacient pacient = new Pacient();
        PacientAbonat pacientAbonat = new PacientAbonat("daniel","popa","Mascilin","19/09/1992","9483874344","B","daniel@yahoo.com","Sector 5","10/10/2020","10/10/2023","standard",10);


        JdbcServiciuPacient jdbcServiciuPacient = JdbcServiciuPacient.getInstance();
        JdbcServiciuMedic jdbcServiciuMedic = JdbcServiciuMedic.getInstance();
        JdbcServiciuCabinet jdbcServiciuCabinet = JdbcServiciuCabinet.getInstance();
        JdbcServiciuProgramare jdbcServiciuProgramare = JdbcServiciuProgramare.getInstance();

        boolean activ = true;
        while (activ) {
            System.out.println("Prelucrare date csv: 1");
            System.out.println("Prelucrare date baza de date: 2");

            Integer x = scanner.nextInt();
            scanner.nextLine();

            switch (x) {
                case 1:
                    System.out.println("Pentru adaugarea unui pacient apasati 1");
                    System.out.println("Pentru modificarea datelor unui pacient apasati 2");
                    System.out.println("Pentru adaugarea unui medic apasati 3");
                    System.out.println("Pentru  modificarea datelor unui medic apasati 4");
                    System.out.println("Pentru adaugarea unui cabinet apasati 5");
                    System.out.println("Pentru crearea unei facturi apasati 6");
                    System.out.println("Pentru crearea unei programari apasati 7");
                    System.out.println("Pentru plata unui abonament al unui pacient apasati 8");
                    System.out.println("Pentru afisarea programarilor unui pacient apasati 9");
                    System.out.println("Pentru afisarea programarilor unui medic apasati 10");
                    System.out.println("Pentru afisarea informatiilor unui cabinet apasati 11");
                    System.out.println("Pentru oprirea programului apasati 12");
                    Integer y = scanner.nextInt();
                    scanner.nextLine();

                    switch (y) {
                        case 1:
                            serviciuLog.scriereInformatii("src\\log.csv", "Adaugare pacient");
                            Serviciu.adaugarePacient(pacientList);
                            break;
                        case 2:
                            serviciuLog.scriereInformatii("src\\log.csv", "Modificare date pacient");
                            Serviciu.modificareDatePacient(pacient);
                            break;
                        case 3:
                            serviciuLog.scriereInformatii("src\\log.csv", "Adaugare medic");
                            Serviciu.adaugareMedic(medicList);
                            break;
                        case 4:
                            serviciuLog.scriereInformatii("src\\log.csv", "Modificare date medic");
                            Serviciu.modificareDateMedic(new Medic());
                            break;
                        case 5:
                            serviciuLog.scriereInformatii("src\\log.csv", "Adaugare cabinet");
                            Serviciu.adaugareCabinet(cabinetSortedSet);
                            break;
                        case 6:
                            serviciuLog.scriereInformatii("src\\log.csv", "Creare factura");
                            Serviciu.creareFactura(facturaList);
                            break;
                        case 7:
                            serviciuLog.scriereInformatii("src\\log.csv", "Creare proramari");
                            Serviciu.plataAbonament(pacientAbonat);
                            break;
                        case 8:
                            serviciuLog.scriereInformatii("src\\log.csv", "Plata abonament");
                            Serviciu.creareProgramare(programareList);
                            break;
                        case 9:
                            serviciuLog.scriereInformatii("src\\log.csv", "Afisare programare pacient");
                            Serviciu.afisareProgramarePacient(programareList);
                            break;
                        case 10:
                            serviciuLog.scriereInformatii("src\\log.csv", "Afisare programare medic");
                            Serviciu.afisareProgramareMedic(programareList);
                            break;
                        case 11:
                            serviciuLog.scriereInformatii("src\\log.csv", "Afisare informatii cabinet");
                            Serviciu.afisareCabinet(cabinetSortedSet);
                            break;
                        case 12:
                            activ = false;
                    }
                    break;

                case 2:
                    System.out.println("Pentru adaugarea unui pacient apasati 1");
                    System.out.println("Pentru modificarea datelor unui pacient apasati 2");
                    System.out.println("Pentru adaugarea unui medic apasati 3");
                    System.out.println("Pentru  modificarea datelor unui medic apasati 4");
                    System.out.println("Pentru adaugarea unui cabinet apasati 5");
                    System.out.println("Pentru stergerea unui cabinet apasati 6");
                    System.out.println("Pentru afisarea informatiilor unui cabinet apasati 7");
                    System.out.println("Pentru crearea unei programari apasati 8");
                    System.out.println("Pentru oprirea programului apasati 12");
                    Integer z = scanner.nextInt();
                    scanner.nextLine();

                    switch (z) {
                        case 1:
                            serviciuLog.scriereInformatii("src\\log.csv", "Adaugare pacient DB");
                            Pacient pacient1 = serviciuJDBC.citirePacientJDBC();
                            jdbcServiciuPacient.adaugarePacient(pacient1);
                            System.out.println("Pacient adaugat cu succes");
                            break;
                        case 2:
                            serviciuLog.scriereInformatii("src\\log.csv", "Modificare date pacient DB");
                            pacient1 = serviciuJDBC.citirePacientJDBC();
                            System.out.println("Id-ul pacientului");
                            Integer id = scanner.nextInt();
                            scanner.nextLine();

                            if(jdbcServiciuPacient.modificarePacient(id, pacient1))
                            {
                                System.out.println("Pacient modificat cu succes");
                            }
                            else
                            {
                                System.out.println("Nu s-a gasi nicium pacient cu id-ul "+ id);
                            }

                            break;
                        case 3:
                            serviciuLog.scriereInformatii("src\\log.csv", "Adaugare medic DB");
                            Medic medic = serviciuJDBC.citireMedicJDBC();
                            jdbcServiciuMedic.adaugareMedic(medic);
                            System.out.println("Medic adaugat cu succes");
                            break;
                        case 4:
                            serviciuLog.scriereInformatii("src\\log.csv", "Modificare date medic DB");
                            medic =serviciuJDBC.citireMedicJDBC();
                            System.out.println("Id-ul medicului");
                            id = scanner.nextInt();
                            scanner.nextLine();

                            if(jdbcServiciuMedic.modificareMedic(id, medic))
                            {
                                System.out.println("Medic modificat cu succes");
                            }
                            else
                            {
                                System.out.println("Nu s-a gasi nicium medic cu id-ul "+ id);
                            }

                            break;
                        case 5:
                            serviciuLog.scriereInformatii("src\\log.csv", "Adaugare cabinet DB");
                            Cabinet cabinet = serviciuJDBC.citireCabinetJDBC();
                            jdbcServiciuCabinet.adaugareCabinet(cabinet);
                            System.out.println("Cabinet adaugat cu succes");
                            break;
                        case 6:
                            serviciuLog.scriereInformatii("src\\log.csv", "Stergere cabinet DB");
                            id = scanner.nextInt();
                            scanner.nextLine();
                            jdbcServiciuCabinet.stergereCabinet(id);
                            System.out.println("Cabinetul numai este in baza de date");

                        case 7:
                            serviciuLog.scriereInformatii("src\\log.csv", "Afisare informatii cabinete DB");
                            SortedSet<Cabinet> sortedSet =  jdbcServiciuCabinet.citireCabinete();
                            for(Cabinet cabinet1: sortedSet)
                            {
                                System.out.println(cabinet1.toString());
                            }
                            break;
                        case 8:
                            serviciuLog.scriereInformatii("src\\log.csv", "adaugare programare DB");
                            Programare programare =serviciuJDBC.citireProgramareJDBC();
                            if(jdbcServiciuProgramare.adaugareProgramare(programare))
                                System.out.println("Programare adaugata cu succes");
                            else
                                System.out.println("Numele pacientului sau numele medicului nu corespund cu baza de date");
                            break;
                        case 12:
                            activ = false;
                    }
                    break;

            }

        }
   }
}
