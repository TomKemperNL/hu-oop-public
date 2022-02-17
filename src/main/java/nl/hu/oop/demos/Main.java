package nl.hu.oop.demos;

public class Main {
    public static void main(String[] args) {
        Rekening r1 = new Rekening(123);
        Rekening r2 = new Rekening(456, 1000);

        r1.stort(500.50);
        r1.stort(1);
        r1.stort(50, "DOL");
        r1.stort(10, "EUR");

        //r1.neemOp(100);

        System.out.println(r1.getSaldo());
        System.out.println(r1);
    }
}
