import com.example.sw5ecompanion.models.powers.Power;

public class Heal extends Power
{
    public Heal() {
        super();
        this.setLvl(1);
        this.setName("Heal");
        this.setType("1st-level light side power");
        this.setDescription("A creature you touch regains a number of hit points equal to 1d8 + your forcecasting ability modier. This power has no eect on droids or constructs. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, the healing increases by 1d8 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}