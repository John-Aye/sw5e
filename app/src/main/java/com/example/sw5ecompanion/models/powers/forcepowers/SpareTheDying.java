import com.example.sw5ecompanion.models.powers.Power;

public class SpareTheDying extends Power
{
    public SpareTheDying () {
        super();
        this.setLvl(0);
        this.setName("Spare the Dying");
        this.setType("At-will light side power");
        this.setDescription("You touch a living creature that has 0 hit points. The creature becomes stable. This power has no eect on droids or constructs.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}