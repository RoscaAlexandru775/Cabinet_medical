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

        Integer x = scanner.nextInt();
        scanner.nextLine();

        switch (x){
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
        }

   }
}
