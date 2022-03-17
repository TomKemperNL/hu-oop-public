package nl.hu.ooad.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersoonTest {

    @Test
    void langMetHuisdier() {
        Persoon t = new Persoon("Tom", 'm');
        t.setLengte(2.06);
        Dier todor = new Dier("Kat", "Todor");
        t.setHuisdier(todor);

        assertEquals("Lange Tom met Todor (Kat)", t.toString());
    }
}