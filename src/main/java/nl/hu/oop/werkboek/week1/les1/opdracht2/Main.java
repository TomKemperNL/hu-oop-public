package nl.hu.oop.werkboek.week1.les1.opdracht2;

public class Main {
    public static void main(String[] args) {
        Klant klant1 = new Klant("Jan","Utrecht", "Nijenoord 1");


        Klant klant2 = new Klant("Wim", "Bla", "Oudenoord 340");
        klant1.setPlaats("Utrecht");

        System.out.println("De gegevens van nr 1 zijn:");
        System.out.println(klant1);
        System.out.println();

        System.out.println("De gegevens van nr 2 zijn:");
        System.out.println(klant2);
    }
}
