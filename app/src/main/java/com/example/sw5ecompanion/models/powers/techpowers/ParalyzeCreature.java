package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class ParalyzeCreature extends Power
{
    public ParalyzeCreature () {
        super();
        this.setLvl(5);
        this.setName("Paralyze Creature");
        this.setType("5th-level tech power");
        this.setDescription("You emit a paralyzing dart at a creature that you can see within range. The target must succeed on a Constitution saving throw or be poisoned for the duration. While poisoned in this way, the target is paralyzed. At the end of each of its turns, the target can make another Constitution saving throw. On a success, the power ends on the target. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 6th level or higher, you can target one additional creature for each slot level above 5th. The creatures must be within 30 feet of each other when you target them.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("90 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}