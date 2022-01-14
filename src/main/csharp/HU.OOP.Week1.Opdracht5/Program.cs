using System;

namespace HU.OOP.Week1.Opdracht4 
{
    public class Program
    {
        public static void Main(string[] args) 
        {
            Student st1 = new Student("Sylvester");

            Console.WriteLine("naam: " + st1.Naam);
            Console.WriteLine("nummer: " + st1.Nummer);
            st1.Nummer = 12345678;
            Console.WriteLine("toString: " + st1.ToString());
            Console.WriteLine();

            Student st2 = new Student("Karel", 98765432);
            Console.WriteLine("naam: " + st2.Naam);
            Console.WriteLine("nummer: " + st2.Nummer);
            Console.WriteLine("toString: " + st2.ToString());
        }
    }
}