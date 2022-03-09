package nl.hu.oop.demos.pecs;

import java.util.ArrayList;
import java.util.List;

public class PECS {
    public static void main(String[] args) {
        List<? extends Dier> dierenExtends;
        dierenExtends = new ArrayList<Kat>();
        dierenExtends = new ArrayList<Dier>();
        //dierenExtends = new ArrayList<LevendWezen>();

        //dierenExtends.add(new Dier());
        //dierenExtends.add(new Kat());
        //dierenExtends.add(new LevendWezen());

        Dier x;
        Kat y;
        LevendWezen z;

        x = dierenExtends.get(0);
        //y = dierenExtends.get(0);
        z = dierenExtends.get(0);

        List<? super Dier> dierenSuper;
        //dierenSuper = new ArrayList<Kat>();
        dierenSuper = new ArrayList<Dier>();
        dierenSuper = new ArrayList<LevendWezen>();
        dierenSuper.add(new Dier());
        dierenSuper.add(new Kat());
        //dierenSuper.add(new LevendWezen());

        //x = dierenSuper.get(0);
        //y = dierenSuper.get(0);
        //z = dierenSuper.get(0);
    }
}
