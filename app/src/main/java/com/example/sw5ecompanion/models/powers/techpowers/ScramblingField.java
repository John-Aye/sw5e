package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class ScramblingField extends Power
{
    public ScramblingField () {
        super();
        this.setLvl(8);
        this.setName("Scrambling Field");
        this.setType("8th-level tech power");
        this.setDescription("A 10-foot-radius shimmering sphere of power suppression surrounds you. Within the sphere, powers can't be cast and enhanced items become mundane. Until the power ends, the sphere moves with you, centered on you. Powers and other enhanced eects are suppressed in the sphere and can't protrude into it. A slot expended to cast a suppressed power is consumed. While an eect is suppressed, it doesn't function, but the time it spends suppressed counts against its duration. T a r g e t e d E f f e c t s . Powers and other enhanced eects that target a creature or an object in the sphere have no eect on that target. E n h a n c e d A r e a s . The area of another power or enhanced eect, such as e x pl o sio n , can't extend into the sphere. If the sphere overlaps an enhanced area, the part of the area that is covered by the sphere is suppressed. P o w e r s . Any active power or other enhanced eect on a creature or an object in the sphere is suppressed while the creature or object is in it. E n h a n c e d I t e m s . The properties and powers of enhanced items are suppressed in the sphere. For example, a +1 lightsaber in the sphere functions as an unenhanced lightsaber. An enhanced weapon's properties and powers are suppressed if it is used against a target in the sphere or wielded by an attacker in the sphere. If an enhanced weapon or a piece of enhanced ammunition fully leaves the sphere (for example, if you re an enhanced shot or throw an enhanced vibrospear at a target outside the sphere), the enhancement of the item ceases to be suppressed as soon as it exits. E n h a n c e d T r a v e l. Teleportation fails to work in the sphere, whether the sphere is the destination or the departure point for such enhanced travel. A portal to another location temporarily closes while in the sphere. C r e a t u r e s a n d O b j e c t s . A creature or object summoned or created by powers temporarily winks out of existence in the sphere. Such a creature instantly reappears once the space the creature occupied is no longer within the sphere. T e c h O v e r r i d e / D i m i n i s h T e c h . Powers and enhanced eects such as t e ch o v e r ride have no eect on the sphere. Likewise, the spheres created by dierent scrambling eld powers don't nullify each other.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self (10-foot-radius sphere)");
        this.setDuration("Concentration, up to 1 hour");
    }
}