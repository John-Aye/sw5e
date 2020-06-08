import com.example.sw5ecompanion.models.powers.Power;

public class DrainLife extends Power
{
    public DrainLife() {
        super();
        this.setLvl(4);
        this.setName("Drain Life");
        this.setType("4th-level dark side power");
        this.setDescription("You draw the life force from a creature you can see within range. The target must make a Constitution saving throw. The target takes 8d8 necrotic damage on a failed save, or half as much damage on a successful one. If you reduce a hostile creature to 0, you gain temporary hit points equal to half the damage dealt. This power has no eect on droids or constructs. F o r c e P o t e n c y . When you cast this power using a force slot of 5th level or higher, the damage increases by 1d8 for each slot level above 4th.");
        this.setPrerequiste("Drain Vitality");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}