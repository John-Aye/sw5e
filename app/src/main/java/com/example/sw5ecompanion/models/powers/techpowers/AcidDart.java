import com.example.sw5ecompanion.models.powers.Power;

public class AcidDart extends Power
{
    public AcidDart () {
        super();
        this.setLvl(2);
        this.setName("Acid Dart");
        this.setType("2nd-level tech power");
        this.setDescription("A shimmering green dart streaks toward a target within range and bursts in a spray of acid. Make a ranged tech attack against the target. On a hit, the target takes 4d4 acid damage immediately and 2d4 acid damage at the end of its next turn. On a miss, the dart splashes the target with acid for half as much of the initial damage and no damage at the end of its next turn. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 3rd level or higher, the damage (both initial and later) increases by 1d4 for each slot level above 2nd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("90 feet");
        this.setDuration("Instantaneous");
    }
}