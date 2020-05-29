import com.example.sw5ecompanion.models.powers.Power;

public class ForceTechnique extends Power
{
    public ForceTechnique() {
        super();
        this.setLvl(0);
        this.setName("Force Technique");
        this.setType("At-will light side power");
        this.setDescription("You imbue your weapon with the purifying light of the Force. As part of the action used to cast this power, you must make a melee attack with a weapon against one creature within your weapon's reach, otherwise the power fails. On a hit, the target suers the attack's normal eects, and it becomes wreathed in a glowing barrier of force energy until the start of your next turn. If the target willingly moves before then, it immediately takes 1d8 force damage, and the power ends. This power's damage increases when you reach higher levels. At 5th level, the melee attack deals an extra 1d8 force damage to the target, and the damage the target takes for moving increases to 2d8. Both damage rolls increase by 1d8 at 11th level and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}