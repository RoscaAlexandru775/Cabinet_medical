package pacienti;
import cabinete.Cabinet;
import facturi.Factura;
import medici.Medic;
import programari.Programare;
import servici.*;

import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        List<Pacient> pacientList = new ArrayList<Pacient>();
        List<Medic> medicList = new ArrayList<Medic>();
        List<Factura> facturaList = new ArrayList<Factura>();
        List<Programare> programareList = new ArrayList<Programare>();

        SortedSet<Cabinet> cabinetSortedSet = new TreeSet<Cabinet>();

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

        if(x==1)
        {
            Serviciu.adaugarePacient(pacientList);
        }
        if(x==2)
        {
            Serviciu.modificareDatePacient(pacient);
        }
        if(x==3)
        {
             Serviciu.adaugareMedic(medicList);
        }
        if(x==4)
        {
            Serviciu.modificareDateMedic(new Medic());
        }
        if(x==5)
        {
            Serviciu.adaugareCabinet(cabinetSortedSet);
        }
        if(x==6)
        {
            Serviciu.creareFactura(facturaList);
        }

        if(x==7)
        {
            Serviciu.plataAbonament(pacientAbonat);
        }
        if(x==8)
        {
            Serviciu.creareProgramare(programareList);
        }
        if(x==9)
        {
            Serviciu.afisareProgramarePacient(programareList);
        }
        if(x==10)
        {
            Serviciu.afisareProgramareMedic(programareList);
        }
        if(x==11)
        {
            Serviciu.afisareCabinet(cabinetSortedSet);
        }

    }
}
