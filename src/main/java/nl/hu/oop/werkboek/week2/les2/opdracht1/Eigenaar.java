package nl.hu.oop.werkboek.week2.les2.opdracht1;

import java.util.ArrayList;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private ArrayList<Huisdier> huisdieren;

    public Eigenaar(String nm) {
        naam = nm;
        huisdieren = new ArrayList<>();
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
        return naam + " heeft giro " + giroNr;
    }

    public void voegHuisdierToe(Huisdier dier){
        this.huisdieren.add(dier);

    }

    public ArrayList<Huisdier> getHuisdieren(){
        return new ArrayList<>(this.huisdieren);
    }
}
