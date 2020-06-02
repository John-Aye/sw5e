import com.example.sw5ecompanion.models.powers.Power;

public class AssessTheSituation extends Power
{
    public AssessTheSituation () {
        super();
        this.setLvl(0);
        this.setName("Assess the Situation");
        this.setType("At-will tech power");
        this.setDescription("You take a sensory snapshot of a target within range. Your tech grants you a brief insight into the target's defenses. You have advantage on the next attack roll you make against the target before the end of your next turn.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Instantaneous");
    }
}