package cabinete;

public class Cabinet {
    private int numar;
    private int etaj;
    private String Sectie;

    public Cabinet(int numar, int etaj, String sectie) {
        this.numar = numar;
        this.etaj = etaj;
        this.Sectie = sectie;
    }
    public Cabinet()
    {

    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public int getEtaj() {
        return etaj;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public String getSectie() {
        return Sectie;
    }

    public void setSectie(String sectie) {
        Sectie = sectie;
    }
}
