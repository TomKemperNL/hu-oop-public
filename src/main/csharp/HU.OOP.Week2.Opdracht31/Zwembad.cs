namespace HU.OOP.Week2.Opdracht31;

public class Zwembad
{
    public double Lengte { get; set; }
    public double Breedte { get; set; }
    public double Diepte { get; set; }

    public Zwembad(double breedte, double lengte, double diepte) : this()
    {
        this.Breedte = breedte;
        this.Lengte = lengte;
        this.Diepte = diepte;
    }

    public Zwembad()
    {
    }


    public double Inhoud => this.Diepte * this.Lengte * this.Breedte;


    public override String ToString()
    {
        return "Dit zwembad is " + this.Breedte + " meter breed, " + this.Lengte + " meter lang, en " + this.Diepte +
               " meter diep";
        //return String.format("Dit zwembad is %.1f meter breed, %.1f meter lang, en %.1f meter diep", this.breedte, this.lengte, this.diepte);
    }
}