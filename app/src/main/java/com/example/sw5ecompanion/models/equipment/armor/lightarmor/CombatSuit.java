package com.example.sw5ecompanion.models.equipment.armor.lightarmor;

public class CombatSuit extends LightArmor {

    public CombatSuit() {

        super();
        this.setName("Combat Suit");
        this.setCost(100);
        this.setWeight(10);
        this.setDescription("Combat suits are seen all over the galaxy, and can be found for sale " +
                "by almost any merchant who dealt in weapons and armor.  Many such suits who dealt " +
                "in weapons and armor.  Many such suits are used by military organizations, such " +
                "as the Galactic Republic's military, as well as by mercenaries, criminals, bounty " +
                "hunters and even some Jedi");
        this.setArmor(1);
    }
}
