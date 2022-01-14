namespace HU.OOP.Week1.Opdracht4;

public class Student
{
    public String Naam { get; private set; } 
    public int Nummer { get; set; }

    public Student(String nm)
    {
        this.Naam = nm;
    }

    public Student(String nm, int nr) {
        Naam = nm;
        Nummer = nr;
    }

    public override string ToString()
    {
        return "Deze student heet " + Naam + " en heeft nummer " + Nummer;
    }
}