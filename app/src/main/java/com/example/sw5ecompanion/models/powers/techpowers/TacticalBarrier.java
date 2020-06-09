package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class TacticalBarrier extends Power
{
    public TacticalBarrier () {
        super();
        this.setLvl(1);
        this.setName("Tactical Barrier");
        this.setType("1st-level tech power");
        this.setDescription("A shimmering field appears and surrounds a creature of your choice within range, granting it a +2 bonus to AC for the duration.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 10 minutes");
    }
}