package nl.hu.oop.werkboek.week1.les1.opdracht2;

public class Klant {
    private String naam;
    private String plaats;
    private String straat;

    public Klant(String naam, String plt, String str){
        this.naam = naam;
        plaats = plt;
        straat = str;
    }

    public String getNaam(){
        return naam;
    }

    public String getPlaats(){
        return plaats;
    }

    public String getStraat(){
        return straat;
    }

    public void setPlaats(String nieuwePlaats){
        plaats = nieuwePlaats;
    }

    public String toString(){
        return "Naam: " + this.naam + ", Plaats: " + this.plaats;
    }
}
