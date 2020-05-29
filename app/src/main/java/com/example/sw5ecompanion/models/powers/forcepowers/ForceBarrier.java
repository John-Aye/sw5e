import com.example.sw5ecompanion.models.powers.Power;

public class ForceBarrier extends Power
{
    public ForceBarrier() {
        super();
        this.setLvl(2);
        this.setName("Force Barrier");
        this.setType("2nd-level light side power");
        this.setDescription("This power bolsters your allies with toughness and resolve. Choose up to three creatures within range. Each target's hit point maximum and current hit points increase by 5 for the duration. F o r c e P o t e n c y . When you cast this power using a force slot of 3rd level or higher, a target's hit points increase by an additional 5 for each slot level above 2nd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("8 hours");
    }
}