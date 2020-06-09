package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Disintegrate extends Power
{
    public Disintegrate () {
        super();
        this.setLvl(6);
        this.setName("Disintegrate");
        this.setType("6th-level tech power");
        this.setDescription("A blast of corrosive energy emits from you. Choose a target within range. A creature targeted by this power must make a Dexterity saving throw. On a failed save, the target takes 10d6 + 40 acid damage. If this damage reduces the target to 0 hit points, it is disintegrated. A disintegrated creature and everything it is wearing and carrying are reduced to a pile of ne gray dust. A creature destroyed in this way can not be revitalized. This power automatically disintegrates a Large or smaller object. If the target is a Huge or larger object, this power disintegrates a 10-foot-cube portion of it. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 7th level or higher, the damage increases by 3d6 for each slot level above 6th.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}