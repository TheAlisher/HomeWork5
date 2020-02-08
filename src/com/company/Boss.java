package com.company;

import java.util.Random;

public class Boss {

    private int bossHealth;
    private int bossDamage;
    public static String[] bossDefenceType;
    public static String changeBossDefence = "";

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String[] getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(String[] bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }

    public static void changeBossDefenceType() {
        Random r = new Random();
        int randomIndex = r.nextInt(bossDefenceType.length);
        changeBossDefence = bossDefenceType[randomIndex];
    }
}
