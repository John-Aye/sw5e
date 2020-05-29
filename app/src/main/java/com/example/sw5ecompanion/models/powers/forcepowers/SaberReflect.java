import com.example.sw5ecompanion.models.powers.Power;

public class SaberReflect extends Power
{
    public SaberReflect() {
        super();
        this.setLvl(0);
        this.setName("Saber Reflect");
        this.setType("At-will universal power");
        this.setDescription("In response to being attacked, you raise your weapon to attempt to deect. When you you use this power, the damage you take from the attack is reduced by 1d6. If you reduce the damage to 0, you're wielding a lightweapon or vibroweapon, and the damage is energy or ion, you can reect the attack at a target within range as part of the same reaction. Make a ranged force attack at a target you can see. The attack has a normal range of 20 feet and a long range of 60 feet. On a hit, the target takes the triggering attack's normal damage. The power's damage reduction increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).");
        this.setPrerequiste("");
        this.setCastingTime("1 reaction, which you take in response to being hit by a ranged attack");
        this.setRange("Self");
        this.setDuration("Instantaneous");
    }
}