package nl.hu.oop.werkboek.week1.les2.opdracht1;

public class Piloot {
    private String naam;
    private double salaris;
    private int vlieguren;

    public Piloot(String naam) {
        this.naam = naam;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    public void verhoogVliegurenMet(int uren) {
        this.vlieguren += uren;
    }

    public int getVlieguren() {
        return this.vlieguren;
    }

    public double getSalaris() {
        return this.salaris;
    }

    @Override
    public String toString() {
        return String.format("%s heeft %d vlieguren gemaakt en verdient %.2f.", this.naam, this.vlieguren, this.salaris);
    }
}
