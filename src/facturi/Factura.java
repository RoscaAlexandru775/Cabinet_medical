package facturi;

public class Factura {
    private String metodaDePlata;
    private String numePacient;
    private String prenumePacient;
    private String numeMedic;
    private String prenumeMedic;
    private String dataEmitere;
    private String numeServiciu;
    private double pret;
    private double tva;
    private double totalDePlata;

    public Factura(String metodaDePlata, String numePacient, String prenumePacient, String numeMedic, String prenumeMedic, String dataEmitere, String numeServiciu, double pret, double tva, double totalDePlata) {
        this.metodaDePlata = metodaDePlata;
        this.numePacient = numePacient;
        this.prenumePacient = prenumePacient;
        this.numeMedic = numeMedic;
        this.prenumeMedic = prenumeMedic;
        this.dataEmitere = dataEmitere;
        this.numeServiciu = numeServiciu;
        this.pret = pret;
        this.tva = tva;
        this.totalDePlata = totalDePlata;
    }

    public Factura()
    {

    }

    public String getMetodaDePlata() {
        return metodaDePlata;
    }

    public void setMetodaDePlata(String metodaDePlata) {
        this.metodaDePlata = metodaDePlata;
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

    public String getDataEmitere() {
        return dataEmitere;
    }

    public void setDataEmitere(String dataEmitere) {
        this.dataEmitere = dataEmitere;
    }

    public String getNumeServiciu() {
        return numeServiciu;
    }

    public void setNumeServiciu(String numeServiciu) {
        this.numeServiciu = numeServiciu;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public double getTotalDePlata() {
        return totalDePlata;
    }

    public void setTotalDePlata(double totalDePlata) {
        this.totalDePlata = totalDePlata;
    }
}
