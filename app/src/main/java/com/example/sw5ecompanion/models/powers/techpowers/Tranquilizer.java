import com.example.sw5ecompanion.models.powers.Power;

public class Tranquilizer extends Power
{
    public Tranquilizer () {
        super();
        this.setLvl(1);
        this.setName("Tranquilizer");
        this.setType("1st-level tech power");
        this.setDescription("You emit a tranquilizing dart that knocks a creature unconscious. Roll 5d8; if the creature's remaining hit points are less than the total, the creature falls unconscious until the power ends, the sleeper takes damage, or someone uses an action to shake or slap the sleeper awake. This power has no eect on droids or constructs. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, you can target an additional creature for each slot level above 1st. For each target, roll 5d8 separately.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("90 feet");
        this.setDuration("1 minute");
    }
}