package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class FlameSweep extends Power
{
    public FlameSweep () {
        super();
        this.setLvl(1);
        this.setName("Flame Sweep");
        this.setType("1st-level tech power");
        this.setDescription("A thin sheet of flames shoots forth from you. Each creature in a 15-foot cone must make a Dexterity saving throw. A creature takes 3d6 re damage on a failed save, or half as much damage on a successful one. The re ignites any ammable objects in the area that aren't being worn or carried. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self (15-foot cone)");
        this.setDuration("Instantaneous");
    }
}