package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class IonicBond extends Power
{
    public IonicBond () {
        super();
        this.setLvl(1);
        this.setName("Ionic Bond");
        this.setType("1st-level tech power");
        this.setDescription("A beam of ion energy lances out toward a creature within range, forming a sustained line between you and the target. Make a ranged tech attack against that creature. On a hit, the target takes 1d8 ion damage, and on each of your turns for the duration, you can use a bonus action to deal 1d8 ion damage to the target automatically. The power ends if you use your bonus action to do anything else. The power also ends if the target is ever outside the power's range or if it has total cover from you. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the initial damage increases by 1d8 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}