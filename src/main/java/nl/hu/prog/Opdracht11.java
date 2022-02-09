package nl.hu.prog;

public class Opdracht11 {


    private static void print(String expression, Object value) {
        System.out.printf("%10s %10s %10s\n", expression, value, value.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        System.out.printf("%10s %10s %10s\n", "expressie", "waarde", "type");
        print("5", 5);
        print("5.0", 5.0);
        print("5%2", 5 % 2);
        print("5>1", 5 > 1);
        print("\"5\"", "5");
        print("5*2", 5 * 2);
    }
}
