package nl.hu.oop.demos;

import java.util.Random;

public class Dobbelsteen {
    private int waarde;

    public Dobbelsteen(){
        this.waarde = 1;
    }

    public void gooi(){
        Random r = new Random();

        int worp = r.nextInt(6) + 1;
        this.waarde = worp;
    }

    public int getWaarde(){
        return this.waarde;
    }

    public static void main(String[] args) {
        Dobbelsteen d1 = new Dobbelsteen();
        Dobbelsteen d2 = new Dobbelsteen();

        int aantalPogingen = 0;
        while(!(d1.getWaarde() == 6 && d2.getWaarde() == 6)){
            d1.gooi();
            d2.gooi();
            aantalPogingen++;
        }

        System.out.println(aantalPogingen);
    }
}
