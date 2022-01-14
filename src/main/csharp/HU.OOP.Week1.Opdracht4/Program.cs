using System;

namespace HU.OOP.Week1.Opdracht4 
{
    public class Program
    {
        public static void Main(string[] args) 
        {
            Student st1 = new Student("Sylvester");
            Console.WriteLine("getter: " + st1.Naam); //C# wil hoofdletters, Java kleine letters, verder bijna hetzelfde
            Console.WriteLine("toString: " + st1.ToString());
            Console.WriteLine("toString (impliciet): " + st1);

            Student st2 = new Student("Karel");
            Console.WriteLine("getter: " + st2.Naam);
            Console.WriteLine("toString: " + st2.ToString());
            Console.WriteLine("toString (impliciet): " + st2);
        }
    }
}