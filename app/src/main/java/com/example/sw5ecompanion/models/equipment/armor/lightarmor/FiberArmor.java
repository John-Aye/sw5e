package com.example.sw5ecompanion.models.equipment.armor.lightarmor;

public class FiberArmor extends LightArmor {

    public FiberArmor() {

        super();
        this.setName("Fiber Armor");
        this.setCost(450);
        this.setWeight(13);
        this.setDescription("Fiber armor is a type of armor that offers more protection than the " +
                "lighter combat suit.  Fiber armor is heavier overall than combat suits, and not " +
                "quite as flexible, but many consider the trade-offs worthwhile.  It is a good " +
                "source of defence from physical attacks and light blaster fire.");
        this.setArmor(2);
    }
}
