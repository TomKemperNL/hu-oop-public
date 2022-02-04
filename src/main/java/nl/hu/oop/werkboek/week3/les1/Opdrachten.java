package nl.hu.oop.werkboek.week3.les1;

import nl.hu.oop.werkboek.week2.les2.opdracht2.Huisdier;

import java.util.ArrayList;

public class Opdrachten {

    public static void printTypeAndValue(Object o) {
        //Door hier een object te vragen gebeurt subtiel een proces genaamd 'boxing', maar dat is nu even niet belangrijk
        System.out.printf("%s: %s\n", o.getClass(), o);
    }

    public static void opdracht51() {
        printTypeAndValue(8 + 3 * 5);
        printTypeAndValue((7.0 + 1) / 2);
        printTypeAndValue(7.0 + 1 / 2);
        printTypeAndValue(8 + 4 / 2 * 2);
        printTypeAndValue(8 + 5 / 2 * 2);
        printTypeAndValue(1 + 2 + "3" + 4 + 5);
        printTypeAndValue(147 / 11);
        printTypeAndValue(147 % 11);
        printTypeAndValue(837462 / 100);
        printTypeAndValue(837462 % 100);
        printTypeAndValue((10 + 11) / 2.0);
        printTypeAndValue((10 + 11) / 2);
        printTypeAndValue(10 + 11 / 2.0);
        int a, b, c, d, m;

        //Dit is raar, schrijf dit soort code niet aub:
        printTypeAndValue(a = b = c = (d = 6));
        printTypeAndValue(a = b = c = d);

        // In deze gevallen had ik zelf geen idee wat hier uit zou moeten komen.
        // Dit is leuk voor programmeer-pub-quizzes, maar meer ook niet.
        printTypeAndValue(m = (b + ++c + a++));
        printTypeAndValue(m = a = b = c);
    }

    public static void opdracht52() {
        /*
1.  !(leeftijd <= 65)  = 'niet kleiner of gelijk aan 65' = groter dan 65
2.  !(n >= 18 || n < 7)  = kleiner dan 18 EN groter of gelijk aan 7
3.  !(x >= 18 && x < 40) = onder de 18 of boven de 40
4.  (x >= 10 && x <= 20 || x > 40)  = groter dan 40 of tussen de [10,20]
5.  (x >= 10 && (x <= 20 || x > 40))  = etc.etc.
6.  (x >= 10 || x > 40) && (x <= 20)  =
7.  (ch == 'A' && ch == 'B' )  =
8.  !(ch == 'A' || ch == 'B' )  =
         */
    }

    public static void main(String[] args) {
        System.out.println("5.1:");
        opdracht51();
        opdracht52();
        opdracht53();
    }

    public static void opdracht53() {
        ArrayList<Huisdier> dieren = new ArrayList<>();
        Huisdier dier1 = new Huisdier("Thodor", "Kat");
        Huisdier dier2 = new Huisdier("Thodor", "Roderick");
        dieren.add(dier1);
        dieren.add(dier2);
        dieren.add(new Huisdier("Zucco", "Rat"));
        System.out.println("Er zijn " + dieren.size() + " dieren in de lijst");
        for (Huisdier d : dieren) {
            System.out.println(d);
        }
        dieren.add(0, new Huisdier("Disco", "Vis"));
        dieren.set(2, new Huisdier("Kunibert", "Konijn"));
        System.out.println(dieren);

    }

}
