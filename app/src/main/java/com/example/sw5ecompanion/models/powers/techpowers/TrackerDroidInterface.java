package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class TrackerDroidInterface extends Power
{
    public TrackerDroidInterface () {
        super();
        this.setLvl(1);
        this.setName("Tracker Droid Interface");
        this.setType("1st-level tech power");
        this.setDescription("You interface a tracker droid with your tech focus, creating a permanent link. Your tracker droid acts independently of you, but it always obeys your commands. In combat, it acts on your turn. While your tracker droid is within 100 feet of you, you can communicate with it via your tech focus. Additionally, as an action, you can see through your droid's vision and hear what it hears until the start of your next turn, gaining the benets of any special senses that the droid has. During this time, you are deaf and blind with regard to your own senses. You can't maintain an interface between more than one tracker droid and your tech focus at a time. Finally, when you cast a tech power with a range of touch, your tracker can deliver the power as if it had cast it. Your tracker droid must be within 100 feet of you, and it must use its reaction to deliver the power when you cast it. If the power requires an attack roll, you use your attack modier for the roll. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 3rd level or higher, you can maintain a link with one more tracker droid for every two slot levels above 1st. Multiple tracker droids act on the same initiative. You can only see through one droid's vision at a time, but you can toggle between droids as a bonus action. Each droid must still be within 100 feet of you.");
        this.setPrerequiste("");
        this.setCastingTime("1 hour");
        this.setRange("10 feet");
        this.setDuration("Instantaneous");
    }
}