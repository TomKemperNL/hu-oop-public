package nl.hu.oop.werkboek.week1.les2.opdracht1;

public class Piloot {
    private String naam;
    private double salaris;
    private int vlieguren;

    public Piloot(String naam) {
        self.naam = naam;
    }

    public void setSalaris(double salaris) {
        self.salaris = salaris;
    }

    public void verhoogVliegurenMet(int uren) {
        self.vlieguren += uren;
    }

    public int getVlieguren() {
        return self.vlieguren;
    }

    public double getSalaris() {
        return self.salaris;
    }

    @Override
    public String toString() {
        return String.format("%s heeft %d vlieguren gemaakt en verdient %.2f.", self.naam, self.vlieguren, self.salaris);
    }
}
