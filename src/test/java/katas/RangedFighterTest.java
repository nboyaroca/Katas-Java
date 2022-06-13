package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangedFighterTest {

    @Test
    public void rangedFighterMaxRangeAttack() {
        var rangedFighter = new RangedFighter();

        assertEquals(20, rangedFighter.maxRange());
    }
}