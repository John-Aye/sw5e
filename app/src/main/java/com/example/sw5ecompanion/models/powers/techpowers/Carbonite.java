import com.example.sw5ecompanion.models.powers.Power;

public class Carbonite extends Power
{
    public Carbonite () {
        super();
        this.setLvl(6);
        this.setName("Carbon Fog");
        this.setType("6th-level tech power");
        this.setDescription("You attempt to freeze one creature that you can see within range into carbonite. The creature must make a Constitution saving throw. On a failed save, it is restrained as its esh begins to harden. On a successful save, the creature isn't aected. A creature restrained by this power must make another Constitution saving throw at the end of each of its turns. If it successfully saves against this power three times, the power ends. If it fails its saves three times, it is turned to stone and subjected to the petried condition for the duration. The successes and failures don't need to be consecutive; keep track of both until the target collects three of a kind. If the creature is physically broken while frozen in carbonite, it suers from similar deformities if it reverts to its original state. If you maintain your concentration on this power for the entire possible duration, the creature is frozen in carbonite until the eect is removed.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}