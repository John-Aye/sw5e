package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class GleamingOutline extends Power
{
    public GleamingOutline () {
        super();
        this.setLvl(1);
        this.setName("Gleaming Outline");
        this.setType("1st-level tech power");
        this.setDescription("Each object in a 20-foot cube within range is outlined in blue, green, or violet light (your choice). Any creature in the area when the power is cast is also outlined in light if it fails a Dexterity saving throw. For the duration, objects and aected creatures shed dim light in a 10foot radius. Any attack roll against an aected creature or object has advantage if the attacker can see it, and the aected creature or object can't benet from being invisible.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}