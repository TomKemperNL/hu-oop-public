// See https://aka.ms/new-console-template for more information

using HU.OOP.Week2.Opdracht31;

Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
Console.WriteLine("BREEDTE: " + z1.Breedte);
Console.WriteLine("LENGTE: " + z1.Lengte);
Console.WriteLine("DIEPTE: " + z1.Diepte);
Console.WriteLine("BEREKENDE INHOUD: " + z1.Inhoud);
Console.WriteLine();

Zwembad z2 = new Zwembad();
z2.Breedte = 2.5;
z2.Lengte = 100.0;
z2.Diepte = 2.0;
double inh = z2.Inhoud;
Console.WriteLine("GEGEVENS ZWEMBAD: " + z2.ToString());
Console.WriteLine("BEREKENDE INHOUD: " + z2.Inhoud);