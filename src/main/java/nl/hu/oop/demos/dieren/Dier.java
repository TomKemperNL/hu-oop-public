package nl.hu.oop.demos.dieren;

public abstract class Dier extends Object {
    private int aantalPoten;
    private int blijheid;

    public Dier(int aantalPoten){
        this.aantalPoten = aantalPoten;
        this.blijheid = 0;
    }

    public int getAantalPoten(){
        return this.aantalPoten;
    }

    public void aai(){
        System.out.println("Het dier wordt er blij van");
        blijheid++;
    }

    @Override
    public String toString(){
        return "lief dier";
    }
}
