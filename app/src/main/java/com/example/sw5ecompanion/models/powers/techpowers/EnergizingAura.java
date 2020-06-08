import com.example.sw5ecompanion.models.powers.Power;

public class EnergizingAura extends Power
{
    public EnergizingAura () {
        super();
        this.setLvl(8);
        this.setName("Energizing Aura");
        this.setType("8th-level tech power");
        this.setDescription("Energizing light radiates out from you in a 30-foot radius. Creatures of your choice in that radius when you cast this power have advantage on all saving throws, and other creatures have disadvantage on attack rolls against them until the power ends.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
}