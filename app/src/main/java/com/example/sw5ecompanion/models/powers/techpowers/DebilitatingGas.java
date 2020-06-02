import com.example.sw5ecompanion.models.powers.Power;

public class DebilitatingGas extends Power
{
    public DebilitatingGas () {
        super();
        this.setLvl(3);
        this.setName("Debilitating Gas");
        this.setType("3rd-level tech power");
        this.setDescription("You create a 20-foot-radius sphere of gas centered on a point. The cloud spreads around corners and its area is heavily obscured. It lingers in the air for the duration. Each creature completely in the cloud at the start of its turn must make a Constitution save against poison. On a failure, the creature does nothing that turn. Creatures that don't need to breathe or are immune to poison automatically succeed. A wind of 10mph disperses the cloud after 4 rounds. A wind of 20mph disperses it after 1 round.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("90 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}