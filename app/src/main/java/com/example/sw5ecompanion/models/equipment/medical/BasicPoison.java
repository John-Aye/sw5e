package com.example.sw5ecompanion.models.equipment.medical;

public class BasicPoison extends Medical {

    public BasicPoison() {

        super();
        this.setName("Basic Poison");
        this.setCost(125);
        this.setWeight(1);
        this.setDescription("As an action, you can use the poison in this vial to coat one " +
                "vibroweapon, one slug cartridge, or one wrist launcher dart.  A creature hit by " +
                "the poisoned weapon must make a DC 13 Constitution saving throw or take 1d4 " +
                "poison damage.  Once applied, the poison retains potency for 1 minute before " +
                "drying.");
        this.setUses(1);
    }
}
