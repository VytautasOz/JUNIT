package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkaiciuokleTest {
    Skaiciuokle skaiciuokle = new Skaiciuokle(2,1);

    @Test
    void validSudetis() {
        assertEquals(3,skaiciuokle.sudetis());
    }
    @Test
    void invalidSudetis() {
        assertNotEquals(4,skaiciuokle.sudetis());
    }

    @Test
    void validAtimtis() {
        assertEquals(1,skaiciuokle.atimtis());
    }

    @Test
    void ivalidAtimtis() {
        assertNotEquals(4,skaiciuokle.atimtis());
    }

    @Test
    void validDaugyba() {
        assertEquals(2,skaiciuokle.daugyba());
    }

    @Test
    void invalidDaugyba() {
        assertNotEquals(4,skaiciuokle.daugyba());
    }

    @Test
    void validDalyba() {
        assertEquals(2,skaiciuokle.dalyba());
    }

    @Test
    void ivalidDalyba() {
        assertNotEquals(4,skaiciuokle.dalyba());
    }

    @Test
    void shouldThrowExceptionDalybaFrom0() {
        Skaiciuokle skaiciuokle2 = new Skaiciuokle(2,0);
        assertThrows(IllegalArgumentException.class, skaiciuokle2::dalyba);
    }
}