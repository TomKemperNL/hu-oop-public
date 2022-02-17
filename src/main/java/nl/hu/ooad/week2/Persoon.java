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

        if(husdier.getEigenaar() != this){
            husdier.setEigenaar(this);
        }
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
        String resultaat = this.naam;

        if(lengte > 2.0){
            resultaat = "Lange " + resultaat;
        }

        if(huisdier != null){
            resultaat = resultaat + " met " + huisdier.toString();
        }

        return resultaat;
    }
}
