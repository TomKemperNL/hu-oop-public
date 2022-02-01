package nl.hu.oop.werkboek.week2.les1.opdracht2;

public class TariefFabriek {
    public static void main(String[] args) {
        BelastingTarieven tariefGenerator = new BelastingTarieven();

        while (true) {
            try {
                tariefGenerator.produceerBelastingTarieven();
                break;
            } catch (ArithmeticException ex) {
                System.out.println("mislukt");
            }
        }
    }
}
