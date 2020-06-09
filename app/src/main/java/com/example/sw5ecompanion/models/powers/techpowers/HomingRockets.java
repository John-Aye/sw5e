package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class HomingRockets extends Power
{
    public HomingRockets () {
        super();
        this.setLvl(1);
        this.setName("Homing Rockets");
        this.setType("1st-level tech power");
        this.setDescription("You lock on to a target within range and expel a series of three small explosives. Each explosive hits a creature of your choice that you can see within range. An explosive deals 1d4 + 1 re damage to its target. The explosives all strike simultaneously, and you can direct them to hit one creature or several. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the power creates one more explosive for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Instantaneous");
    }
}