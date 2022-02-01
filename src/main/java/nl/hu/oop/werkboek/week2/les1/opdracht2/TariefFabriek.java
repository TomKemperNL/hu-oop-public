package nl.hu.oop.werkboek.week2.les1.opdracht2;

public class TariefFabriek {
    public static void main(String[] args) {
        BelastingTarieven tariefGenerator = new BelastingTarieven();

        int tarieven = 0;
        while (tarieven < 10) {
            try {
                System.out.printf("%d: ", tarieven);
                tariefGenerator.produceerBelastingTarieven();
                tarieven++;
            } catch (ArithmeticException ex) {
                System.out.println("mislukt");
                tarieven = 0;
            }
        }
    }
}
