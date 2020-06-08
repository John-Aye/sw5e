import com.example.sw5ecompanion.models.powers.Power;

public class Fear extends Power
{
    public Fear() {
        super();
        this.setLvl(1);
        this.setName("Fear");
        this.setType("1st-level dark side power");
        this.setDescription("You awaken the sense of mortality in one creature you can see within range. The target must succeed on a Wisdom saving throw or become frightened for the duration. A target with 25 hit points or fewer makes the saving throw with disadvantage. This power has no eect on constructs or droids.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}