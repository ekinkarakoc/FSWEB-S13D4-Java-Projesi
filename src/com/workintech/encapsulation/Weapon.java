package com.workintech.encapsulation;

public enum Weapon {
    SWORD(10,1.8),
    AXE(15,1.5),
    MACE(30,1.2);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
