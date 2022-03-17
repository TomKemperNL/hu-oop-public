package nl.hu.oop.demos.dieren;

import nl.hu.oop.demos.dieren.Dier;

public class Duizendpoot extends Dier {

    public Duizendpoot(){
        super(1000);
    }

    @Override
    public void aai(){
        System.out.println("Duizendpoten houden niet van geaaid worden");
    }

}
