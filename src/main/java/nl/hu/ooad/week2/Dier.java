package nl.hu.ooad.week2;

public class Dier {
    private String soort;
    private int leeftijd;
    private String naam;
    private Persoon eigenaar;

    public Dier(String sort, String nm){
        this.leeftijd = 0;
        this.soort = sort;
        this.naam = nm;
    }

    public Persoon getEigenaar(){
        return this.eigenaar;
    }

    public void setEigenaar(Persoon egnaar){
        this.eigenaar = egnaar;

        if(egnaar.getHuisdier() != this){
            egnaar.setHuisdier(this);
        }
    }

    public String getSoort() {
        return soort;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public String toString(){
        String resultaat = this.naam + " (" + this.soort + ")";
        if(eigenaar != null){
            resultaat = "Geadopteerd: " + resultaat;
        }
        return resultaat;
    }







}
