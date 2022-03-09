package nl.hu.oop.demos.dieren;

import nl.hu.oop.demos.dieren.Dier;
import nl.hu.oop.demos.dieren.GeluidMaker;

public class Koe extends Dier implements GeluidMaker {
    private double gewichtKg;

    public double getGewichtKg() {
        return gewichtKg;
    }

    public Koe(double gewicht){
        super(4);
        if(gewicht < 0){
            throw new IllegalArgumentException();
        }
        this.gewichtKg = gewicht;
    }

    public void maakGeluid(){
        if(gewichtKg > 100){
            System.out.println("MOOOOOOOOO");
        }else{
            System.out.println("moooo..oooo");
        }
    }
}
