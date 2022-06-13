package katas;

public class Character {

    public static final int MaxHEALTH = 1000;
    // CONSTANTS (or variables)
    private int health = MaxHEALTH;
    private int level = 1;
    private boolean alive = true;


    // METHODS
    public int getHealth() {
        return this.health;
    }

    public int getLevel() {
        return level;
    }

    public boolean isAlive() {
        return alive;
    }


    public void attacks(Character target, Character fighter, int damage) {
        if (target == this) return; // CLÀUSULA DE SALVAGUARDA
        target.damage(levelDifference5(target, fighter, damage));
    }
    private void damage(int damage) {
        if (this.health - damage <= 0) { // CLÀUSULA DE SALVAGUARDA
            this.alive = false;
            this.health = 0;
            return;
        }
        this.health -= damage;
    }

    public int levelDifference5(Character target, Character fighter, int damage) {
        if (target.level - fighter.level >=5 ) return damage/2;
        if (fighter.level - target.level >= 5) return damage*2;
        return damage;
    }

    public void modifyLevel(int i) {
        level += i;
    }

    public void healing(Character character, int heal) {
        if (character !=this) return; // CLÀUSULA DE SALVAGUARDA, si no és ell mateix no facis res
        character.heal(heal);
    }

    private void heal(int heal) {
        if (!this.alive) return; // CLÀUSULA DE SALVAGUARDA , si és mort no facis res
        this.health += heal;
        if (this.health > MaxHEALTH) this.health = MaxHEALTH;
    }

    protected void range(int maxRange) {

    }

    /*public void range(int maxRange) {
        this.range = maxRange;

    }*/
}


