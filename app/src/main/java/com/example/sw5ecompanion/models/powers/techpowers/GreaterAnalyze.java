import com.example.sw5ecompanion.models.powers.Power;

public class GreaterAnalyze extends Power
{
    public GreaterAnalyze () {
        super();
        this.setLvl(5);
        this.setName("Greater Analyze");
        this.setType("5th-level tech power");
        this.setDescription("Name or describe a person, place, or object. This power gives you a summary of signicant lore about it. If the thing you named isn't known outside of one planetary system, you gain no information. The more information you already have, the more detailed the information you receive is.");
        this.setPrerequiste("");
        this.setCastingTime("10 minutes")
        this.setRange("Self");
        this.setDuration("Instantaneous");
    }
}