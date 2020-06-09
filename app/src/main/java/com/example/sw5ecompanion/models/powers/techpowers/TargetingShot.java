package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class TargetingShot extends Power
{
    public TargetingShot () {
        super();
        this.setLvl(0);
        this.setName("Target Lock");
        this.setType("At-will tech power");
        this.setDescription("As part of the action used to cast this power, you must make a ranged attack with a weapon against one creature within your weapon's range, otherwise the power fails. On a hit, the target suers the attack's normal eects, and a small target only visible to you marks it. The next attack roll you make against the creature before the end of your next turn can't suer from disadvantage. This power deals additional damage when you reach higher levels. At 5th level, the ranged attack deals an extra 1d6 damage. This damage increases by 1d6 again at 11th level and 17th level. The damage is the same type as the weapon's damage.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}