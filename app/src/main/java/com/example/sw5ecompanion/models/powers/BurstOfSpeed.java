import com.example.sw5ecompanion.models.powers.Power;

public class BurstOfSpeed extends Power
{
    public BurstOfSpeed() {
        super();
        this.setLvl(1);
        this.setName("Burst of Speed");
        this.setType("1st-level universal power");
        this.setDescription("You touch a creature. The target's speed increases by 10 feet until the power ends. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, you can target one additional creature for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("1 hour");
    }
}