package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class FlamingShots extends Power
{
    public FlamingShots() {
        super();
        this.setLvl(3);
        this.setName("Flame Shots");
        this.setType("3rd-level tech power");
        this.setDescription("You channel tech power through a blaster weapon you are wielding. When a target takes damage from the chosen weapon, the target takes an extra 1d6 re damage. The power ends when twelve shots have been red. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 4th level or higher, the number of shots you can take with this power increases by two for each slot level above 3rd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 hour");
    }
}