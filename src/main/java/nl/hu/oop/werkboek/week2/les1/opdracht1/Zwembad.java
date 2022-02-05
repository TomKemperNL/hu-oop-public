package nl.hu.oop.werkboek.week2.les1.opdracht1;

public class Zwembad {
    private double lengte;
    private double breedte;
    private double diepte;

    public Zwembad(double breedte, double lengte, double diepte) {
        this();
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;

    }

    public Zwembad() {

    }

    public double getBreedte() {
        return this.breedte;
    }

    public double getLengte() {
        return this.lengte;
    }

    public double getDiepte() {
        return this.diepte;
    }

    public double inhoud() {
        return this.diepte * this.lengte * this.breedte;
    }

    public void setBreedte(double b) {
        this.breedte = b;
    }

    public void setLengte(double l) {
        this.lengte = l;
    }

    public void setDiepte(double d) {
        this.diepte = d;
    }

    @Override
    public String toString() {
        return "Dit zwembad is " + this.breedte + " meter breed, " + this.lengte + " meter lang, en " + this.diepte + " meter diep";
        //return String.format("Dit zwembad is %.1f meter breed, %.1f meter lang, en %.1f meter diep", this.breedte, this.lengte, this.diepte);
    }
}
