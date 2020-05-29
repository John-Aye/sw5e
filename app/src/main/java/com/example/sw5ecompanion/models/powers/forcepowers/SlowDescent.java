import com.example.sw5ecompanion.models.powers.Power;

public class SlowDescent extends Power
{
    public SlowDescent () {
        super();
        this.setLvl(1);
        this.setName("Slow Descent");
        this.setType("1st-level universal power");
        this.setDescription("Choose up to five falling creatures within range. A falling creature's rate of descent slows to 60 feet per round until the power ends. If the creature lands before the power ends, it takes no falling damage and can land on its feet, and the power ends for that creature.");
        this.setPrerequiste("");
        this.setCastingTime("1 reaction, which you take when you or a creature within 60 feet of you falls");
        this.setRange("60 feet");
        this.setDuration("1 minute");
    }
}