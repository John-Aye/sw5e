import com.example.sw5ecompanion.models.powers.Power;

public class AnimateWeapon extends Power
{
    public AnimateWeapon() {
        super();
        this.setLvl(2);
        this.setName("Animate Weapon");
        this.setType("2nd-level universal power");
        this.setDescription("You select a melee weapon you wield, or one melee weapon within range that is not worn or carried by a conscious creature, and use the Force to cause it to levitate, acting as an extension of your will for the duration or until you cast this power again. When you use this power, you can cause the weapon to move up to 20 feet and make a melee force attack against a creature within 5 feet of it. On a hit, the target takes 1d8 + your forcecasting ability modier damage. The type is of the normal damage dealt by the weapon. While the weapon is animated, on each of your turns you can use a bonus action to move the weapon up to 20 feet and repeat the attack against a creature within 5 feet of it. At any time, you can end this force power to return the animated weapon to your hand. An enemy can attempt to gain control of the weapon by making a Strength (Athletics) check against your force save DC. On a success, the creature gains control of the weapon and the power ends. F o r c e P o t e n c y . When you cast this power using a force slot of 3rd level or higher, the weapon's damage increases by 1d8 for every two slot levels above 2nd. ");
        this.setPrerequiste("Force Disarm");
        this.setCastingTime("1 bonus action");
        this.setRange("60 ft");
        this.setDuration("1 minute");
    }
}