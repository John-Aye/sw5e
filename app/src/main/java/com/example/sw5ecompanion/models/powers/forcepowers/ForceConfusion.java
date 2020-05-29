import com.example.sw5ecompanion.models.powers.Power;

public class ForceConfusion extends Power
{
    public ForceConfusion() {
        super();
        this.setLvl(6);
        this.setName("Force Confusion");
        this.setType("2nd-level universal power");
        this.setDescription("One humanoid of your choice that you can see within range must succeed on a Wisdom saving throw or become charmed by you for the duration. The charmed target must use its action before moving on each of its turns to make a melee attack against a creature other than itself that you mentally choose. The target can act normally on its turn if you choose no creature or if none are within its reach. On your subsequent turns, you must use your action to maintain control over the target, or the power ends. Also, the target can make a Wisdom saving throw at the end of each of its turns. On a success, the power ends.");
        this.setPrerequiste("Mind Trick");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}