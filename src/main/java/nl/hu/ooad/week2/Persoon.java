package nl.hu.ooad.week2;

public class Persoon {
    private String naam;
    private Dier huisdier;
    private char geslacht;
    private int leeftijd;
    private double lengte;

    public void setLengte(double lngt){
        this.lengte = lngt;
    }

    public void setHuisdier(Dier husdier){
        this.huisdier = husdier;
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

    public Dier getHuisdier(){
        return huisdier;
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
        if(huisdier == null){
            if(lengte > 2.0){
                return "Lange " + this.naam;
            }else{
                return this.naam;
            }
        }else{
            if(lengte > 2.0){
                return "Lange " + this.naam + " met " + huisdier.toString();
            }else{
                return this.naam + " met " + huisdier.toString();
            }
        }


    }
}
