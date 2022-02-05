class Piloot:
    def __init__(self, naam):
        self.naam = naam
        self.salaris = 0
        self.vlieguren = 0

    def verhoogVliegurenMet(self, uren):
        self.vlieguren += uren

    def __str__(self):
        return f"{self.naam} heeft {self.vlieguren} vlieguren gemaakt en verdient {self.salaris:.2f}"


p1 = Piloot("John Travolta")
p1.salaris = 123456.78
print("Zonder vlieguren: " + str(p1))
p1.verhoogVliegurenMet(12)
print("Eerste piloot: " + str(p1))
print()
p2 = Piloot("Leonardo di Caprio")
p2.salaris = 5000.00
p2.verhoogVliegurenMet(3)
print("Vlieguren van tweede piloot: " + str(p2.vlieguren))
print("Salaris van tweede piloot: " + str(p2.salaris))
print("Tweede piloot: " + str(p2))
