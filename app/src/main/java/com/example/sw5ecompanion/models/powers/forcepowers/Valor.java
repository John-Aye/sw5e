import com.example.sw5ecompanion.models.powers.Power;

public class Valor extends Power
{
    public Valor () {
        super();
        this.setLvl(1);
        this.setName("Valor");
        this.setType("1st-level light side power");
        this.setDescription("You bless up to three creatures of your choice within range. Whenever a target makes an attack roll or a saving throw before the power ends, the target can roll a d4 and add the number rolled to the attack roll or saving throw. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, you can target one additional creature for each slot level above 1st.");
        this.setPrerequiste("Guidance");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}