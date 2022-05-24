package programari;

public class ProgramarePacient extends Programare{
    private int pret;

    public ProgramarePacient(String numePacient, String prenumePacient, String numeMedic, String prenumeMedic, String adresaClinica, String dataInceputProgramare, String dataSfarsitProgramare, int numarCabinet, int pret) {
        super(numePacient, prenumePacient, numeMedic, prenumeMedic, adresaClinica, dataInceputProgramare, dataSfarsitProgramare, numarCabinet);
        this.pret = pret;
    }
    public ProgramarePacient()
    {

    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "ProgramarePacient{" +
                "numePacient='" + numePacient + '\'' +
                ", prenumePacient='" + prenumePacient + '\'' +
                ", numeMedic='" + numeMedic + '\'' +
                ", prenumeMedic='" + prenumeMedic + '\'' +
                ", adresaClinica='" + adresaClinica + '\'' +
                ", dataInceputProgramare='" + dataInceputProgramare + '\'' +
                ", dataSfarsitProgramare='" + dataSfarsitProgramare + '\'' +
                ", numarCabinet=" + numarCabinet +
                ", pret=" + pret +
                '}';
    }
}
