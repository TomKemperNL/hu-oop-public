package nl.hu.oop.werkboek.week2.les2.opdracht1;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }
    public String getNaam() { return naam; }
    public String getRas() { return ras; }
    public String toString() {
        return naam + ", de " + ras + ", weegt " + gewicht + " kg.";
    }

    public void setBaasje(Eigenaar e1) {
    }
}