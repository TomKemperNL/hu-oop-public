package nl.hu.oop.werkboek.week2.les1;

import nl.hu.oop.werkboek.week2.les1.opdracht1.Zwembad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {

    @Test
    public void testInhoud(){
        assertEquals(30.0, new Zwembad(5, 3, 2).inhoud());
    }

}
