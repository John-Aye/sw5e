package com.example.sw5ecompanion.models.equipment.armor.mediumarmor;

public class MeshArmor extends MediumArmor {

    public MeshArmor() {

        super();
        this.setName("Mesh Armor");
        this.setCost(500);
        this.setWeight(20);
        this.setDescription("Providing solid protection for a minimal cost, mesh armor is " +
                "considered excellent protection for entrenched troops or guards.  However, this " +
                "protection comes at a cost of mobility, limiting its uses by rapidly advancing " +
                "infantry.  Still, it provides more mobility than battle armor.");
        this.setArmor(3);
        this.setStealthPenalty(false);
    }
}
