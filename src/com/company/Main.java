package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(100);
        boss.getSuperDefense();
        boss.printInfo();

        createHeroes();














    }


    public static void createHeroes () {
        Hero hero = new Hero(300, 50, "Fast");
        Hero hero1 = new Hero(350, 60);
        Hero hero2 = new Hero(250, 40, "Strong");
        hero.printInfo();
        hero1.printInfo();
        hero2.printInfo();

    }

}
