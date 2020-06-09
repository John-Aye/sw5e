package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class EnhanceWeapon extends Power
{
    public EnhanceWeapon () {
        super();
        this.setLvl(3);
        this.setName("Enhance Weapon");
        this.setType("3rd-level tech power");
        this.setDescription("An unenhanced weapon you touch becomes an enhanced weapon. Choose one of these damage types: acid, cold, energy, re, ion, kinetic, or lightning. For the duration, an unenhanced weapon you touch has a +1 to attack rolls and deals an extra 1d4 damage of the chosen type. O v e r c h a r g e T e c h . When you cast this power using a 5th or 6th level tech slot, the bonus to attack rolls increases to +2 and the extra damage increases to 2d4. When you use a slot of 7th level or higher, the bonus increases to +3 and the extra damage increases to 3d4.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 hour");
    }
}