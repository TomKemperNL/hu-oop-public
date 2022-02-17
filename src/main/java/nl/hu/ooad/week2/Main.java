package nl.hu.ooad.week2;

public class Main {
    public static void main(String[] args) {
        Persoon tom = new Persoon("Tom", 'm');
        tom.setLengte(2.06);
        Dier todor = new Dier("Kat", "Todor");

        System.out.println(tom);
        System.out.println(todor);
    }
}
