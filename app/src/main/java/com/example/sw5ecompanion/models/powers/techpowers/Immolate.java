package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Immolate extends Power
{
    public Immolate () {
        super();
        this.setLvl(5);
        this.setName("Immolate");
        this.setType("5th-level tech power");
        this.setDescription("Flames wreathe one creature you can see within range. The target must make a Dexterity saving throw. It takes 8d6 re damage on a failed save, or half as much damage on a successful one. On a failed save, the target also burns for the power's duration. The burning target sheds bright light in a 30-foot radius and dim light for an additional 30 feet. At the end of each of its turns, the target repeats the saving throw. It takes 4d6 re damage on a failed save, and the power ends on a successful one. These enhanced ames can't be extinguished by unenhanced means. If damage from this power kills a target, the target is turned to ash.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("90 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}