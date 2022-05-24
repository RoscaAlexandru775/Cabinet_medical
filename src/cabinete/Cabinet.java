package cabinete;

import java.util.Objects;

public class Cabinet implements Comparable<Cabinet> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cabinet cabinet = (Cabinet) o;
        return numar == cabinet.numar && etaj == cabinet.etaj && Objects.equals(Sectie, cabinet.Sectie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numar, etaj, Sectie);
    }

    @Override
    public String toString() {
        return "Cabinet{" +
                "numar=" + numar +
                ", etaj=" + etaj +
                ", Sectie='" + Sectie + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cabinet another) {
        return Sectie.compareTo(another.Sectie);
    }
}
