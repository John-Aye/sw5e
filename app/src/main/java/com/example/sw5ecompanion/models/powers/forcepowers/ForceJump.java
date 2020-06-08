import com.example.sw5ecompanion.models.powers.Power;

public class ForceJump extends Power
{
    public ForceJump() {
        super();
        this.setLvl(1);
        this.setName("Force Jump");
        this.setType("1st-level universal power");
        this.setDescription("Using the Force to augment the strength in your legs, you leap up to 30 feet to an unoccupied space you can see. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, your jump distance increases by 5 feet for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Instantaneous");
    }
}