import com.example.sw5ecompanion.models.powers.Power;

public class RimeStrike extends Power
{
    public RimeStrike () {
        super();
        this.setLvl(0);
        this.setName("Rime Strike");
        this.setType("At-will tech power");
        this.setDescription("As part of the action used to cast this power, you must make a melee attack with a weapon against one creature within your weapon's reach, otherwise the power fails. On a hit, the target suers the attack's normal eects, and its speed is reduced by 10 feet until the start of your next turn, as the cold energy seeps into its being. Additionally, if the target doesn't move at least 5 feet before the start of your next turn, it immediately takes 1d8 cold damage, and the power ends. This power's damage increases when you reach higher levels. At 5th level, the melee attack deals an extra 1d8 cold damage to the target, and the damage the target takes for not moving increases to 2d8. Both damage rolls increase by 1d8 at 11th level and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}