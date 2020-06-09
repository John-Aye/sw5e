package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class KoltoCloud extends Power
{
    public KoltoCloud () {
        super();
        this.setLvl(3);
        this.setName("Kolto Cloud");
        this.setType("3rd-level tech power");
        this.setDescription("As you expel kolto, up to six creatures of your choice that you can see within range regain hit points equal to 1d4 + your techcasting ability modier. This power has no eect on droids or constructs. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 4th level or higher, the healing increases by 1d4 for each slot level above 3rd.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}