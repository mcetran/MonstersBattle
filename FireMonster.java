package com.company;

public class FireMonster extends Monster {

    public FireMonster(String name, int damage, int life, String type) {
        super(name, damage, life, type);
    }

    @Override
    public String typeMonster() {
        return getName() + " is a " + getType() + " monster!";
    }

    public int takeHit(Monster adversary) {
        if (adversary.getType().equals("water")) {
            return getDamage() / 2;
        }
        if (adversary.getType().equals("grass")) {
            return getDamage() * 2;
        }
        return 0;
    }
}
