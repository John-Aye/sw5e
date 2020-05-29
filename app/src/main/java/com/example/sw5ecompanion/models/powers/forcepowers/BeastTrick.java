import com.example.sw5ecompanion.models.powers.Power;

public class BeastTrick extends Power
{
    public BeastTrick() {
        super();
        this.setLvl(1);
        this.setName("Beast Trick");
        this.setType("1st-level light side power");
        this.setDescription("This power lets you distract a beast. Choose a beast that you can see within range. If the beast's Intelligence is 4 or higher, the power fails. Otherwise, the beast must succeed on a Wisdom saving throw or be charmed by you for the power's duration. If you or one of your companions harms the target, the power ends. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, you can aect one additional beast for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("24 hours");
    }
}