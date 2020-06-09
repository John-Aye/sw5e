package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Pyrotechnics extends Power
{
    public Pyrotechnics () {
        super();
        this.setLvl(2);
        this.setName("Pyrotechnics");
        this.setType("2nd-level tech power");
        this.setDescription("Choose an area of unenhanced ame that you can see and that ts within a 5-foot cube within range. You can extinguish the re in that area, and you create either reworks or smoke when you do so. F i r e w o r k s . The target explodes with a dazzling display of colors. Each creature within 10 feet of the target must succeed on a Constitution saving throw or become blinded until the end of your next turn. S m o k e . Thick black smoke spreads out from the target in a 20-foot radius, moving around corners. The area of the smoke is heavily obscured. The smoke persists for 1 minute or until a strong wind disperses it.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}