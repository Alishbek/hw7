package com.alishbek;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Warrior применил суперспособность "+superAbilityType);
    }
}
