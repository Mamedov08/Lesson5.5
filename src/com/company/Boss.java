package com.company;

public class Boss {

    private int hp;
    private  int damage;
    private String protection;

    public Boss(int hp, int damage, String protection) {
        this.hp = hp;
        this.damage = damage;
        this.protection = protection;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }
}

