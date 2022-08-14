package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(500, 60, "Маг");
        System.out.println(boss.getDamage() + " " + boss.getHp() + " " + boss.getProtection());
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getDamage() + " " + createHeroes()[i].getHp() + " " + createHeroes()[i].getSuperAbility());
        }
    }
    public static Hero[] createHeroes() {
        Hero kaner = new Hero(100, 50);
        Hero kanatbekovsArena = new Hero(100, 80);
        Hero acer = new Hero(120, 40,"Маг");
        Hero[] hero2 = {kaner, kanatbekovsArena, acer};
            return hero2;

    }
}
