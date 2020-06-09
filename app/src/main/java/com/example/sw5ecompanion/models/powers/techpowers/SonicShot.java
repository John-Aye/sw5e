package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class SonicShot extends Power
{
    public SonicShot () {
        super();
        this.setLvl(0);
        this.setName("Sonic Shot");
        this.setType("At-will tech power");
        this.setDescription("As part of the action used to cast this power, you must make a ranged attack with a weapon against one creature within your weapon's range, otherwise the power fails. On a hit, the target suers the attack's normal eects, and it becomes wreathed in a sonic barrier until the start of your next turn. If the target willingly moves before then, it immediately takes sonic damage equal to your techcasting modier, becomes deafened until the start of your next turn, and the power ends. This power's damage increases when you reach higher levels. At 5th level, the ranged attack deals an extra 1d6 sonic damage to the target, and the damage the target takes for moving increases to 1d6 + your techcasting ability modier. Both damage rolls increase by an additional 1d6 at 11th and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}