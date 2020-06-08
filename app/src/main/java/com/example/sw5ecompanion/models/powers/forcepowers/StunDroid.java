import com.example.sw5ecompanion.models.powers.Power;

public class StunDroid extends Power
{
    public StunDroid () {
        super();
        this.setLvl(2);
        this.setName("Stun Droid");
        this.setType("2nd-level light side power");
        this.setDescription("Choose a droid that you can see within range. The target must succeed on a Constitution saving throw or be paralyzed for the duration. At the beginning of each of its turns, the droid takes energy damage equal to your forcecasting ability modier. At the end of each of its turns, the target can make another Constitution saving throw. On a success, the power ends on the target.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}