package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class PoisonDart extends Power
{
    public PoisonDart () {
        super();
        this.setLvl(1);
        this.setName("Poison Dart");
        this.setType("1st-level tech power");
        this.setDescription("Make a ranged tech attack against a creature within range. On hit, the target takes 2d8 poison damage and must make a Constitution save. On a failed save, it is also poisoned until the end of your next turn. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the damage increases by 1d8 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}