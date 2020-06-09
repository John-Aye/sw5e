package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class RimeShot extends Power
{
    public RimeShot () {
        super();
        this.setLvl(0);
        this.setName("Rime Shot");
        this.setType("At-will tech power");
        this.setDescription("As part of the action used to cast this power, you must make a ranged attack with a weapon against one creature within your weapon's range, otherwise the power fails. On a hit, the target suers the attack's normal eects, and the creature's movement speed is halved until the end of its turn as the air around it turns frigid. This power deals additional damage when you reach higher levels. At 5th level the ranged attack deals an extra 1d6 cold damage. This damage increases by 1d6 again at 11th level and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}