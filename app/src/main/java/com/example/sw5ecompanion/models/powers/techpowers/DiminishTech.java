package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class DiminishTech extends Power
{
    public DiminishTech () {
        super();
        this.setLvl(3);
        this.setName("Diminish Tech");
        this.setType("3rd-level tech power");
        this.setDescription("Choose one creature, object, or tech eect within range. Any tech power of 3rd level or lower on the target ends. For each tech power of 4th level or higher on the target, make an ability check using your techcasting ability. The DC equals 10 + the power's level. On a success, the power ends. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 4th level or higher, you automatically end the eects of a tech power on the target if the power's level is equal to or less than the level of the tech slot you used.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Instantaneous");
    }
}