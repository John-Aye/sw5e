package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Hologram extends Power
{
    public Hologram () {
        super();
        this.setLvl(1);
        this.setName("Holographic Disguise");
        this.setType("1st-level tech power");
        this.setDescription("You create an image that is no larger than a 15-foot cube. The image appears at a spot within range and lasts for the duration. The image is purely visual. If anything passes through it, it is revealed to be an illusion. You can use your action to cause the image to move to any spot within range. As the image changes location, you can alter its appearance so that its movements appear natural for the image. A creature that uses its action to examine the image can determine that it is an illusion with a successful Intelligence (Investigation) check against your tech save DC. If a creature discerns the illusion for what it is, the creature can see through the image.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 10 minutes");
    }
}