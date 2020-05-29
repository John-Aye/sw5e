import com.example.sw5ecompanion.models.powers.Power;

public class AcidicStrike extends Power
{
    public AcidicStrike () {
        super();
        this.setLvl(0);
        this.setName("Acidic Strike");
        this.setType("At-will tech power");
        this.setDescription("As part of the action used to cast this power, you must make a melee attack with a weapon against one creature within your weapon's reach, otherwise the power fails. On a hit, the target suers the attack's normal eects, and it becomes sheathed in a thick acidic slime until the start of your next turn. Until the start of your next turn, if the target succeeds in grappling or maintaining a grapple, the slime is pressed into its body, causing it to immediately take 1d8 acid damage. This power's damage increases when you reach higher levels. At 5th level, the melee attack deals an extra 1d8 acid damage to the target, and the damage the target takes for taking grappling or maintaining a grapple increases to 2d8. Both damage rolls increase by 1d8 at 11th level and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}