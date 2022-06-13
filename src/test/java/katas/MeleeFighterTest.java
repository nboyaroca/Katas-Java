package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeleeFighterTest {

    @Test
    public void meleeFighterMaxRangeAttack() {
        var meleeFighter = new MeleeFighter();

        assertEquals(2, meleeFighter.maxRange());
    }

}