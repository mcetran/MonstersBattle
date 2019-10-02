package com.company;

import java.util.Random;
import java.util.Scanner;

public class Arena {

    public static void main(String[] args) {
        WaterMonster haku = new WaterMonster("Haku", 15, 90, "water");
        WaterMonster carapuce = new WaterMonster("Carapuce", 14, 91, "water");
        GrassMonster feta = new GrassMonster("Feta", 11, 99, "grass");
        GrassMonster totoro = new GrassMonster("Totoro", 10, 100, "grass");
        FireMonster salameche = new FireMonster("Salameche", 21, 79, "fire");
        FireMonster isma = new FireMonster("Isma", 20, 80, "fire");
        Monster[] monsters = {haku, carapuce, feta, totoro, salameche, isma};
        chooseYourMonster();
        /*String tab[] = {"Haku", "Carapuce", "Feta", "Totoro", "Salameche", "Isma"};*/
        Random r = new Random();
        int randomAdversary = r.nextInt(monsters.length);
        System.out.println("The adversary is... " + monsters[randomAdversary] + " ! ");
    }

    public static String fight() {
        for (int i = 0; i < monsters.length; i++) {
            while (monsters[i].getLife() > 0 && monsters[r].getLife() > 0) {
                monsters[i].takeHit(monsters[r]);
                if (monsters[i].getLife() <= 0) {
                    break;
                }
                monsters[r].takeHit(monsters[i]);
            }
        }
    }

    public static void chooseYourMonster() {

        System.out.println("Please, choose your Monster between :");
        System.out.println("Haku = damage : 15, life : 90, type : water");
        System.out.println("Carapuce = damage : 14, life : 91, type : water");
        System.out.println("Feta = damage : 11, life : 99, type : grass");
        System.out.println("Totoro = damage : 10, life : 100, type : grass");
        System.out.println("Salameche = damage : 21, life : 79, type : fire");
        System.out.println("Isma = damage : 20, life : 80, type : fire");
        Scanner choice = new Scanner(System.in);
        String yourMonster = choice.nextLine();
        if (yourMonster.equals("Haku")) {
            System.out.println(fight());
        } else if (yourMonster.equals("Carapuce")) {
            System.out.println(fight());
        } else if (yourMonster.equals("Totoro")) {
            System.out.println(fight());
        } else if (yourMonster.equals("Feta")) {
            System.out.println(fight());
        } else if (yourMonster.equals("Salameche")) {
            System.out.println(fight());
        } else if (yourMonster.equals("Isma")) {
            System.out.println(fight());
        } else {
            System.out.println("Incorrect value. Try again!");
            chooseYourMonster();
        }
    }
}

