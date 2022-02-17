package nl.hu.ooad.week2;

public class Dier {
    private String soort;
    private int leeftijd;
    private String naam;

    public Dier(String sort, String nm){
        this.leeftijd = 0;
        this.soort = sort;
        this.naam = nm;
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
        return this.naam + " (" + this.soort + ")";
    }







}
