package servici;

import cabinete.Cabinet;
import medici.Medic;
import pacienti.Pacient;
import programari.Programare;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class JDBC {

    public static void main(String[] args) {

        JdbcServiciuCabinet jdbcServiciuCabinet = JdbcServiciuCabinet.getInstance();
        JdbcServiciuProgramare jdbcServiciuProgramare = JdbcServiciuProgramare.getInstance();
        JdbcServiciuMedic jdbcServiciuMedic = JdbcServiciuMedic.getInstance();
        JdbcServiciuPacient jdbcServiciuPacient = JdbcServiciuPacient.getInstance();
        ServiciuJDBC serviciuJDBC = ServiciuJDBC.getInstance();
        Medic medic = new Medic();
        //medic = serviciuJDBC.citireMedicJDBC();
        //jdbcServiciuMedic.adaugareMedic(medic);
        //jdbcServiciuMedic.modificareMedic(12, medic);
        // jdbcServiciuMedic.stergereMedic(10);
        List<Medic> medicList = new ArrayList<Medic>();
        medicList = jdbcServiciuMedic.citireMedici();


        jdbcServiciuMedic.scriereMedici("src\\scriereMedic.csv", medicList);

        Pacient pacient = new Pacient();
        //pacient = serviciuJDBC.citirePacientJDBC();
        //jdbcServiciuPacient.adaugarePacient(pacient);
       // jdbcServiciuPacient.modificarePacient(1,pacient);
        //jdbcServiciuPacient.stergerePacient(2);

        List<Pacient> pacientList = new ArrayList<>();
        pacientList = jdbcServiciuPacient.citirePacienti();

        jdbcServiciuPacient.scrierePacienti("src\\scrierePacient.csv",pacientList);

        Programare programare =new Programare();
        //programare =serviciuJDBC.citireProgramareJDBC();
        //jdbcServiciuProgramare.adaugareProgramare(programare);
        //jdbcServiciuProgramare.modificareProgramare(1, programare);
        //jdbcServiciuProgramare.stergereProgramare(1);

        List<Programare> programareList = new ArrayList<>();
        programareList = jdbcServiciuProgramare.citireProgramari();

        jdbcServiciuProgramare.scriereProgramari("src\\scriereProgramare.csv", programareList);


        Cabinet cabinet = new Cabinet();
        cabinet = serviciuJDBC.citireCabinetJDBC();
        //jdbcServiciuCabinet.adaugareCabinet(cabinet);
        jdbcServiciuCabinet.modificareCabinet(1,cabinet);
        jdbcServiciuCabinet.stergereCabinet(2);

        SortedSet<Cabinet> cabinetSortedSet = new TreeSet<>();
        cabinetSortedSet = jdbcServiciuCabinet.citireCabinete();

        jdbcServiciuCabinet.scriereCabinete("src\\scriereCabinet.csv", cabinetSortedSet);
    }


}
