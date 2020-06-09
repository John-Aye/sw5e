package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class VenomousStrike extends Power
{
    public VenomousStrike () {
        super();
        this.setLvl(0);
        this.setName("Venomous Strike");
        this.setType("At-will tech power");
        this.setDescription("As part of the action used to cast this power, you must make a melee attack with a weapon against one creature within your weapon's reach, otherwise the power fails. On a hit, the target suers the attack's normal eects, and if you were hidden from it, it takes an additional 1d4 poison damage. This power's damage increases when you reach higher levels. At 5th level, the melee attack deals an extra 1d8 poison damage to the target, and the damage the target takes when you are hidden from it increases to 2d4. Both damage rolls increase by 1d8 and 1d4, respectively, at 11th level and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("Instantaneous");
    }
}