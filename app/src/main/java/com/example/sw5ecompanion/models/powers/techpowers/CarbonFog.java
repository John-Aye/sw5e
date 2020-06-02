import com.example.sw5ecompanion.models.powers.Power;

public class CarbonFog extends Power
{
    public CarbonFog () {
        super();
        this.setLvl(6);
        this.setName("Carbon Fog");
        this.setType("6th-level tech power");
        this.setDescription("You create a cloud of icy fog in a 20-foot-radius sphere centered on a point you can see. The sphere extends around corners, and its area is heavily obscured. The fog is semi-solid, and its area is considered dicult terrain. Each creature that enters the power's area for the rst time on a turn or starts its turn there takes 4d6 cold damage and has its speed reduced by 10 feet until the end of its turn. The fog lasts for the duration of the power or until it's dispersed by a wind of moderate or greater speed (at least 10 mph).");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}