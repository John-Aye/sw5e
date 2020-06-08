import com.example.sw5ecompanion.models.powers.Power;

public class PsychicCharge extends Power
{
    public PsychicCharge() {
        super();
        this.setLvl(0);
        this.setName("Psychic Charge");
        this.setType("At-will dark side power");
        this.setDescription("As part of the action used to cast this power, you must make a melee attack with a weapon against one creature within your weapon's reach, otherwise the power fails. On a hit, the target suers the attack's normal eects, and its mouth is covered by a violet veil until the start of your next turn. If the target willingly speaks before then, it immediately takes 1d8 psychic damage, and the power ends. This power's damage increases when you reach higher levels. At 5th level, the melee attack deals an extra 1d8 psychic damage to the target, and the damage the target takes for speaking increases to 2d8. Both damage rolls increase by 1d8 at 11th level and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}