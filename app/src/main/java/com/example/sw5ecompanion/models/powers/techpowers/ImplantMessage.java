package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class ImplantMessage extends Power
{
    public ImplantMessage () {
        super();
        this.setLvl(2);
        this.setName("ImplantMessage");
        this.setType("2nd-level tech power");
        this.setDescription("You implant a message within an object in range, a message that is uttered when a trigger condition is met. Choose an object that you can see and that isn't being worn or carried by another creature. Then speak the message, which must be 25 words or less, though it can be delivered over as long as 10 minutes. Finally, determine the circumstance that will trigger the power to deliver your message. When that circumstance occurs, the message is recited in your voice and at the same volume you spoke. When you cast this power, you can have the power end after it delivers its message, or it can remain and repeat its message whenever the trigger occurs. The triggering circumstance can be as general or as detailed as you like, though it must be based on visual or audible conditions that occur within 30 feet of the object. For example, you could instruct the message to play when any creature moves within 30 feet of the object or when a bell rings within 30 feet of it.");
        this.setPrerequiste("");
        this.setCastingTime("1 minute");
        this.setRange("30 feet");
        this.setDuration("Until dispelled");
    }
}