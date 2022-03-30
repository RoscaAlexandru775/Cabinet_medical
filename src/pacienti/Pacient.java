package pacienti;

public class Pacient {

    protected String nume;
    protected String prenume;
    protected String gen;
    protected String dataNastere;
    protected String cnp;
    protected String grupaSanguina;
    protected String email;
    protected String adresa;

    public Pacient(String nume, String prenume, String gen, String dataNastere, String cnp, String grupaSanguina, String email, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.gen = gen;
        this.dataNastere = dataNastere;
        this.cnp = cnp;
        this.grupaSanguina = grupaSanguina;
        this.email = email;
        this.adresa = adresa;
    }

    public Pacient() {

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(String dataNastere) {
        this.dataNastere = dataNastere;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getGrupaSanguina() {
        return grupaSanguina;
    }

    public void setGrupaSanguina(String grupaSanguina) {
        this.grupaSanguina = grupaSanguina;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }


}
