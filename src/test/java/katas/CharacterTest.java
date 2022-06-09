package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    //ITERATION ONE

    @Test
    public void allCharactersWhenCreatedStartWith1000Health() {
        Character fighter = new Character();
        assertEquals(1000, fighter.getHealth());
    }

    @Test
    public void allCharactersStartLevelAt1() {
        Character fighter = new Character();
        assertEquals(1, fighter.getLevel());
    }

    @Test
    public void allCharactersMayStartAlive() {
        Character fighter = new Character();
        assertEquals(true, fighter.getIsAlive());
    }

    @Test
    public void damageIsSubtractedFromHealth() {
        Character attacker = new Character();
        Character damaged = new Character();
        attacker.attaks(damaged, 10);
        assertEquals(990, damaged.getHealth());
    }

    @Test
    public void whenHealthBecomesZeroCharacterDies() {
        Character damaged = new Character();
        damaged.setHealth(0);
        damaged.healthZeroDie();
        assertEquals(false, damaged.getIsAlive());
    }

    @Test
    public void characterHealCharacter() {
        Character fighter = new Character();
        fighter.setHealth(500);
        fighter.healing(fighter, 10);
        assertEquals(510, fighter.getHealth());
    }

    @Test
    public void maxHealth() {
        Character fighter = new Character();
        fighter.getMaxHealth(1000);
        assertEquals(1000, fighter.getHealth());
    }

    //ITERATION TWO


}