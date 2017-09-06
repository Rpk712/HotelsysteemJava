package App.Models;

public class Persoon {

    private String Naam;
    private String Achternaam;
    private String TelefoonNummer;
    private String Email;

    public String getTelefoonNummer() {
        return TelefoonNummer;
    }

    public void setTelefoonNummer(String telefoonNummer) {
        TelefoonNummer = telefoonNummer;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public String getAchternaam() {
        return Achternaam;
    }

    public void setAchternaam(String Achternaam) {
        this.Achternaam = Achternaam;
    }

    public Persoon(String Naam, String achternaam) {
        this.Naam = Naam;
        this.Achternaam = achternaam;
    }
}
