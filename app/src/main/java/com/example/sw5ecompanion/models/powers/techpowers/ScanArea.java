import com.example.sw5ecompanion.models.powers.Power;

public class ScanArea extends Power
{
    public ScanArea () {
        super();
        this.setLvl(4);
        this.setName("Scan Area");
        this.setType("4th-level tech power");
        this.setDescription("Program a creature or object that you are familiar with into your tech focus. Using a sonar scan, the tech focus attempts to nd a path to the creature's or objects location, as long as that creature or object is within 1,000 feet of you. If the creature or object is moving, you know the direction of its movement. The power can locate a specic creature or object known to you, or the nearest creature/object of a specic kind (such as a droid or a bothan), so long as you have seen such a creature up close—within 30 feet —at least once.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self");
        this.setDuration("Concentration, up to 10 minutes");
    }
}