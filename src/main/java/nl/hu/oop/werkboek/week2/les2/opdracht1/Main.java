package nl.hu.oop.werkboek.week2.les2.opdracht1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        Eigenaar p1 = new Eigenaar("Tom");
        Eigenaar p2 = new Eigenaar("Leo");
        Huisdier h = new Huisdier("Todor", "kat");
        Huisdier h2 = new Huisdier("Roderick", "kat");
        Huisdier h3 = new Huisdier("Zucco", "rat");
        p1.voegHuisdierToe(h);

        p1.getHuisdieren().add(h2);
        p1.getHuisdieren().add(h3);


        ArrayList<Eigenaar> personen = new ArrayList<>();
        personen.add(p1);
        personen.add(p2);


        for(Eigenaar persoon: personen){
            System.out.println(persoon.getNaam());
            for(Huisdier dier: persoon.getHuisdieren()){
                System.out.println(dier.getNaam());
            }
        }
     }
}

