package com.alishbek;

public class Main {

    public static void main(String[] args) {
	HavingSuperAbility[] havingSuperAbilities ={new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            if (havingSuperAbilities[i] instanceof Magic) {
                havingSuperAbilities[i].applySuperAbility("Fire");
            } else if (havingSuperAbilities[i] instanceof Medic) {
                havingSuperAbilities[i].applySuperAbility("Heal");
            } else {
                havingSuperAbilities[i].applySuperAbility("Super Damage");
            }

        }

    }
}
