package com.workintech.encapsulation;

public class Console {
    public static void main(String[] args) {
        Player dogancan = new Player("Dogancan",-100,Weapon.SWORD);
        Player ali = new Player("Ali",1000,Weapon.AXE);

        System.out.println(dogancan);
        System.out.println(ali);

        dogancan.restoreHealth(110);
        System.out.println(dogancan);
    }
}
