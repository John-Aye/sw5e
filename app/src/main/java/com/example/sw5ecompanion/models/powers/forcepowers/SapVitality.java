import com.example.sw5ecompanion.models.powers.Power;

public class SapVitality extends Power
{
    public SapVitality() {
        super();
        this.setLvl(1);
        this.setName("Sap Vitality");
        this.setType("1st-level dark side power");
        this.setDescription("Make a melee force attack against a creature you can reach. On a hit, the target takes 3d10 necrotic damage. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, the damage increases by 1d10 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}