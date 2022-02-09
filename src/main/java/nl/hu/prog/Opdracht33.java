package nl.hu.prog;

import java.util.Scanner;

public class Opdracht33 {
    public static void main(String[] args) {
        /*
        Wat verdien je per uur: 3.80
        Hoeveel uur heb je gewerkt: 20
        20 uur werken levert €76.0 op
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat verdien je per uur: ");
        double uurloon = scanner.nextDouble();
        System.out.println("Hoeveel uur heb je gewerkt: ");
        int uren = scanner.nextInt();
        System.out.println(uren + " uur werken levert je €" + (uren * uurloon) + " op");
    }
}
