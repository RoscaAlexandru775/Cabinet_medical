package programari;

public class Programare {
    protected String numePacient;
    protected String prenumePacient;
    protected String numeMedic;
    protected String prenumeMedic;
    protected String adresaClinica;
    protected String dataInceputProgramare;
    protected String dataSfarsitProgramare;
    protected int numarCabinet;

    public Programare()
    {

    }
    public Programare(String numePacient, String prenumePacient, String numeMedic, String prenumeMedic, String adresaClinica, String dataInceputProgramare, String dataSfarsitProgramare, int numarCabinet) {
        this.numePacient = numePacient;
        this.prenumePacient = prenumePacient;
        this.numeMedic = numeMedic;
        this.prenumeMedic = prenumeMedic;
        this.adresaClinica = adresaClinica;
        this.dataInceputProgramare = dataInceputProgramare;
        this.dataSfarsitProgramare = dataSfarsitProgramare;
        this.numarCabinet = numarCabinet;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public String getPrenumePacient() {
        return prenumePacient;
    }

    public void setPrenumePacient(String prenumePacient) {
        this.prenumePacient = prenumePacient;
    }

    public String getNumeMedic() {
        return numeMedic;
    }

    public void setNumeMedic(String numeMedic) {
        this.numeMedic = numeMedic;
    }

    public String getPrenumeMedic() {
        return prenumeMedic;
    }

    public void setPrenumeMedic(String prenumeMedic) {
        this.prenumeMedic = prenumeMedic;
    }

    public String getAdresaClinica() {
        return adresaClinica;
    }

    public void setAdresaClinica(String adresaClinica) {
        this.adresaClinica = adresaClinica;
    }

    public String getDataInceputProgramare() {
        return dataInceputProgramare;
    }

    public void setDataInceputProgramare(String dataInceputProgramare) {
        this.dataInceputProgramare = dataInceputProgramare;
    }

    public String getDataSfarsitProgramare() {
        return dataSfarsitProgramare;
    }

    public void setDataSfarsitProgramare(String dataSfarsitProgramare) {
        this.dataSfarsitProgramare = dataSfarsitProgramare;
    }

    public int getNumarCabinet() {
        return numarCabinet;
    }

    public void setNumarCabinet(int numarCabinet) {
        this.numarCabinet = numarCabinet;
    }
}
