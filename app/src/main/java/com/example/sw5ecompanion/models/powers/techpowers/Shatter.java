import com.example.sw5ecompanion.models.powers.Power;

public class Shatter extends Power
{
    public Shatter () {
        super();
        this.setLvl(2);
        this.setName("Shatter");
        this.setType("2nd-level tech power");
        this.setDescription("A sudden loud ringing noise, painfully intense, erupts from a point of your choice within range. Each creature in a 10-foot-radius sphere centered on that point must make a Constitution saving throw. A creature takes 3d8 sonic damage on a failed save, or half as much damage on a successful one. A creature made of inorganic material such as stone, crystal, or metal has disadvantage on this saving throw. An unenhanced object that isn't being worn or carried also takes the damage if it's in the power's area. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 3rd level or higher, the damage increases by 1d8 for each slot level above 2nd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}