package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class StackTheDeck extends Power
{
    public StackTheDeck() {
        super();
        this.setLvl(1);
        this.setName("Spot The Weakness");
        this.setType("1st-level tech power");
        this.setDescription("You boost up to three creatures of your choice within range. Whenever a target makes an attack roll or a saving throw before the power ends, the target can roll a d4 and add the number rolled to the attack roll or saving throw. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, you can target one additional creature for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}