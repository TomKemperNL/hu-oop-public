// See https://aka.ms/new-console-template for more information

using HU.OOP.Week1.OpdrachtPiloot;

Piloot p1 = new Piloot("John Travolta");
p1.Salaris = 123456.78;
Console.WriteLine("Zonder vlieguren: " + p1.ToString());
p1.VerhoogVliegurenMet(12);
Console.WriteLine("Eerste piloot: " + p1);
Console.WriteLine();
Piloot p2 = new Piloot("Leonardo di Caprio");
p2.Salaris = 5000.00;
p2.VerhoogVliegurenMet(3);
Console.WriteLine("Vlieguren van tweede piloot: " + p2.Vlieguren);
Console.WriteLine("Salaris van tweede piloot: " + p2.Salaris);
Console.WriteLine("Tweede piloot: " + p2);