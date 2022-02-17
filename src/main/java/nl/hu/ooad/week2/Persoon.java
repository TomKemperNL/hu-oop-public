package nl.hu.ooad.week2;

public class Persoon {
    private String naam;
    private char geslacht;
    private int leeftijd;
    private double lengte;

    public void setLengte(double lngt){
        this.lengte = lngt;
    }

    public Persoon(String nm, char geslcht){
        this.naam = nm;
        this.geslacht = geslcht;
        this.leeftijd = 18;
        this.lengte = 1.75;
    }

    public String getNaam() {
        return naam;
    }

    public char getGeslacht() {
        return geslacht;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public double getLengte() {
        return lengte;
    }

    public String toString(){
        if(lengte > 2.0){
            return "Lange " + this.naam;
        }else{
            return this.naam;
        }
    }
}
