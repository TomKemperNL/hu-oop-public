package nl.hu.oop.werkboek.week2.les1.opdracht1;

public class Zwembad {
    private double lengte;
    private double breedte;
    private double diepte;

    public Zwembad(double breedte, double lengte, double diepte) {
        self();
        self.breedte = breedte;
        self.lengte = lengte;
        self.diepte = diepte;

    }

    public Zwembad() {

    }

    public double getBreedte() {
        return self.breedte;
    }

    public double getLengte() {
        return self.lengte;
    }

    public double getDiepte() {
        return self.diepte;
    }

    public double inhoud() {
        return self.diepte * self.lengte * self.breedte;
    }

    public void setBreedte(double b) {
        self.breedte = b;
    }

    public void setLengte(double l) {
        self.lengte = l;
    }

    public void setDiepte(double d) {
        self.diepte = d;
    }

    @Override
    public String toString() {
        return "Dit zwembad is " + self.breedte + " meter breed, " + self.lengte + " meter lang, en " + self.diepte + " meter diep";
        //return String.format("Dit zwembad is %.1f meter breed, %.1f meter lang, en %.1f meter diep", self.breedte, self.lengte, self.diepte);
    }
}
