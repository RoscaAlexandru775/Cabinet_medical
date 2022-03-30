package pacienti;

public class PacientAbonat extends Pacient{

    private String dataIneputAbonament;
    private String dataSfarsitAbonament;
    private String tipAbonament;
    private int procentDiscount;

    public PacientAbonat(String nume, String prenume, String gen, String dataNastere, String cnp, String grupaSanguina, String email, String adresa, String dataIneputAbonament, String dataSfarsitAbonament, String tipAbonament, int procentDiscount) {
        super(nume, prenume, gen, dataNastere, cnp, grupaSanguina, email, adresa);
        this.dataIneputAbonament = dataIneputAbonament;
        this.dataSfarsitAbonament = dataSfarsitAbonament;
        this.tipAbonament = tipAbonament;
        this.procentDiscount = procentDiscount;
    }

    public PacientAbonat()
    {

    }

    public String getDataIneputAbonament() {
        return dataIneputAbonament;
    }

    public void setDataIneputAbonament(String dataIneputAbonament) {
        this.dataIneputAbonament = dataIneputAbonament;
    }

    public String getDataSfarsitAbonament() {
        return dataSfarsitAbonament;
    }

    public void setDataSfarsitAbonament(String dataSfarsitAbonament) {
        this.dataSfarsitAbonament = dataSfarsitAbonament;
    }

    public String getTipAbonament() {
        return tipAbonament;
    }

    public void setTipAbonament(String tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public int getProcentDiscount() {
        return procentDiscount;
    }

    public void setProcentDiscount(int procentDiscount) {
        this.procentDiscount = procentDiscount;
    }
}
