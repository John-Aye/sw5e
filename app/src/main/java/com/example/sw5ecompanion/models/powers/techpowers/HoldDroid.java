package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class HoldDroid extends Power
{
    public HoldDroid () {
        super();
        this.setLvl(2);
        this.setName("Hold Droid");
        this.setType("2nd-level tech power");
        this.setDescription("You emit a paralyzing dart at a droid or construct that you can see within range. The target must succeed on a Constitution saving throw or be paralyzed for the duration. At the end of each of its turns, the target can make another Constitution saving throw. On a success, the power ends on the target. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 3rd level or higher, you can target one additional droid or construct for each slot level above 2nd. The targets must be within 30 feet of each other when you target them.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}