package nl.hu.oop.demos.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TextDemos {

    private static void schrijfPersoon(Persoon opslaan) throws IOException {
        try (FileOutputStream fs = new FileOutputStream("test.txt")) {
            try (PrintStream ps = new PrintStream(fs)) {
                ps.println(String.format("%s;%s", opslaan.getId(), opslaan.getName()));
            }
        }

    }

    private static ArrayList<Persoon> leesPersonen() throws IOException {
        List<String> lines = Files.readAllLines(Path.of("test.txt"));

        ArrayList<Persoon> personen = new ArrayList<>();
        for (String line : lines) {
            String[] split = line.split(";");
            Persoon p = new Persoon(Long.parseLong(split[0]), split[1]);
            personen.add(p);
        }

        return personen;
    }

    /**
     * Schrijft een persoon object weg als tekst en leest 'm vervolgens weer in. Zie je wat equals hier doet?
     */
    private static void schrijfLeesPersoon() throws IOException {
        schrijfPersoon(new Persoon(42, "Bob"));
        ArrayList<Persoon> ps = leesPersonen();
        Persoon dieEne = ps.get(0);

        ArrayList<Persoon> ps2 = leesPersonen();
        Persoon dieAndere = ps2.get(0);

        System.out.println("Zit ie erin: " + ps.contains(dieAndere));
        System.out.println(dieAndere.getName());

        System.out.println(dieEne.getId() == dieAndere.getId());
        String wut = "==: " + (dieEne.getName() == dieAndere.getName());
        System.out.println(wut);
        System.out.println(dieEne == dieAndere);
    }

    //Het closen van dingen mist hier!
    private static void leesFileMoeizaam() throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        int maybeChar = isr.read();
        while (maybeChar != -1) {
            System.out.println("Rauw: :" + maybeChar);
            System.out.println("Als Letter: :" + (char) maybeChar);
            maybeChar = isr.read();
        }
        br.close();
    }


    private static void schrijfFileMoeizaam(Persoon opslaan) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");

        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter br = new BufferedWriter(osw);

        br.write(String.format("%s;%s", opslaan.getId(), opslaan.getName()));
        br.close();
    }

    public static void main(String[] args) throws IOException {
        schrijfLeesPersoon();
        //schrijfFileMoeizaam(new Persoon(42, "Bob"));
        leesFileMoeizaam();

    }
}
