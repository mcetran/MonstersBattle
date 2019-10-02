package com.company;

public class Arena {

    public static void main(String[] args) {
        Monster atef = new Monster("Atef", 20, 50);
        Monster elodie = new Monster("Elodie", 10, 49);
        while (atef.getLife() > 0 && elodie.getLife() > 0) {
            atef.takeHit(elodie);
            if (atef.getLife() <= 0) {
                break;
            }
            elodie.takeHit(atef);
        }
    }
}
