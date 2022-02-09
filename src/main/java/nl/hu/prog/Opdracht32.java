package nl.hu.prog;

public class Opdracht32 {
    public static void main(String[] args) {
        //Python print(0==(1==2))
        //System.out.println(0 == 1 == 2); // Java heeft geen conversie tussen 0 of 1 en False of True, dus dat gaat niet in java

        //Python print((2 + (3==4) + 5) == 7)
        //System.out.println(2 + 3 == 4 + 5 == 7); // Zelfde verhaal, geen conversie tussen cijfers en true/false
        System.out.println((1 < -1) == (3 > 4));
    }
}
