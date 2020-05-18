package com.example.sw5ecompanion.models.equipment.armor.heavyarmor;

public class BattleArmor extends HeavyArmor {

    public BattleArmor() {

        super();
        this.setName("Battle Armor");
        this.setCost(750);
        this.setWeight(55);
        this.setDescription("Battle Armor is an armor that reduced weight, but restricts movement." +
                "  The armor is commonly used by mercenaries, bounty hunters, soldiers and civilians" +
                " that live in dangerous areas.");
        this.setArmor(6);
        this.setStrength(13);
    }
}
