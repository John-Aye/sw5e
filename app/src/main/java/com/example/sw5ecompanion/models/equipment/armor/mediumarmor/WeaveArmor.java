package com.example.sw5ecompanion.models.equipment.armor.mediumarmor;

public class WeaveArmor extends MediumArmor {

    public WeaveArmor() {

        super();
        this.setName("Weave Armor");
        this.setCost(1000);
        this.setWeight(25);
        this.setDescription("Weave armor was constructed from a mesh of metal or composite plates " +
                "and a padded jumpsuit.  Variants of the armor included less plates and more " +
                "padding for a lighter, though less protective armor, and heavier plating with " +
                "molded pieces to fit the wearer.  Though the armor was available unmodified, " +
                "most users personalized their armor.");
        this.setArmor(4);
        this.setStealthPenalty(false);
    }
}
