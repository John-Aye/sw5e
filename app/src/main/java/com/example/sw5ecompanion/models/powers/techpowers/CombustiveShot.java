import com.example.sw5ecompanion.models.powers.Power;

public class CombustiveShot extends Power
{
    public CombustiveShot () {
        super();
        this.setLvl(0);
        this.setName("Combustive Shot");
        this.setType("At-will tech power");
        this.setDescription("As part of the action used to cast this power, you must make a ranged attack with a weapon against one creature within your weapon's range, otherwise the power fails. On a hit, the target suers the attack's normal eects, and it ignites in ame. At the start of your next turn, the creature takes re damage equal to your techcasting ability modier. If the target or a creature within 5 feet of it uses an action to put out the ames, or if some other eect douses the ames, the eect ends. This power's damage increases when you reach higher levels. At 5th level, the ranged attack deals an extra 1d6 re damage to the target, and the damage at the start of your next turn increases to 1d4 + your tech casting ability modier. Both damage rolls increase by 1d6 and 1d4, respectively, at 11th level and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}