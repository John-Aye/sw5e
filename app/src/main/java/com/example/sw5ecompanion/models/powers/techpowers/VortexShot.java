package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class VortexShot extends Power
{
    public VortexShot () {
        super();
        this.setLvl(0);
        this.setName("Vortex Shot");
        this.setType("At-will tech power");
        this.setDescription("As part of the action used to cast this power, you must make a ranged attack with a weapon against one creature within your weapon's range, otherwise the power fails. On a hit, the target suers the attack's normal eects, and each Large or smaller creature within 10 feet of the target must succeed on a Strength saving throw or be pulled to the nearest unoccupied space adjacent to the target. This power deals additional damage when you reach higher levels. At 5th level, the ranged attack deals an extra 1d6 damage. This damage increases by 1d6 again at 11th level and 17th level. The damage is the same type as the weapon's damage.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("Instantaneous");
    }
}