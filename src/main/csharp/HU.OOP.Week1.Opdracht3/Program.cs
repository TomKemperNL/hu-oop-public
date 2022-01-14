using System;

namespace HU.OOP.Week1.Opdracht3 // Maar dit is hoe C# jaaaaarenlang heeft gewerkt.
{
    public class Program
    {
        public static void Main(string[] args) //en dit lijkt wel -heeeeel- veel op Java
        {
            Student student1 = new Student("Jan");
            Student student2 = new Student("Wim");

            Console.WriteLine(student1);
            Console.WriteLine(student2);
            //Dat valt tegen zeg...
        }
    }
}