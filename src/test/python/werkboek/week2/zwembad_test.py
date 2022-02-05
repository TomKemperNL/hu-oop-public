from werkboek.week2.zwembad import Zwembad


def test_inhoud():
    z = Zwembad(4, 3, 2)
    assert z.inhoud == 24
