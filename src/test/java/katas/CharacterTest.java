package katas;

import org.junit.jupiter.api.Test;
import org.w3c.dom.html.HTMLElement;

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

        assertEquals(true, fighter.isAlive());
    }

    @Test
    public void characterAttacksAndDamageIsSubtractedFromHealth() {
        Character fighter = new Character();
        Character target = new Character();

        fighter.attacks(target, fighter, 10);

        assertEquals(990, target.getHealth());
    }

    @Test
    public void whenHealthBecomesLowerThanZeroCharacterDiesAndHealthTurnsZero() {
        Character fighter = new Character();
        Character target = new Character();

        fighter.attacks(target, fighter, 1000);

        assertEquals(0, target.getHealth());
        assertEquals(false, target.isAlive());
    }

    @Test
    public void characterHealCharacter() {
        //necessitem 2 personatges, un ataca i l'altre rep el mal i es cura ell mateix
        //esperem que el ferit estigui curat establint la nova salut
            //un ataca 50, el ferit rep 50 de mal
            //el ferit es cura amb 10
        //esperarem 960 de health del ferit
        Character fighter = new Character();
        Character target = new Character();

        fighter.attacks(target, fighter, 50);
        target.healing(target, 10);

        assertEquals(960, target.getHealth());
    }

    @Test
    public void deadCharactersCannotBeHealed() {
        Character fighter = new Character();
        Character target = new Character();

        fighter.attacks(target, fighter, 1500);
        target.healing(target, 600);

        assertEquals(0, target.getHealth());
        assertEquals(false, target.isAlive());
    }


    @Test
    public void cannotRaise1000Health() {
        Character fighter = new Character();
        Character target = new Character();

        fighter.attacks(target, fighter,500);
        target.healing(target, 600);

        assertEquals(1000, target.getHealth());
    }

    //ITERATION TWO

    @Test
    public void notSelfDamage() {
        Character fighter = new Character();

        fighter.attacks(fighter, fighter, 500);

        assertEquals(1000, fighter.getHealth());
    }

    @Test
    public void onlySelfHealing() {
        Character fighter = new Character();
        Character target = new Character();

        fighter.attacks(target, fighter,500);
        fighter.healing(target, 50);

        assertEquals(500, target.getHealth());
    }

    // If the target is 5 or more Levels above the attacker, Damage is reduced by 50%
    @Test
    public void whenTargetIs5MoreLevelsAboveReduceDamageHalf() {
        var fighter = new Character();
        var target = new Character();

        target.modifyLevel(7);
        fighter.attacks(target, fighter,100);

        assertEquals(950, target.getHealth());
    }

    // If the target is 5 or more Levels below the attacker, Damage is increased by 50%
    @Test
    public void whenTargetIs5MoreLevelsBelowIncreaseDamageDouble() {
        var fighter = new Character();
        var target = new Character();

        fighter.modifyLevel(7);
        fighter.attacks(target, fighter,100);

        assertEquals(800, target.getHealth());
    }

    //ITERATION THREE

    /*@Test
    public void meleeFighterMustBeInRangeToDealDamage() {
        MeleeFighter meleeFighter = new MeleeFighter();
        var target = new Character();

        meleeFighter.attack(target, 5);

        assertEquals(MeleeFighter.maxRange(), range());

    }*/

}