package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class TargetLock extends Power
{
    public TargetLock () {
        super();
        this.setLvl(1);
        this.setName("Target Lock");
        this.setType("1st-level tech power");
        this.setDescription("You choose a creature you can see within range and mark it as your quarry. Until the power ends, you deal an extra 1d6 damage to the target whenever you hit it with a weapon attack, the target gains no benet from half cover and three-quarters cover against you, and if the target is invisible, you can see it as if it were visible. If the target drops to 0 hit points before this power ends, you can use a bonus action on a subsequent turn of yours to mark a new creature. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 3rd or 4th level, you can maintain your concentration on the power for up to 8 hours. When you use a tech slot of 5th level or higher, you can maintain your concentration on the power for up to 24 hours.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action");
        this.setRange("90 feet");
        this.setDuration("Concentration, up to 1 hour");
    }
}