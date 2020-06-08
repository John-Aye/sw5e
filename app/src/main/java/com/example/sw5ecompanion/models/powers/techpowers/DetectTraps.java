import com.example.sw5ecompanion.models.powers.Power;

public class DetectTraps extends Power
{
    public DetectTraps () {
        super();
        this.setLvl(2);
        this.setName("Detect Traps");
        this.setType("2nd-level tech power");
        this.setDescription("You sense the presence, general location, and nature of any trap within 120 feet of you that is within line of sight. A trap, for this power, includes anything that would inict a sudden or unexpected eect you consider harmful or undesirable, which was specically intended by its creator. While the power is active, you have advantage on Wisdom (Perception) and Intelligence (Investigation) checks to nd any traps that are within line of sight.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
}