package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class IonicStrike extends Power
{
    public IonicStrike () {
        super();
        this.setLvl(0);
        this.setName("Ionic Strike");
        this.setType("At-will tech power");
        this.setDescription("As part of the action used to cast this power, you must make a melee attack with a weapon against one creature within your weapon's reach, otherwise the power fails. On a hit, the target suers the attack's normal eects, and it becomes wreathed in an ionic discharge. If the target willingly takes a reaction before the start of your next turn, it immediately takes 1d6 ion damage, and the power ends. This power's damage increases when you reach higher levels. At 5th level, the melee attack deals an extra 1d6 ion damage to the target, and the damage the target takes for taking reactions increases to 2d6. Both damage rolls increase by 1d6 at 11th level and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}