package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class StormingShot extends Power
{
    public StormingShot () {
        super();
        this.setLvl(0);
        this.setName("Storming Shot");
        this.setType("At-will tech power");
        this.setDescription("As a part of the action used to cast this power, you must make a ranged attack with a weapon against one creature within your weapon's range, otherwise the power fails. On a hit, the target suers the attack's normal eects and gains the lightning rod debu until the end of your next turn, as energy begins to course through them. When this power hits a target, if there is a creature within 30 feet who has the lightning rod debu, then the energy discharges, creating an arc of lightning between them which removes the debu and deals 1d6 lightning damage to each of them. The power's damage increases when you reach higher levels. At 5th level, the eects of both the ranged weapon attack and discharge deal an extra 1d6 lightning damage. Both damage rolls increase by an additional 1d6 at 11th and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}