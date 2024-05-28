package n1exercici1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MesosDelAnyTest {
    private MesosDelAny mesosDelAny;

    @Before
    public void setUp() {
        mesosDelAny = new MesosDelAny();
    }

    @Test
    public void test12Posicions() {
        assertEquals(12, mesosDelAny.getMesos().getLength());
    }

    @Test
    public void testNoEsNull() {
        assertNotNull(mesosDelAny.getMesos());
    }

    @Test
    public void testPosicio8() {
        assertEquals("agost", mesosDelAny.getMesos().get(7));
    }
}