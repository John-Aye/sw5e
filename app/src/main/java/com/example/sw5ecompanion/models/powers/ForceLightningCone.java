import com.example.sw5ecompanion.models.powers.Power;

public class ForceLightningCone extends Power
{
    public ForceLightningCone() {
        super();
        this.setLvl(7);
        this.setName("Force Lightning Cone");
        this.setType("7th-level dark side power");
        this.setDescription("Lightning arcs from your hands. Each creature in a 60-foot cone must make a Dexterity saving throw. A creatures takes 12d6 lightning damage on a failed save, or half as much on a successful one. F o r c e P o t e n c y . When you cast this power using a force slot of 8th level or higher, the damage increases by 2d6 for each slot level above 7th.");
        this.setPrerequiste("Force Chain Lightning");
        this.setCastingTime("1 action");
        this.setRange("Self (60-foot cone)");
        this.setDuration("Instantaneous");
    }
}