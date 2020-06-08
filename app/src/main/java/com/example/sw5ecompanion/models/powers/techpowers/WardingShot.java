import com.example.sw5ecompanion.models.powers.Power;

public class WardingShot extends Power
{
    public WardingShot () {
        super();
        this.setLvl(0);
        this.setName("Warding Shot");
        this.setType("At-will tech power");
        this.setDescription("As part of the action used to cast this power, you must make a ranged attack with a weapon against one creature within your weapon's range, otherwise the power fails. On a hit, the target suers the attack's normal eects, and a dim barrier surrounds it. The rst time it would deal damage before the start of your next turn, that damage is reduced by 1d6. This power's damage reduction increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}