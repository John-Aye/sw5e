package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Salvo extends Power
{
    public Salvo () {
        super();
        this.setLvl(4);
        this.setName("Salvo");
        this.setType("4th-level tech power");
        this.setDescription("You launch three projectiles at points you can see within range. Each creature within a 10-foot radius sphere of each point must make a Dexterity saving throw. A creature takes 3d6 re and 3d6 kinetic damage on a failed save, or half as much damage on a successful one. A creature in the area of more than one sphere is aected only once. The power damages objects in the area and ignites ammable objects that aren't being worn or carried. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 6th level or higher, you create four projectiles. When you cast this power using a tech slot of 8th level or higher, you create ve projectiles.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}