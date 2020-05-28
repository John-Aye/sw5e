import com.example.sw5ecompanion.models.powers.Power;

public class ForceChainLightning extends Power
{
    public ForceChainLightning() {
        super();
        this.setLvl(6);
        this.setName("Force Chain Lightning");
        this.setType("6th-level dark side power");
        this.setDescription("You create a bolt of lightning that arcs toward a target of your choice that you can see within range. Three bolts then leap from that target to as many as three other targets, each of which must be within 30 feet of the rst target. A target can be a creature or an object and can be targeted by only one of the bolts. A target must make a Dexterity saving throw. The target takes 10d8 lightning damage on a failed save, or half as much damage on a successful one. F o r c e P o t e n c y . When you cast this power using a force slot of 7th level or higher, one additional bolt leaps from the rst target to another target for each slot level above 6th.");
        this.setPrerequiste("Force Lightning");
        this.setCastingTime("1 action");
        this.setRange("150 feet");
        this.setDuration("Instantaneous");
    }
}