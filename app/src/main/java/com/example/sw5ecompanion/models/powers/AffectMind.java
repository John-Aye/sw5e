import com.example.sw5ecompanion.models.powers.Power;

public class AffectMind extends Power
{
    public AffectMind() {
        super();
        this.setLvl(0);
        this.setName("Affect Mind");
        this.setType("At-will universal force power");
        this.setDescription("Choose a target within range that isn't hostile toward you. The target must make a Wisdom saving throw. On a failed save, you have advantage on all Charisma checks directed at that target. On a successful save, the creature does not realize that you tried to use the Force to influence its mood, but it becomes immune to this power for one day. This power has no eect on droids or constructs.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 ft");
        this.setDuration("Concentration, up to 1 minute");
    }
}