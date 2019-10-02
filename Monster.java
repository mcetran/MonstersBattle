package com.company;

public class Monster {

    private String name;
    private int damage;
    private int life;

    public Monster(String name, int damage, int life) {
        this.name = name;
        this.damage = damage;
        this.life = life;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getLife() {
        return this.life;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void takeHit(Monster adversary) {
        this.life = this.life - adversary.damage;
        if (this.life > 0) {
            System.out.println(this.name + " received " + adversary.damage + " points of damage. " + this.name + " has " + this.life +
                    " points remaining.");
        } else {
            System.out.println(this.name + " is KO!");
        }
    }
}
