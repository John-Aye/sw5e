import com.example.sw5ecompanion.models.powers.Power;

public class ScorchingRay extends Power
{
    public ScorchingRay () {
        super();
        this.setLvl(2);
        this.setName("Scorching Ray");
        this.setType("2nd-level tech power");
        this.setDescription("You create three ionic rays and hurl them at targets within range. You can hurl them at one target or several. Make a ranged tech attack for each ray. On a hit, the target takes 2d6 ion damage. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 3rd level or higher, you create one additional ray for each slot level above 2nd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("120 feet");
        this.setDuration("Instantaneous");
    }
}