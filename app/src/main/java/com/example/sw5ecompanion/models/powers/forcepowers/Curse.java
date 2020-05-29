import com.example.sw5ecompanion.models.powers.Power;

public class Curse extends Power
{
    public Curse() {
        super();
        this.setLvl(1);
        this.setName("Curse");
        this.setType("1st-level dark side power");
        this.setDescription("Up to three creatures of your choice that you can see within range must make Charisma saving throws. Whenever a target that fails this saving throw makes an attack roll or a saving throw before the power ends, the target must roll a d4 and subtract the number rolled from the attack roll or saving throw. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, you can target one additional creature for each slot level above 1st.");
        this.setPrerequiste("Denounce");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}