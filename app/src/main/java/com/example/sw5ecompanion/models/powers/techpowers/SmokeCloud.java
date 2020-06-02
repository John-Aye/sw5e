import com.example.sw5ecompanion.models.powers.Power;

public class SmokeCloud extends Power
{
    public SmokeCloud () {
        super();
        this.setLvl(1);
        this.setName("Smoke Cloud");
        this.setType("1st-level tech power");
        this.setDescription("You cause thick smoke to erupt from a point within range, lling a 20-foot-radius sphere. The sphere spreads around corners, and its area is heavily obscured. It lasts for the duration or until a wind of moderate or greater speed (at least 10 miles per hour) disperses it. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the radius of the smoke cloud increases by 20 feet for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 1 hour");
    }
}