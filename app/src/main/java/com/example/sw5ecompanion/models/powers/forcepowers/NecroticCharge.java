import com.example.sw5ecompanion.models.powers.Power;

public class NecroticCharge extends Power
{
    public NecroticCharge() {
        super();
        this.setLvl(0);
        this.setName("Necrotic Charge");
        this.setType("At-will dark side power");
        this.setDescription("As part of the action used to cast this power, you must make a melee attack with a weapon against one creature within your weapon's reach, otherwise the power fails. On a hit, the target suers the attack's normal eects, and you can choose to deal up to 1d8 of necrotic damage, which you suer as well. This damage can't be reduced or negated in any way. This power's damage increases when you reach higher levels. At 5th level, the melee attack deals an extra 1d8 necrotic damage to the target, and you can increase the secondary damage to 2d8. Both damage rolls increase by 1d8 at 11th level and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}