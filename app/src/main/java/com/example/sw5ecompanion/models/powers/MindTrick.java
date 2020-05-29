import com.example.sw5ecompanion.models.powers.Power;

public class MindTrick extends Power
{
    public MindTrick() {
        super();
        this.setLvl(0);
        this.setName("Mind Trick");
        this.setType("At-will universal power");
        this.setDescription("Choose a target within range that isn't hostile toward you. The target must make a Wisdom saving throw. On a failed save, the target has disadvantage on Wisdom (Perception) and Intelligence (Investigation) checks. On a successful save, the creature realizes that you tried to use the Force to inuence its awareness and becomes hostile toward you. A creature prone to violence might attack you. Another creature might seek retribution in other ways (at the GM's discretion), depending on the nature of your interaction with it. This power has no eect on droids or constructs.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}