import com.example.sw5ecompanion.models.powers.Power;

public class ForceLightning extends Power
{
    public ForceLightning() {
        super();
        this.setLvl(3);
        this.setName("Force Lightning");
        this.setType("3rd-level dark side power");
        this.setDescription("Using the Force to augment the strength in your legs, you leap up to 30 feet to an unoccupied space you can see. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, your jump distance increases by 5 feet for each slot level above 1st.");
        this.setPrerequiste("Shock");
        this.setCastingTime("1 action");
        this.setRange("Self (100-foot line)");
        this.setDuration("Instantaneous");
    }
}