import com.example.sw5ecompanion.models.powers.Power;

public class DestroyDroid extends Power
{
    public DestroyDroid() {
        super();
        this.setLvl(7);
        this.setName("Destroy Droid");
        this.setType("7th-level light side power");
        this.setDescription("Choose a point that you can see within range. Each droid must succeed on a Constitution saving throw or be paralyzed for the duration. At the beginning of each of its turns, the droid takes energy damage equal to twice your forcecasting ability modier and then repeats this saving throw. On a success, the power ends on the target.");
        this.setPrerequiste("Disable Droid");
        this.setCastingTime("1 action");
        this.setRange("120 feet (30-foot cube)");
        this.setDuration("Concentration, up to 1 minute");
    }
}