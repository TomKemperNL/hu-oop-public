package nl.hu.oop.werkboek.week1.les1.opdracht4;

public class Main {
    public static void main(String[] arg) {
        Student st1 = new Student("Sylvester");
        System.out.println("getter: " + st1.getNaam());
        System.out.println("toString: " + st1.toString());
        System.out.println("toString (impliciet): " + st1);

        Student st2 = new Student("Karel");
        System.out.println("getter: " + st2.getNaam());
        System.out.println("toString: " + st2.toString());
        System.out.println("toString (impliciet): " + st2);
    }
}
