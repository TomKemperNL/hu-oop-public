package nl.hu.oop.demos.dieren;

public class Eend extends Dier implements GeluidMaker {
    private boolean kanVliegen;

    public Eend(){
        super(2);
        this.kanVliegen = true;
    }

    public boolean isKanVliegen() {
        return kanVliegen;
    }

    public void setKanVliegen(boolean kanVliegen) {
        this.kanVliegen = kanVliegen;
    }

    public void maakGeluid(){
        System.out.println("Kwek Kwek");
    }
}
