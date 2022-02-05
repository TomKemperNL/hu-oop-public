class Zwembad:
    def __init__(self, breedte=0.0, lengte=0.0, diepte=0.0):
        self.breedte = breedte
        self.lengte = lengte
        self.diepte = diepte

    @property  # Als je dit er niet bijzet moet je hieronder z1.inhoud() typen ipv. z1.inhoud. Niet heel belangrijk
    def inhoud(self):
        return self.breedte * self.diepte * self.lengte

    def __str__(self):
        return f"Dit zwembad is {self.breedte} meter breed, {self.lengte} meter lang, en {self.diepte} meter diep"


if __name__ == '__main__':
    z1 = Zwembad(2.0, 5.5, 1.5)
    print("BREEDTE: " + str(z1.breedte))
    print("LENGTE: " + str(z1.lengte))
    print("DIEPTE: " + str(z1.diepte))
    print("BEREKENDE INHOUD: " + str(z1.inhoud))
    print()

    z2 = Zwembad()
    z2.breedte = 2.5
    z2.lengte = 100.0
    z2.diepte = 2.0
    inh = z2.inhoud
    print("GEGEVENS ZWEMBAD: " + str(z2))
    print("BEREKENDE INHOUD: " + str(z2.inhoud))
