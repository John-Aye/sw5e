package com.example.sw5ecompanion.models.equipment.accessories;

public class StealthFieldGenerator extends Accessories {

    public StealthFieldGenerator() {

        super();
        this.setName("Stealth Field Generator");
        this.setCost(8000);
        this.setWeight(3);
        this.setDescription("Stealth field generators are special devices typically worn on belts " +
                "that function as a portable, personal cloaking device.  Activating or " +
                "deactivating the generator requires a bonus action and while, while active, " +
                "you have advantage on Dexterity (Stealth) ability checks that rely on sight.  " +
                "The generator lasts for 1 minute and can be recharged by a power source or " +
                "replacing the power cell.  This effect ends early if you make an attack or cast " +
                "a force- or tech- power.");
    }
}
