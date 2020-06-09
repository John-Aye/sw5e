package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class KoltoPack extends Power
{
    public KoltoPack () {
        super();
        this.setLvl(1);
        this.setName("Kolto Pack");
        this.setType("1st-level tech power");
        this.setDescription("A creature of your choice that you can see within range regains hit points equal to 1d4 + your techcasting ability modier. This power has no eect on droids or constructs. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the healing increases by 1d4 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}