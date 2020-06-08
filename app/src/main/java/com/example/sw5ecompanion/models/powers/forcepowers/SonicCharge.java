import com.example.sw5ecompanion.models.powers.Power;

public class SonicCharge extends Power
{
    public SonicCharge () {
        super();
        this.setLvl(0);
        this.setName("Sonic Charge");
        this.setType("At-will universal power");
        this.setDescription("As part of the action used to cast this power, you must make a melee attack with a weapon against one creature within your weapon's reach, otherwise the power fails. On a hit, the target suers the attack's normal eects, and you begin to emanate a disturbing hum until the start of your next turn. If a hostile creature ends its turn within 5 feet of you, it takes 1d4 sonic damage. This power's damage increases when you reach higher levels. At 5th level, the melee attack deals an extra 1d8 sonic damage to the target, and the secondary damage increases by 1d4. Both damage rolls increase by 1d8 and 1d4, respectively, at 11th level and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}