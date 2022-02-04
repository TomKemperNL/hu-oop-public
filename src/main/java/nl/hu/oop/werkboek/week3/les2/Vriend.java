package nl.hu.oop.werkboek.week3.les2;

import java.util.Objects;

public class Vriend {

    private String voornaam;
    private String achternaam;
    private String email;

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getEmail() {
        return email;
    }

    public Vriend(String voornaam, String achternaam, String email) {

        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vriend vriend = (Vriend) o;
        return voornaam.equals(vriend.voornaam) && achternaam.equals(vriend.achternaam) && email.equals(vriend.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voornaam, achternaam, email);
    }

    @Override
    public String toString() {
        return String.format("%s %s, email: %s", this.voornaam, this.achternaam, this.email);
    }
}
