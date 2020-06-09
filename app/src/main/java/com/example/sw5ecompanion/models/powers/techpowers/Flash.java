package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Flash extends Power
{
    public Flash () {
        super();
        this.setLvl(1);
        this.setName("Flash");
        this.setType("1st-level tech power");
        this.setDescription("You create a massive ash of light and explosion of sound at a point within range. Roll 6d10; the total is how many hit points of creatures this power can aect. Creatures within 20 feet of the point are aected in ascending order of their current hit points (ignoring unconscious creatures). Starting with the creature that has the lowest current hit points, each creature aected by this power is blinded until the end of your next turn. Subtract each creature's hit points from the total before moving on to the creature with the next lowest hit points. A creature's hit points must be equal to or less than the remaining total for that creature to be aected. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, roll an additional 2d10 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("90 feet");
        this.setDuration("1 round");
    }
}