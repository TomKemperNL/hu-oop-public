package nl.hu.prog;

public class Opdracht14 {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        double c = ((double) a + (double) b) / 2;

        String voornaam = "Max";
        String tussenvoegsel = "van";
        String achternaam = "Havelaar";

        String mijn_naam = voornaam + " " + tussenvoegsel + " " + achternaam;

        // 1. 6.75 groter is dan a en kleiner b.
        boolean resultaat = 6.75 > a && 6.75 < b;
        System.out.println("1:" + resultaat);

        // 2. de lengte van mijnnaam even groot is als de som van de lengte van voornaam, tussenvoegsel en achternaam.
        resultaat = mijn_naam.length() == voornaam.length() + tussenvoegsel.length() + achternaam.length();
        System.out.println("2:" + resultaat);

        // 3. de lengte van mijnnaam minstens 5 maal groter is dan variabele c.
        resultaat = mijn_naam.length() >= (5 * c);
        System.out.println("3:" + resultaat);

        // 4. de waarde van variabele tussenvoegsel voorkomt in de waarde van variabele achternaam.
        resultaat = achternaam.contains(tussenvoegsel);
        System.out.println("4:" + resultaat);
    }
}
