package com.company;

public class WaterMonster extends Monster {

    public WaterMonster(String name, int damage, int life, String type) {
        super(name, damage, life, type);
    }

    @Override
    public String typeMonster() {
        return getName() + " is a " + getType() + " monster!";
    }

    public int takeHitType(Monster adversary) {
        if (adversary.getType().equals("grass")) {
            return getDamage() / 2;
        }
        if (adversary.getType().equals("fire")) {
            return getDamage() * 2;
        }
        return 0;
    }
}
