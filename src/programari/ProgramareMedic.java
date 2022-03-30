package programari;

public class ProgramareMedic extends Programare{
    private String descriereProblemaPacient;

    public ProgramareMedic(String numePacient, String prenumePacient, String numeMedic, String prenumeMedic, String adresaClinica, String dataInceputProgramare, String dataSfarsitProgramare, int numarCabinet, String descriereProblemaPacient) {

        super(numePacient, prenumePacient, numeMedic, prenumeMedic, adresaClinica, dataInceputProgramare, dataSfarsitProgramare, numarCabinet);
        this.descriereProblemaPacient = descriereProblemaPacient;
    }
    public ProgramareMedic()
    {

    }
    public String getDescriereProblemaPacient() {
        return descriereProblemaPacient;
    }

    public void setDescriereProblemaPacient(String descriereProblemaPacient) {
        this.descriereProblemaPacient = descriereProblemaPacient;
    }
}
