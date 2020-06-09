package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class KoltoInfusion extends Power
{
    public KoltoInfusion () {
        super();
        this.setLvl(6);
        this.setName("Kolto Infusion");
        this.setType("6th-level tech power");
        this.setDescription("Choose a creature that you can see within range. A surge of kolto energy washes over the creature, causing it to regain 70 hit points. This power also ends blindness, deafness, and any diseases aecting the target. This power has no eect on droids or constructs. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 7th level or higher, the amount of healing increases by 10 for each slot level above 6th.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}