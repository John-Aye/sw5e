import com.example.sw5ecompanion.models.powers.Power;

public class SiphonLife extends Power
{
    public SiphonLife() {
        super();
        this.setLvl(5);
        this.setName("Siphon Life");
        this.setType("5th-level dark side power");
        this.setDescription("A tendril of inky darkness reaches out from you, touching a creature you can see within range to drain life from it. The target must make a Dexterity saving throw. On a successful save, the target takes 2d8 necrotic damage, and the power ends. On a failed save, the target takes 4d8 necrotic damage, and until the power ends, you can use your action on each of your turns to automatically deal 4d8 necrotic damage to the target. The power ends if you use your action to do anything else, if the target is ever outside the power's range, or if the target has total cover from you. Whenever the power deals damage to a target, you regain hit points equal to half the amount of necrotic damage the target takes. F o r c e P o t e n c y . When you cast this power using a force slot of 6th level or higher, the damage increases by 1d8 for each slot level above 5th.");
        this.setPrerequiste("Drain Life");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}