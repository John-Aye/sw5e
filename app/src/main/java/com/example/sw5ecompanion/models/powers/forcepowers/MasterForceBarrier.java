import com.example.sw5ecompanion.models.powers.Power;

public class MasterForceBarrier extends Power
{
    public MasterForceBarrier() {
        super();
        this.setLvl(8);
        this.setName("Master Force Barrier");
        this.setType("8th-level light side power");
        this.setDescription("This power massively bolsters your allies with toughness and resolve. Creatures of your choice in a 30-foot radius around you when you cast this power gain the following benets: The creature sheds dim light in a 5-foot radius. The creature has advantage on all saving throws Other creatures have disadvantage on attack rolls against them. When a dark side creature hits them with a melee attack, that creature must make a Constitution saving throw or be blinded until the power ends.");
        this.setPrerequiste("Improved Force Barrier");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
}