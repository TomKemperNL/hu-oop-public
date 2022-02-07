package nl.hu.ooad.week1.praxa1;

public class Main {
    public static void main(String[] args) {
        Product schroevendraaiers = new Product(1, "Schroevendraaier", 7.49);
        schroevendraaiers.setOmschrijving("Ze draaien héél erg goed.");
        Product spijkers = new Product(2, "Spijker (1000 stuks)", 14.99);
        spijkers.setOmschrijving("Verzinkt, met platte kop");

        Winkel utrecht = new Winkel("Utrecht");
        Winkel deventer = new Winkel("Deventer");

        utrecht.leverProduct(spijkers, 100);
        utrecht.leverProduct(schroevendraaiers, 25);

        System.out.println("Deventer krijgt 10 spijkers geleverd");
        deventer.leverProduct(spijkers, 10);

        System.out.println("Deventer kan 5 spijkers verkopen: " + deventer.verkoopProduct(spijkers, 5));
        System.out.println("Deventer kan nog 10 spijkers verkopen: " + deventer.verkoopProduct(spijkers, 10));
        System.out.println("Deventer heeft nog " + deventer.getAantal(spijkers) + " spijkers");
        System.out.println("Deventer heeft nog " + deventer.getAantal(schroevendraaiers) + " schroevendraaiers");
        System.out.println("Utrecht heeft nog " + utrecht.getAantal(schroevendraaiers) + " schroevendraaiers");

    }
}
