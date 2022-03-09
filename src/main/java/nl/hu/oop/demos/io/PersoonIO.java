package nl.hu.oop.demos.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PersoonIO {
    private long id;
    private String name;

    public PersoonIO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Persoon " + id;
    }
//
//    public boolean equals(Object other) {
//        if (other instanceof PersoonIO) {
//            PersoonIO otherPersoon = (PersoonIO) other;
//            String name = otherPersoon.getName();
//            double id = otherPersoon.getId();
//            return name.equals(this.name) && id == this.id;
//        } else {
//            return false;
//        }
//    }

    private static void schrijfPersoon(PersoonIO opslaan) throws IOException {
        FileOutputStream fs = new FileOutputStream("test.txt");
        PrintStream ps = new PrintStream(fs);
        ps.println(String.format("%s;%s", opslaan.getId(), opslaan.getName()));
        ps.flush();
        fs.flush();
        fs.close();
    }

    private static ArrayList<PersoonIO> leesPersonen() throws IOException {
        List<String> lines = Files.readAllLines(Path.of("test.txt"));

        ArrayList<PersoonIO> personen = new ArrayList<>();
        for (String line : lines) {
            String[] split = line.split(";");
            PersoonIO p = new PersoonIO(Long.parseLong(split[0]), split[1]);
            personen.add(p);
        }

        return personen;
    }

    public static void main(String[] args) {
        try {
            //schrijfPersoon(test);
            ArrayList<PersoonIO> ps = leesPersonen();
            PersoonIO dieEne = ps.get(0);
            //dieEne.setName("Bob");

            ArrayList<PersoonIO> ps2 = leesPersonen();
            PersoonIO dieAndere = ps2.get(0);

            System.out.println("Zit ie erin: " + ps.contains(dieAndere));
            System.out.println(dieAndere.getName());

            System.out.println(dieEne.getId() == dieAndere.getId());
            String wut = "==: " + (dieEne.getName() == dieAndere.getName());
            System.out.println(wut);
            System.out.println(dieEne == dieAndere);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
