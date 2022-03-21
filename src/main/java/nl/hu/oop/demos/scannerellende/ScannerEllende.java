package nl.hu.oop.demos.scannerellende;

import java.util.Scanner;

public class ScannerEllende {

    private static void watIsHetProbleem(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef 's een getal:");
        int getal = scanner.nextInt();
        System.out.println("Je gaf " + getal);

        System.out.println("En geef nu eens een regel:");
        String tekst = scanner.nextLine();

        System.out.println("Je gaf " + tekst);

    }

    private static void oplossingNextLine(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef 's een getal:");
        int getal = Integer.parseInt(scanner.nextLine());
        System.out.println("Je gaf " + getal);

        System.out.println("En geef nu eens een regel:");
        String tekst = scanner.nextLine();

        System.out.println("Je gaf " + tekst);
    }

    private static void heelIetsAnders(){
        String input = "5A4A3A2";
        Scanner scanner = new Scanner(input);
        scanner.useDelimiter("A");

        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }

    }

    public static void main(String[] args) {
        watIsHetProbleem();
        oplossingNextLine();
        heelIetsAnders();
    }
}
