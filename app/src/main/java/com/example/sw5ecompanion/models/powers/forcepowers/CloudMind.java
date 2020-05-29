import com.example.sw5ecompanion.models.powers.Power;

public class CloudMind extends Power
{
    public CloudMind() {
        super();
        this.setLvl(1);
        this.setName("Cloud Mind");
        this.setType("1st-level light side power");
        this.setDescription("Roll 5d8; the total is how many hit points of creatures this power can aect. Creatures within 20 feet of a point you choose are aected in order of their current hit points. Starting with the creature that has the lowest current hit points, each creature aected by this power falls unconscious. If the power ends, the sleeper takes damage, or someone uses an action wake the sleeper, they will be awoken. Subtract each creature's hit points from the total before moving on to the creature with the next lowest hit points. A creature's hit points must be equal to or less than the remaining total for that creature to be aected. This power has no eect on droids or constructs.\n" +
                "F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, you can roll an additional 2d8 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("90 feet");
        this.setDuration("1 minute");
    }
}