package servici;

import cabinete.Cabinet;
import medici.Medic;
import pacienti.Pacient;
import pacienti.PacientAbonat;
import programari.Programare;
import programari.ProgramareMedic;
import programari.ProgramarePacient;

import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;

public class ServiciuJDBC {
    private static ServiciuJDBC single_instance = null;

    private ServiciuJDBC()
    {
    }

    public static ServiciuJDBC getInstance()
    {
        if (single_instance == null)
            single_instance = new ServiciuJDBC();

        return single_instance;
    }
    public Medic citireMedicJDBC() {
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

        return medic;
    }
    public Pacient citirePacientJDBC() {

            Scanner scanner = new Scanner(System.in);

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

           return pacient;


    }
    public Programare citireProgramareJDBC (){

        Scanner scanner = new Scanner(System.in);

        Programare programare = new Programare();


        System.out.println("Nume pacient");
        String nume = scanner.nextLine();
        programare.setNumePacient(nume);


        System.out.println("Prenume pacient");
        String prenume = scanner.nextLine();
        programare.setPrenumePacient(prenume);


        System.out.println("Nume medic");
        String nume1 = scanner.nextLine();
        programare.setNumeMedic(nume1);


        System.out.println("Prenume medic");
        String prenume1 = scanner.nextLine();
        programare.setPrenumeMedic(prenume1);

        System.out.println("Adresa clinica");
        String adresa = scanner.nextLine();
        programare.setAdresaClinica(adresa);

        System.out.println("Data inceput programare (zz/mm/yyyy hh:mm");
        String data = scanner.nextLine();
        programare.setDataInceputProgramare(data);

        System.out.println("Data sfarsit programare (zz/mm/yyyy hh:mm");
        String data1 = scanner.nextLine();
        programare.setDataSfarsitProgramare(data1);

        System.out.println("Numar cabinet");
        Integer nr = scanner.nextInt();
        scanner.nextLine();
        programare.setNumarCabinet(nr);


        return  programare;
    }
    public Cabinet citireCabinetJDBC (){

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

//        System.out.println("Numar cabinet: " + cabinet.getNumar());
//        System.out.println("Etaj cabinet: " + cabinet.getEtaj());
//        System.out.println("Sectie cabinet: " + cabinet.getSectie());

        return  cabinet;

    }
}
