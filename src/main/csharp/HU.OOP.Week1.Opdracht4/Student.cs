namespace HU.OOP.Week1.Opdracht4;

public class Student
{
    public String Naam { get; private set; } //C# heeft een klein truukje om niet al die getXYZs te hoeven schrijven
    //Leuk, maar 'lekker belangrijk'

    public Student(String nm)
    {
        this.Naam = nm;
    }

    public override string ToString()
    {
        return "Deze student heet " + Naam;
    }
}