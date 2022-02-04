package nl.hu.oop.werkboek.week2.les2.opdracht1;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar baasje;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }

    public String getNaam() {
        return naam;
    }

    public String getRas() {
        return ras;
    }

    public String toString() {
        String regel1 = naam + ", de " + ras + ", weegt " + gewicht + " kg.";
        String regel2;

        if (this.baasje == null) {
            regel2 = "En de eigenaar is: null";
        } else {
            regel2 = "En de eigenaar is: " + this.baasje.toString();
        }

        return regel1 + "\n" + regel2;
    }

    public void setBaasje(Eigenaar e1) {
        this.baasje = e1;
    }

    //Technisch gezien niet nodig, maar het is een beetje ongebruikelijk om een setter zonder getter te hebben
    public Eigenaar getBaasje() {
        return this.baasje;
    }
}
