package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class ElementOfSurprise extends Power
{
    public ElementOfSurprise () {
        super();
        this.setLvl(1);
        this.setName("ElementOfSurprise");
        this.setType("1st-level tech power");
        this.setDescription("You expel a sabotage charge at the creature that attacked you. The creature must make a Dexterity saving throw. It takes 2d10 re damage on a failed save, or half as much damage on a successful one. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the damage increases by 1d10 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 reaction, which you take in response to being damaged by a creature within 60 feet of you that you can see");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}