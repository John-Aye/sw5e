package com.example.sw5ecompanion.models.equipment.armor.heavyarmor;

public class AssaultArmor extends HeavyArmor {

    public AssaultArmor() {

        super();
        this.setName("Assault Armor");
        this.setCost(2000);
        this.setWeight(60);
        this.setDescription("Assault armor improved on battle armor, with the benefit of micro-" +
                "hydraulics that boost the efficacy of the operator.  It offers better protection, " +
                "but increased the weight.");
        this.setArmor(7);
        this.setStrength(15);
    }
}
