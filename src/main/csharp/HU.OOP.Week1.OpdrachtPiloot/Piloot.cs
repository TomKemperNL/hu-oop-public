namespace HU.OOP.Week1.OpdrachtPiloot;

public class Piloot
{
    public String Naam { get; }
    public double Salaris { get; set; }
    public int Vlieguren { get; private set; }

    public Piloot(String naam)
    {
        this.Naam = naam;
    }

    public override String ToString()
    {
        return String.Format("{0} heeft {1} vlieguren gemaakt en verdient {2:F2}.", this.Naam, this.Vlieguren,
            this.Salaris);
    }

    public void VerhoogVliegurenMet(int uren)
    {
        this.Vlieguren += uren;
    }
}