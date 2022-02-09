package nl.hu.prog;

public class Opdracht13 {
    public static void main(String[] args) {
        // 1. Ken de waarde 6 toe aan variabele a, en waarde 7 aan variabele b.
        int a = 6;
        int b = 7;

        // 2. Ken aan variabele c als waarde het gemiddelde van a en b
        double c = (a + b) / 2; //Pas op, dit doet in Java niet wat je verwacht!
        System.out.println("Wut?! Dit is niet het gemiddelde van 6 & 7: " + c);

        c = ((double) a + (double) b) / 2;
        System.out.println("Dit gelukkig wel: " + c);

// 3. Ken aan variabelen voornaam, tussenvoegsel en achternaam je eigen naamgegevens toe.
        String voornaam = "Max";
        String tussenvoegsel = "van";
        String achternaam = "Havelaar";

// 4. Ken aan variabele mijnnaam de variabelen van opdracht 3 (met spaties er tussen) toe.
        String mijn_naam = voornaam + " " + tussenvoegsel + " " + achternaam;
        System.out.println(mijn_naam);
    }
}
