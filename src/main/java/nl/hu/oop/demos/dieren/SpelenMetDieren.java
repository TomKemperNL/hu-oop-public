package nl.hu.oop.demos.dieren;

import nl.hu.oop.demos.dieren.Dier;
import nl.hu.oop.demos.dieren.Duizendpoot;
import nl.hu.oop.demos.dieren.Eend;
import nl.hu.oop.demos.dieren.Koe;

import java.util.ArrayList;

public class SpelenMetDieren {
    public static void main(String[] args) {
        Eend e1 = new Eend();
        Eend e2 = new Eend();
        e2.setKanVliegen(false);

        Koe k1 = new Koe(50);
        Koe k2 = new Koe(500);

        Dier duizendpoot = new Duizendpoot();

        ArrayList<Dier> dieren = new ArrayList<>();
        dieren.add(duizendpoot);
        dieren.add(e1);
        dieren.add(k2);

        for(Dier d: dieren){
            System.out.println(d.getAantalPoten());
            d.aai();
        }
    }
}
