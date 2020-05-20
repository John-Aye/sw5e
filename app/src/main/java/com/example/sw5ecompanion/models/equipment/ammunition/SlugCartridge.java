package com.example.sw5ecompanion.models.equipment.ammunition;

public class SlugCartridge extends Ammunition {

    public SlugCartridge() {

        super();
        this.setName("Slug Cartridge");
        this.setCost(2);
        this.setWeight(0);
        this.setDescription("Slug cartridges are ammunition for blaster weapons that deal " +
                "kinetic damage.  When you reload a weapon that uses cartridges, you can reload " +
                "any number of cartridges up to the weapon's reload number as part of the same " +
                "action.");
        this.setUses(1);
    }
}
