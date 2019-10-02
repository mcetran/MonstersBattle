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

        int yourMonster = chooseYourMonster();
        
        Random nb = new Random();
        int randomAdversary = nb.nextInt(monsters.length);
        System.out.println("The adversary is... " + monsters[randomAdversary] + " ! ");

        fight(yourMonster - 1, randomAdversary);

        /*String tab[] = {"Haku", "Carapuce", "Feta", "Totoro", "Salameche", "Isma"};*/
        


    }

    public static String fight(int indexPlayer, int indexEnemy) {
                while (monsters[indexPlayer].getLife() > 0 && monsters[indexEnemy].getLife() > 0) {
                    monsters[indexPlayer].takeHit(monsters[indexEnemy]);
                    if (monsters[indexPlayer].getLife() <= 0) {
                        break;
                    }
                    monsters[indexEnemy].takeHit(monsters[indexPlayer]);
                }
    }

    public static int chooseYourMonster() {

        System.out.println("Please, choose your Monster between :");
        System.out.println("1. Haku = damage : 15, life : 90, type : water");
        System.out.println("2. Carapuce = damage : 14, life : 91, type : water");
        System.out.println("3. Feta = damage : 11, life : 99, type : grass");
        System.out.println("4. Totoro = damage : 10, life : 100, type : grass");
        System.out.println("5. Salameche = damage : 21, life : 79, type : fire");
        System.out.println("6. Isma = damage : 20, life : 80, type : fire");
        Scanner choice = new Scanner(System.in);
        int yourMonster = choice.nextInt();

        System.out.println("You chose " + monsters[yourMonster - 1].getName());

        return yourMonster;
            

        // } else if (yourMonster.equals("Carapuce")) {
        //     System.out.println(fight(1));
        // } else if (yourMonster.equals("Totoro")) {
        //     System.out.println(fight(2));
        // } else if (yourMonster.equals("Feta")) {
        //     System.out.println(fight(3));
        // } else if (yourMonster.equals("Salameche")) {
        //     System.out.println(fight(4));
        // } else if (yourMonster.equals("Isma")) {
        //     System.out.println(fight(5));
        // } else {
        //     System.out.println("Incorrect value. Try again!");
        //     chooseYourMonster();
        // }
    }
}

