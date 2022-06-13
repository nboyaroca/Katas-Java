package katas;

public class MeleeFighter extends Character {
    public static int maxRange() {
        return 2;
    }

    public void attack(Character meleeFighter, int range) {
        meleeFighter.range(maxRange());
    }
}
