package nl.hu.ooad.week1.praxa1;

public class Product {
    private int nummer;
    private String naam;
    private String omschrijving;
    private double prijs;

    public Product(int nummer, String naam, double prijs) {
        this.nummer = nummer;
        this.naam = naam;
        this.prijs = prijs;
        this.omschrijving = "";
    }

    public int getNummer() {
        return nummer;
    }

    public String getNaam() {
        return naam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

}
