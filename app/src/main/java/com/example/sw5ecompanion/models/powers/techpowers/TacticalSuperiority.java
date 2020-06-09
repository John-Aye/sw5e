package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class TacticalSuperiority extends Power
{
    public TacticalSuperiority () {
        super();
        this.setLvl(7);
        this.setName("Tactical Superiority");
        this.setType("7th-level tech power");
        this.setDescription("Choose up to two willing creatures that you can see within range. Until the power ends, each targets' speed is doubled, they gain a +2 bonus to AC, they have advantage on Dexterity saving throws, and they gain an additional action on each of their turns. That action can be used only to take the Attack (one weapon attack only), Dash, Disengage, Hide, or the Use an Object Action. When the power ends, each target can't move or take actions until after its next turn, as a wave of lethargy sweeps over it. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 8th-level or higher, you can target one additional creature for each slot level above 7th.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}