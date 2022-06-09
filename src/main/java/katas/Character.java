package katas;

public class Character {

    private int health = 1000;

    private int maxHealth = 1000;

    private int level = 1;

    private boolean isAlive = true;

    public int getHealth() {
        return this.health;
    }

    public int getMaxHealth(int i) {
        return this.maxHealth;
    }

    public int getLevel() {
        return this.level;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public void setHealth(int value) {
        this.health = value;
    }

    public void attaks(Character victim, int damage) {
        victim.setHealth(victim.getHealth()-damage);
    }

    public void healthZeroDie() {
        if (this.health<=0) this.isAlive = false;
    }

    public void healing(Character fighter, int heal) {
        if (this.health != 0) fighter.setHealth(fighter.getHealth()+heal);
}

}


