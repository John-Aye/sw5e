import com.example.sw5ecompanion.models.powers.Power;

public class LightningCharge extends Power
{
    public LightningCharge () {
        super();
        this.setLvl(0);
        this.setName("Lightning Charge");
        this.setType("At-will dark side power");
        this.setDescription("You imbue your weapon with debilitating force lightning. As part of the action used to cast this power, you must make a melee attack with a weapon against one creature within your weapon's reach, otherwise the power fails. On a hit, the target suers the attack's normal eects, and the lightning leaps from the target to a dierent creature of your choice that you can see within 5 feet of it. The second creature takes lightning damage equal to your forcecasting ability modier. This power's damage increases when you reach higher levels. At 5th level, the melee attack deals an extra 1d8 lightning damage to the target, and the lightning damage to the second creature increases to 1d8 + your forcecasting ability modier. Both damage rolls increase by 1d8 at 11th level and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("1 round");
    }
    
}