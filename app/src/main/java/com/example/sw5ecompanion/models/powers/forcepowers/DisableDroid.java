import com.example.sw5ecompanion.models.powers.Power;

public class DisableDroid extends Power
{
    public DisableDroid() {
        super();
        this.setLvl(4);
        this.setName("Disable Droid");
        this.setType("4th-level light side power");
        this.setDescription("Choose a point that you can see within range. Each droid must succeed on a Constitution saving throw or be paralyzed for the duration. At the beginning of each of its turns, the droid takes energy damage equal to your forcecasting ability modier and then repeats this saving throw. On a success, the power ends on the target.");
        this.setPrerequiste("Stun Droid");
        this.setCastingTime("1 action");
        this.setRange("90 feet (15-foot cube)");
        this.setDuration("Concentration, up to 1 minute");
    }
}