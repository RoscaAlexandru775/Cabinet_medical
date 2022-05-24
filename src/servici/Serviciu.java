package servici;
import cabinete.*;
import facturi.*;
import medici.*;
import pacienti.*;
import programari.Programare;
import programari.ProgramareMedic;
import programari.ProgramarePacient;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Serviciu {

    public static void adaugarePacient(List<Pacient> pacientList) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tip pacient: 1)normal, 2)abonat");
        Integer tip = scanner.nextInt();
        scanner.nextLine();

        if( tip == 1)
        {
            Pacient pacient = new Pacient();

            System.out.println("Nume pacient ");
            String nume = scanner.nextLine();
            pacient.setNume(nume);

            System.out.println("Prenume pacient ");
            String prenume = scanner.nextLine();
            pacient.setPrenume(prenume);

            System.out.println("Genul pacientului: Feminin/Masculin");
            String gen = scanner.nextLine();
            pacient.setGen(gen);

            System.out.println("Data nastere pacient(zz/ll/aaaa)");
            String dataNastere = scanner.nextLine();
            pacient.setDataNastere(dataNastere);

            System.out.println("Cod numeric personal(13 cifre)");
            String cnp = scanner.nextLine();
            pacient.setCnp(cnp);

            System.out.println("Grupa Sanguina a pacientului(A/B/AB/0)");
            String grupaSanguina = scanner.nextLine();
            pacient.setGrupaSanguina(grupaSanguina);

            System.out.println("Email pacient");
            String email = scanner.nextLine();
            pacient.setEmail(email);

            System.out.println("Adresa pacient");
            String adresa = scanner.nextLine();
            pacient.setAdresa(adresa);


//            System.out.println("Nume: " + pacient.getNume());
//            System.out.println("Prenume: " + pacient.getPrenume());
//            System.out.println("Gen: " + pacient.getGen());
//            System.out.println("Data nastere: " + pacient.getDataNastere());
//            System.out.println("Cnp: " + pacient.getCnp());
//            System.out.println("Grupa sanguina: " + pacient.getGrupaSanguina());
//            System.out.println("Email pacient: " + pacient.getEmail());
//            System.out.println("Adresa pacient: " + pacient.getAdresa());

            //adugarea in lista
            pacientList.add(pacient);
        }
        else
        {
            PacientAbonat pacient = new PacientAbonat();

            System.out.println("Nume pacient ");
            String nume = scanner.nextLine();

            pacient.setNume(nume);

            System.out.println("Prenume pacient ");
            String prenume = scanner.nextLine();
            pacient.setPrenume(prenume);

            System.out.println("Genul pacientului: Feminin/Masculin");
            String gen = scanner.nextLine();
            pacient.setGen(gen);

            System.out.println("Data nastere pacient(zz/ll/aaaa)");
            String dataNastere = scanner.nextLine();
            pacient.setDataNastere(dataNastere);

            System.out.println("Cod numeric personal(13 cifre)");
            String cnp = scanner.nextLine();
            pacient.setCnp(cnp);

            System.out.println("Grupa Sanguina a pacientului(A/B/AB/0)");
            String grupaSanguina = scanner.nextLine();
            pacient.setGrupaSanguina(grupaSanguina);

            System.out.println("Email pacient");
            String email = scanner.nextLine();
            pacient.setEmail(email);

            System.out.println("Adresa pacient");
            String adresa = scanner.nextLine();
            pacient.setAdresa(adresa);

            System.out.println("Data inceput abonament:");
            String dataInceputAbonament = scanner.nextLine();
            pacient.setDataIneputAbonament(dataInceputAbonament);

            System.out.println("Data sfarsit abonament:");
            String dataSfarsitAbonament = scanner.nextLine();
            pacient.setDataSfarsitAbonament(dataSfarsitAbonament);

            System.out.println("Tip abonament(Standard/Premium)");
            String tipAbonament = scanner.nextLine();
            pacient.setTipAbonament(tipAbonament);

            System.out.println("Procent discount(10%/20%) ");
            Integer procent = scanner.nextInt();
            pacient.setProcentDiscount(procent);

//            System.out.println("Nume: " + pacient.getNume());
//            System.out.println("Prenume: " + pacient.getPrenume());
//            System.out.println("Gen: " + pacient.getGen());
//            System.out.println("Data nastere: " + pacient.getDataNastere());
//            System.out.println("Cnp: " + pacient.getCnp());
//            System.out.println("Grupa sanguina: " + pacient.getGrupaSanguina());
//            System.out.println("Email pacient: " + pacient.getEmail());
//            System.out.println("Adresa pacient: " + pacient.getAdresa());
//            System.out.println("Data inceput abonament: " + pacient.getDataIneputAbonament());
//            System.out.println("Data sfarsit abonament: " + pacient.getDataSfarsitAbonament());
//            System.out.println("Tip abonament: " + pacient.getTipAbonament());
//            System.out.println("Procent discount: " + pacient.getProcentDiscount());

            //adaugarea in lista
            pacientList.add(pacient);
        }
        }
    public static void modificareDatePacient(Pacient pacient) {

        Scanner scanner = new Scanner(System.in);

        if(pacient.getClass() == Pacient.class)
        {
            System.out.println("Daca nu vreti sa modificati campul respectiv apasati enter");
            System.out.println("Nume pacient");
            String nume = scanner.nextLine();
            if(!nume.equals(""))
            {
                pacient.setNume(nume);
            }

            System.out.println("Prenume pacient");
            String prenume = scanner.nextLine();
            if(prenume != "")
            {
                pacient.setPrenume(prenume);
            }

            System.out.println("Genul pacientului (Masculuin/Feminin)");
            String gen = scanner.nextLine();
            if(gen != "")
            {
                pacient.setGen(gen);
            }

            System.out.println("Data nastere pacient(zz/ll/aaaa)");
            String data = scanner.nextLine();
            if(data != "")
            {
                pacient.setDataNastere(data);
            }

            System.out.println("Cod numeric personal(13 cifre)");
            String cnp = scanner.nextLine();
            if(cnp != "")
            {
                pacient.setCnp(cnp);
            }

            System.out.println("Grupa Sanguina a pacientului(A/B/AB/0)");
            String grupaSanguina = scanner.nextLine();
            if(grupaSanguina != "")
            {
                pacient.setGrupaSanguina(grupaSanguina);
            }

            System.out.println("Email pacient");
            String email = scanner.nextLine();
            if(email != "")
            {
                pacient.setEmail(email);
            }

            System.out.println("Adresa pacient");
            String adresa = scanner.nextLine();
            if(adresa != "")
            {
                pacient.setAdresa(adresa);
            }


            System.out.println("Nume: " + pacient.getNume());
            System.out.println("Prenume: " + pacient.getPrenume());
            System.out.println("Gen: " + pacient.getGen());
            System.out.println("Data nastere: " + pacient.getDataNastere());
            System.out.println("Cnp: " + pacient.getCnp());
            System.out.println("Grupa sanguina: " + pacient.getGrupaSanguina());
            System.out.println("Email pacient: " + pacient.getEmail());
            System.out.println("Adresa pacient: " + pacient.getAdresa());

        }

        else if(pacient.getClass() == PacientAbonat.class) {

            PacientAbonat pacientAbonat = (PacientAbonat) pacient;
            System.out.println("Pacient abonat");
            System.out.println("Daca nu vreti sa modificati campul respectiv apasati enter");
            System.out.println("Nume pacient");
            String nume = scanner.nextLine();
            if (nume != "") {
                pacientAbonat.setNume(nume);
            }

            System.out.println("Prenume pacient");
            String prenume = scanner.nextLine();
            if (prenume != "") {
                pacientAbonat.setPrenume(prenume);
            }

            System.out.println("Genul pacientului (Masculuin/Feminin)");
            String gen = scanner.nextLine();
            if (gen != "") {
                pacientAbonat.setGen(gen);
            }

            System.out.println("Data nastere pacient(zz/ll/aaaa)");
            String data = scanner.nextLine();
            if (data != "") {
                pacientAbonat.setDataNastere(data);
            }

            System.out.println("Cod numeric personal(13 cifre)");
            String cnp = scanner.nextLine();
            if (cnp != "") {
                pacientAbonat.setCnp(cnp);
            }

            System.out.println("Grupa Sanguina a pacientului(A/B/AB/0)");
            String grupaSanguina = scanner.nextLine();
            if (grupaSanguina != "") {
                pacientAbonat.setGrupaSanguina(grupaSanguina);
            }

            System.out.println("Email pacient");
            String email = scanner.nextLine();
            if (email != "") {
                pacientAbonat.setEmail(email);
            }

            System.out.println("Adresa pacient");
            String adresa = scanner.nextLine();
            if (adresa != "") {
                pacientAbonat.setAdresa(adresa);
            }

            System.out.println("Data inceput abonament:");
            String dataInceputAbonament = scanner.nextLine();
            if(dataInceputAbonament != "")
            {
                pacientAbonat.setDataIneputAbonament(dataInceputAbonament);
            }
            System.out.println("Data sfarsit abonament:");
            String dataSfarsitAbonament = scanner.nextLine();
            if(dataSfarsitAbonament != "")
            {
                pacientAbonat.setDataSfarsitAbonament(dataSfarsitAbonament);
            }

            System.out.println("Tip abonament(Standard/Premium)");
            String tipAbonament = scanner.nextLine();
            if(tipAbonament != "")
            {
                pacientAbonat.setTipAbonament(tipAbonament);
            }

            System.out.println("Daca nu vreti sa schimbati procentul scrieti 0");
            System.out.println("Procent discount(10%/20%) ");
            Integer procent = scanner.nextInt();
            scanner.nextLine();
            if(procent != 0)
            {
                pacientAbonat.setProcentDiscount(procent);
            }

//            System.out.println("Nume: " + pacientAbonat.getNume());
//            System.out.println("Prenume: " + pacientAbonat.getPrenume());
//            System.out.println("Gen: " + pacientAbonat.getGen());
//            System.out.println("Data nastere: " + pacientAbonat.getDataNastere());
//            System.out.println("Cnp: " + pacientAbonat.getCnp());
//            System.out.println("Grupa sanguina: " + pacientAbonat.getGrupaSanguina());
//            System.out.println("Email pacient: " + pacientAbonat.getEmail());
//            System.out.println("Adresa pacient: " + pacientAbonat.getAdresa());
//            System.out.println("Data inceput abonament: " + pacientAbonat.getDataIneputAbonament());
//            System.out.println("Data sfarsit abonament: " + pacientAbonat.getDataSfarsitAbonament());
//            System.out.println("Tip abonament: " + pacientAbonat.getTipAbonament());
//            System.out.println("Procent discount: " + pacientAbonat.getProcentDiscount());

        }

    }
    public static void adaugareMedic(List<Medic> medicList) {
        Scanner scanner = new Scanner(System.in);

        Medic medic = new Medic();

        System.out.println("Nume medic ");
        String nume = scanner.nextLine();
        medic.setNume(nume);

        System.out.println("Prenume medic ");
        String prenume = scanner.nextLine();
        medic.setPrenume(prenume);

        System.out.println("Genul medicului: Feminin/Masculin");
        String gen = scanner.nextLine();
        medic.setGen(gen);

        System.out.println("Data nastere medic(zz/ll/aaaa)");
        String dataNastere = scanner.nextLine();
        medic.setDataNastere(dataNastere);

        System.out.println("Cod numeric personal(13 cifre)");
        String cnp = scanner.nextLine();
        medic.setCnp(cnp);


        System.out.println("Email medic");
        String email = scanner.nextLine();
        medic.setEmail(email);

        System.out.println("Adresa medic");
        String adresa = scanner.nextLine();
        medic.setAdresa(adresa);

        System.out.println("Specializare medic");
        String specializare = scanner.nextLine();
        medic.setSpecilizare(specializare);

//        System.out.println("Nume: " + medic.getNume());
//        System.out.println("Prenume: " + medic.getPrenume());
//        System.out.println("Gen: " + medic.getGen());
//        System.out.println("Data nastere: " + medic.getDataNastere());
//        System.out.println("Cnp: " + medic.getCnp());
//        System.out.println("Email medic: " + medic.getEmail());
//        System.out.println("Adresa medic: " + medic.getAdresa());
//        System.out.println("Specializare medic: " + medic.getSpecilizare());

        medicList.add(medic);
    }
    public static void afisareMedic(List<Medic> medicList) {
        Scanner scanner = new Scanner(System.in);

        Medic medic = new Medic();

        System.out.println("Nume: " + medic.getNume());
        System.out.println("Prenume: " + medic.getPrenume());
        System.out.println("Gen: " + medic.getGen());
        System.out.println("Data nastere: " + medic.getDataNastere());
        System.out.println("Cnp: " + medic.getCnp());
        System.out.println("Email medic: " + medic.getEmail());
        System.out.println("Adresa medic: " + medic.getAdresa());
        System.out.println("Specializare medic: " + medic.getSpecilizare());


    }
    public static void modificareDateMedic (Medic medic) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Daca nu vreti sa modificati campul respectiv apasati enter");
        System.out.println("Nume medic ");
        String nume = scanner.nextLine();
        if(nume != "") {
            medic.setNume(nume);
        }

        System.out.println("Prenume medic ");
        String prenume = scanner.nextLine();
        if(prenume != "")
        {
            medic.setPrenume(prenume);
        }

        System.out.println("Genul medicului: Feminin/Masculin");
        String gen = scanner.nextLine();
        if(gen != "")
        {
            medic.setGen(gen);
        }

        System.out.println("Data nastere medic(zz/ll/aaaa)");
        String dataNastere = scanner.nextLine();
        if (dataNastere != "")
        {
            medic.setDataNastere(dataNastere);
        }

        System.out.println("Cod numeric personal(13 cifre)");
        String cnp = scanner.nextLine();
        if(cnp != "")
        {
            medic.setCnp(cnp);
        }


        System.out.println("Email medic");
        String email = scanner.nextLine();
        if(email != "")
        {
            medic.setEmail(email);
        }

        System.out.println("Adresa medic");
        String adresa = scanner.nextLine();
        if(adresa != "")
        {
            medic.setAdresa(adresa);
        }

        System.out.println("Specializare medic");
        String specializare = scanner.nextLine();
        if(specializare != "")
        {
            medic.setSpecilizare(specializare);
        }

        System.out.println("Nume: " + medic.getNume());
        System.out.println("Prenume: " + medic.getPrenume());
        System.out.println("Gen: " + medic.getGen());
        System.out.println("Data nastere: " + medic.getDataNastere());
        System.out.println("Cnp: " + medic.getCnp());
        System.out.println("Email medic: " + medic.getEmail());
        System.out.println("Adresa medic: " + medic.getAdresa());
        System.out.println("Specializare medic: " + medic.getSpecilizare());

    }
    public static void creareFactura(List<Factura> facturaList){
        Scanner scanner = new Scanner(System.in);

        Factura factura = new Factura();

        System.out.println("Metoda de Plata");
        String metodaDePlata = scanner.nextLine();
        factura.setMetodaDePlata(metodaDePlata);

        System.out.println("Nume pacient");
        String numePacient = scanner.nextLine();
        factura.setNumePacient(numePacient);

        System.out.println("Prenume pacient");
        String prenumePacient = scanner.nextLine();
        factura.setPrenumePacient(prenumePacient);

        System.out.println("Nume medic");
        String numeMedic = scanner.nextLine();
        factura.setNumeMedic(numeMedic);

        System.out.println("Prenume medic");
        String prenumeMedic = scanner.nextLine();
        factura.setPrenumeMedic(prenumeMedic);

        Date date = new Date();
        SimpleDateFormat formatter =  new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataEmitere = formatter.format(date);

        factura.setDataEmitere(dataEmitere);

        System.out.println("Nume serviciu");
        String numeServiciu = scanner.nextLine();
        factura.setNumeServiciu(numeServiciu);

        System.out.println("Pret");
        double pret = scanner.nextDouble();
        scanner.nextLine();
        factura.setPret(pret);

        double tva = 0.19 * pret;
        factura.setTva(tva);

        double total = pret + tva;
        factura.setTotalDePlata(total);


        System.out.println("Metoda de plata: " + factura.getMetodaDePlata());
        System.out.println("Nume pacient: " + factura.getNumePacient());
        System.out.println("Prenume pacient: " + factura.getPrenumePacient());
        System.out.println("Nume medic: " + factura.getNumeMedic());
        System.out.println("Prenume medic: " + factura.getPrenumeMedic());
        System.out.println("Data emitere factura: " + factura.getDataEmitere());
        System.out.println("Nume serviciu: " + factura.getNumeServiciu());
        System.out.println("Pret: " + factura.getPret());
        System.out.println("TVA: " + factura.getTva());
        System.out.println("Total: " + factura.getTotalDePlata());

        facturaList.add(factura);
    }
    public static void creareProgramare ( List<Programare> programareList){

        Scanner scanner = new Scanner(System.in);

        ProgramarePacient programarePacient = new ProgramarePacient();
        ProgramareMedic programareMedic = new ProgramareMedic();

        System.out.println("Nume pacient");
        String nume = scanner.nextLine();
        programarePacient.setNumePacient(nume);
        programareMedic.setNumePacient(nume);

        System.out.println("Prenume pacient");
        String prenume = scanner.nextLine();
        programarePacient.setPrenumePacient(prenume);
        programareMedic.setPrenumePacient(prenume);


        System.out.println("Nume medic");
        String nume1 = scanner.nextLine();
        programarePacient.setNumeMedic(nume1);
        programareMedic.setNumeMedic(nume1);

        System.out.println("Prenume medic");
        String prenume1 = scanner.nextLine();
        programarePacient.setPrenumeMedic(prenume1);
        programareMedic.setPrenumeMedic(prenume1);

        System.out.println("Adresa clinica");
        String adresa = scanner.nextLine();
        programarePacient.setAdresaClinica(adresa);
        programareMedic.setAdresaClinica(adresa);

        System.out.println("Data inceput programare (zz/mm/yyyy hh:mm");
        String data = scanner.nextLine();
        programarePacient.setDataInceputProgramare(data);
        programareMedic.setDataInceputProgramare(data);

        System.out.println("Data sfarsit programare (zz/mm/yyyy hh:mm");
        String data1 = scanner.nextLine();
        programarePacient.setDataSfarsitProgramare(data1);
        programareMedic.setDataSfarsitProgramare(data1);

        System.out.println("Numar cabinet");
        Integer nr = scanner.nextInt();
        scanner.nextLine();
        programarePacient.setNumarCabinet(nr);
        programareMedic.setNumarCabinet(nr);

        System.out.println("Pret consultatie");
        Integer pret = scanner.nextInt();
        scanner.nextLine();
        programarePacient.setPret(pret);

        System.out.println("Descriere problema pacient");
        String descriere = scanner.nextLine();
        programareMedic.setDescriereProblemaPacient(descriere);



//        System.out.println("Nume pacient: " + programarePacient.getNumePacient());
//        System.out.println("Nume pacient: " + programareMedic.getNumePacient());
//
//        System.out.println("Prenume pacient: " + programarePacient.getPrenumePacient());
//        System.out.println("Prenume pacient: " + programareMedic.getPrenumePacient());
//
//        System.out.println("Nume medic: " + programarePacient.getNumeMedic());
//        System.out.println("Nume medic: " + programareMedic.getNumeMedic());
//
//        System.out.println("Prenume medic: " + programarePacient.getPrenumeMedic());
//        System.out.println("Prenume medic: " + programarePacient.getPrenumeMedic());
//
//        System.out.println("Adresa clinica: " + programarePacient.getAdresaClinica());
//        System.out.println("Adresa clinica: " + programareMedic.getAdresaClinica());
//
//        System.out.println("Data inceput Programare: " + programarePacient.getDataInceputProgramare());
//        System.out.println("Data inceput Programare: " + programareMedic.getDataInceputProgramare());
//
//        System.out.println("Data sfarsit Programare: " + programarePacient.getDataSfarsitProgramare());
//        System.out.println("Data sfarsit Programare: " + programareMedic.getDataSfarsitProgramare());
//
//        System.out.println("Numar cabinet: " + programarePacient.getNumarCabinet());
//        System.out.println("Numar cabinet: " + programareMedic.getNumarCabinet());
//
//        System.out.println("Pret consultatie: " + programarePacient.getPret());
//
//        System.out.println("Descriere problema pacient: " + programareMedic.getDescriereProblemaPacient());

        programareList.add(programarePacient);
        programareList.add(programareMedic);

    }
    public static void plataAbonament(PacientAbonat pacient) throws ParseException {

        //PacientAbonat pacient = new PacientAbonat("daniel","popa","Mascilin","19/09/1992","9483874344","B","daniel@yahoo.com","Sector 5","10/10/2020","10/10/2021","standard",10);

        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(pacient.getDataSfarsitAbonament());
        Date date2 = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String str = formatter.format(date2);

        if(date1.compareTo(date2)>0) {
            System.out.println("Abonament valid");
        }
        else
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Data sfarsit abonament");
            String dataSfarsitAbonament = scanner.nextLine();
            pacient.setDataSfarsitAbonament(dataSfarsitAbonament);


            Date date = new Date();
            SimpleDateFormat formatter2 =  new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String dataEmitere = formatter2.format(date);
            pacient.setDataIneputAbonament(dataEmitere);
            System.out.println("Tip abonament: 1)standard(Pret: 200$) 2)premium(Pret: 300$)");
            Integer tip = scanner.nextInt();
            scanner.nextLine();

            if(tip == 1)
            {

                pacient.setTipAbonament("standard");
                pacient.setProcentDiscount(10);

            }
            else
            {

                pacient.setTipAbonament("premium");
                pacient.setProcentDiscount(20);

            }

        }


    }
    public static void afisareProgramarePacient(List<Programare> programareList) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Nume pacient");
        String nume = scanner.nextLine();
        System.out.println("Prenume pacient");
        String prenume = scanner.nextLine();

        for(Programare programare: programareList)
        {
            if(programare.getClass() == ProgramarePacient.class)
            {
                if(programare.getNumePacient().equals(nume) && programare.getPrenumePacient().equals(prenume))
                {
                    System.out.println("Nume pacient: " + programare.getNumePacient());
                    System.out.println("Prenume pacient: " + programare.getPrenumePacient());
                    System.out.println("Nume medic: " + programare.getNumeMedic());
                    System.out.println("Prenume medic: " + programare.getPrenumeMedic());
                    System.out.println("Adresa clinica: " + programare.getAdresaClinica());
                    System.out.println("Data inceput Programare: " + programare.getDataInceputProgramare());
                    System.out.println("Data sfarsit Programare: " + programare.getDataSfarsitProgramare());
                    System.out.println("Numar cabinet: " + programare.getNumarCabinet());
                    System.out.println("Pret consultatie: " + ((ProgramarePacient) programare).getPret());
                    System.out.println();
                    System.out.println();
                }
            }

        }

    }
    public static void afisareProgramareMedic(List<Programare> programareList) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Nume medic");
        String nume = scanner.nextLine();
        System.out.println("Prenume medic");
        String prenume = scanner.nextLine();

        for(Programare programare: programareList)
        {
            if(programare.getClass() == ProgramareMedic.class)
            {
                if(programare.getNumeMedic().equals(nume) && programare.getPrenumeMedic().equals(prenume))
                {
                    System.out.println("Nume medic: " + programare.getNumeMedic());
                    System.out.println("Prenume medic: " + programare.getPrenumeMedic());
                    System.out.println("Nume pacient: " + programare.getNumePacient());
                    System.out.println("Prenume pacient: " + programare.getPrenumePacient());
                    System.out.println("Adresa clinica: " + programare.getAdresaClinica());
                    System.out.println("Data inceput Programare: " + programare.getDataInceputProgramare());
                    System.out.println("Data sfarsit Programare: " + programare.getDataSfarsitProgramare());
                    System.out.println("Numar cabinet: " + programare.getNumarCabinet());
                    System.out.println("Descriere problema pacient: " + ((ProgramareMedic) programare).getDescriereProblemaPacient());
                    System.out.println();
                    System.out.println();
                }
            }

        }

    }
    public static void adaugareCabinet (SortedSet<Cabinet> cabinetSortedSet){

        Scanner scanner = new Scanner(System.in);

        Cabinet cabinet = new Cabinet();

        System.out.println("Numar cabinnet");
        Integer numar = scanner.nextInt();
        cabinet.setNumar(numar);
        scanner.nextLine();

        System.out.println("Etaj cabinet");
        Integer etaj = scanner.nextInt();
        cabinet.setEtaj(etaj);
        scanner.nextLine();

        System.out.println("Sectie cabinet");
        String sectie = scanner.nextLine();
        cabinet.setSectie(sectie);

        System.out.println("Numar cabinet: " + cabinet.getNumar());
        System.out.println("Etaj cabinet: " + cabinet.getEtaj());
        System.out.println("Sectie cabinet: " + cabinet.getSectie());

        cabinetSortedSet.add(cabinet);

    }
    public static void afisareCabinet(SortedSet<Cabinet> cabinetSortedSet){
        Scanner scanner = new Scanner(System.in);
        Integer numarCabinet = scanner.nextInt();
        scanner.nextLine();

        Iterator<Cabinet> i = cabinetSortedSet.iterator();
        while (i.hasNext()) {

            Cabinet cabinet = i.next();
            if(numarCabinet == cabinet.getNumar()) {
                System.out.println("Numar cabinet: " + cabinet.getNumar());
                System.out.println("Etaj cabinet: " + cabinet.getEtaj());
                System.out.println("Sectie cabinet: " + cabinet.getSectie());
            }
        }
    }

}
