package com.example.sw5ecompanion.models.equipment.armor.mediumarmor;

public class CompositeArmor extends MediumArmor {

    public CompositeArmor() {

        super();
        this.setName("Composite Armor");
        this.setCost(2500);
        this.setWeight(45);
        this.setDescription("Composite armor is a type of armored suit offers a good balance " +
                "of mobility and protection against most types of weapons.  The micro-hydraulics " +
                "of this type of powered armor provide the operator with protection, but are more " +
                "bulky than mesh or weave armors.  This type of armor is rarely seen outside of " +
                "professional mercenaries' and soldiers' use.");
        this.setArmor(5);
        this.setStealthPenalty(true);
    }
}
