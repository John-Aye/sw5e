package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class GroupHologram extends Power
{
    public GroupHologram () {
        super();
        this.setLvl(5);
        this.setName("Group Hologram");
        this.setType("5th-level tech power");
        this.setDescription("This power allows you to change the appearance of any number of creatures that you can see within range. You give each target you choose a new, illusory appearance. An unwilling target can make a Charisma saving throw, and if it succeeds, it is unaected by this power. The power disguises physical appearance as well as clothing, armor, weapons, and equipment. You can make each creature seem 1 foot shorter or taller and appear thin, fat, or in between. You can't change a target's body type, so you must choose a form that has the same basic arrangement of limbs. Otherwise, the extent of the illusion is up to you. The power lasts for the duration, unless you use your action to dismiss it sooner. The changes wrought by this power fail to hold up to physical inspection. For example, if you use this power to add a hat to a creature's outt, objects pass through the hat, and anyone who touches it would feel nothing or would feel the creature's head and hair. If you use this power to appear thinner than you are, the hand of someone who reaches out to touch you would bump into you while it was seemingly still in midair. A creature can use its action to inspect a target and make an Intelligence (Investigation) check against your tech save DC. If it succeeds, it becomes aware that the target is disguised.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("8 hours");
    }
}