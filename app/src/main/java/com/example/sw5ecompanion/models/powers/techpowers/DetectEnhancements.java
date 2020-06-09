package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class DetectEnhancements extends Power
{
    public DetectEnhancements() {
        super();
        this.setLvl(1);
        this.setName("Detect Enhancement");
        this.setType("1st-level tech power");
        this.setDescription("For the duration, you sense the presence of any enhancements within 30 feet of you. If you sense an enhancement in this way, you can use your action to see a faint aura around any visible creature or object in the area that bears an enhancement. The power is blocked by 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood or dirt.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 10 minutes");
    }
}