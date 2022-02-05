using NUnit.Framework;

namespace HU.OOP.Week2.Opdracht31;

using HU.OOP.Week2.Opdracht31;

public class Tests
{
    [SetUp]
    public void Setup()
    {
    }

    [Test]
    public void TestDiepte()
    {
        Zwembad z = new Zwembad(4, 3, 2);
        Assert.AreEqual(24, z.Inhoud);
    }
}