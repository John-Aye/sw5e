package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class MotivatorBoost extends Power
{
    public MotivatorBoost () {
        super();
        this.setLvl(2);
        this.setName("Motivator Boost");
        this.setType("2nd-level tech power");
        this.setDescription("You imbue a willing droid or construct with heightened speed and maneuverability. Until the power ends, the target's speed is doubled, it gains a +2 bonus to AC, and it has advantage on Dexterity saving throws. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 3rd level or higher, you can target one additional droid or construct for each slot level above 2nd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}