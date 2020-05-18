package com.example.sw5ecompanion.models.equipment.armor.heavyarmor;

public class HeavyExoskeleton extends HeavyArmor {

    public HeavyExoskeleton() {

        super();
        this.setName("Heavy Exoskeleton");
        this.setCost(9000);
        this.setWeight(65);
        this.setDescription("Heavy exoskeletons are virtually the heaviest armor acquirable " +
                "during the Galactic War.  It is ideal for extreme combat situations that " +
                "involved direct damage and also offers a very good level of protection in " +
                "sacrifice of dexterity.  Some consider it claustrophobic but that was the " +
                "trade-off for safety");
        this.setArmor(8);
        this.setStrength(17);
    }
}
