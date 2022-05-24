package medici;

import java.util.Objects;

public class Medic {
    private String nume;
    private String prenume;
    private String gen;
    private String dataNastere;
    private String cnp;
    private String email;
    private String adresa;
    private String specilizare;

    public Medic(String nume, String prenume, String gen, String dataNastere, String cnp, String email, String adresa, String specilizare) {
        this.nume = nume;
        this.prenume = prenume;
        this.gen = gen;
        this.dataNastere = dataNastere;
        this.cnp = cnp;
        this.email = email;
        this.adresa = adresa;
        this.specilizare = specilizare;
    }
    public Medic(){

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

    public String getSpecilizare() {
        return specilizare;
    }

    public void setSpecilizare(String specilizare) {
        this.specilizare = specilizare;
    }



    @Override
    public String toString() {
        return "Medic{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", gen='" + gen + '\'' +
                ", dataNastere='" + dataNastere + '\'' +
                ", cnp='" + cnp + '\'' +
                ", email='" + email + '\'' +
                ", adresa='" + adresa + '\'' +
                ", specilizare='" + specilizare + '\'' +
                '}';
    }
}
