using System;

namespace HU.OOP.Week1.Opdracht2 // Maar dit is hoe C# jaaaaarenlang heeft gewerkt.
{
    public class Program
    {
        public static void Main(string[] args) //en dit lijkt wel -heeeeel- veel op Java
        {
            String naam1 = "Jan";
            String adres1 = "Nijenoord 1";
            String plaats1 = "Utrecht";

            String naam2 = "Wim";
            String adres2 = "Oudenoord 340";
            String plaats2 = "Utrecht";

            Console.WriteLine("De gegevens van nr 1 zijn:");
            Console.WriteLine(naam1);
            Console.WriteLine(adres1);
            Console.WriteLine(plaats1);
            Console.WriteLine();

            Console.WriteLine("De gegevens van nr 2 zijn:");
            Console.WriteLine(naam2);
            Console.WriteLine(adres2);
            Console.WriteLine(plaats2);;
        }
    }
}