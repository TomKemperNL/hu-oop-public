package nl.hu.prog;

public class Opdracht31 {
    public static void main(String[] args) {
        /*
        De Hogeschool Utrecht wil studenten financieel ondersteunen bij hun studie, afhankelijk van de cijfers die een student haalt.
        Voor elk cijferpunt krijg je € 30,-.
        Voor een 1,0 krijg je dus 30 euro,
        voor een 2,5 krijg je 75 euro en
        voor een 10,0 beloont de HU een student met € 300,-.

        Maak variabelen cijferPROJA, cijferPROG en cijferMOD.
        Geef ze alle drie de waarde die jij verwacht dat je voor de betreffende vakken in blok 1 zult gaan halen.
        Maak nu vervolgens ook de volgende variabelen aan, en bereken de bijbehorende waarden m.b.v. een Python expressie:


        gemiddelde	het gemiddelde van de variabelen cijferPROJA, cijferPROG en cijferMOD.
        beloning	de totale beloning voor deze drie cursussen.
        overzicht	een string met een tekstuele omschrijving het gemiddelde en de beloning:

        Bijvoorbeeld: 'Mijn cijfers (gemiddeld een 7.5) leveren een beloning van € 675.0 op!'
         */

        double cijferProjA = 7.5;
        double cijferProg = 8.5;
        double cijferMod = 6.2;

        double gemiddelde = (cijferProjA + cijferProg + cijferMod) / 3;
        double beloning = (cijferProjA + cijferProg + cijferMod) * 30;
        String overzicht = String.format("Mijn cijfers (gemiddeld een %.1f) leveren een beloning van € %.2f op!", gemiddelde, beloning);

        System.out.println(overzicht);
    }
}
