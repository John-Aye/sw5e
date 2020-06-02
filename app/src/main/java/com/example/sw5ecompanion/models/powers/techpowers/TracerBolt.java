import com.example.sw5ecompanion.models.powers.Power;

public class TracerBolt extends Power
{
    public TracerBolt () {
        super();
        this.setLvl(1);
        this.setName("Tracer Bolt");
        this.setType("1st-level tech power");
        this.setDescription("A flash of light streaks toward a creature of your choice within range. Make a ranged tech attack against the target. On a hit, the target takes 4d6 energy damage, and the next attack roll made against this target before the end of your next turn has advantage. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("120 feet");
        this.setDuration("1 round");
    }
}