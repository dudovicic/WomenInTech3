package hr.ferit.dudovicic.womenintech;



public class InspiringPerson {
    String ime;
    String prezime;
    String datum_rođ;
    String datum_smrti;

    public InspiringPerson(String ime, String prezime, String datum_rođ, String datum_smrti) {
        this.ime = ime;
        this.prezime = prezime;
        this.datum_rođ = datum_rođ;
        this.datum_smrti = datum_smrti;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getDatum_rođ() {
        return datum_rođ;
    }

    public String getDatum_smrti() {
        return datum_smrti;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setDatum_rođ(String datum_rođ) {
        this.datum_rođ = datum_rođ;
    }

    public void setDatum_smrti(String datum_smrti) {
        this.datum_smrti = datum_smrti;
    }
}
