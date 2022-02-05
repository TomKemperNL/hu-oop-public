package nl.hu.oop.werkboek.week2.les2.opdracht2;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje;

    public Eigenaar(String nm) {
        naam = nm;
    }

    public void setGiroNr(int nr) {
        giroNr = nr;
    }

    public int getGiroNr() {
        return giroNr;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        String basis = naam + " heeft giro " + giroNr + ". En is het baasje van ";
        if (self.beestje == null) {
            return basis + "null";
        } else {
            return basis + self.beestje.toString();
        }
    }

    public void setBeestje(Huisdier huisdier) {
        self.beestje = huisdier;
    }

    public Huisdier getBeestje() {
        return self.beestje;
    }
}
