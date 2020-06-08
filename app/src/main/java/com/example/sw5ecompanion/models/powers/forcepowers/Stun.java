import com.example.sw5ecompanion.models.powers.Power;

public class Stun extends Power
{
    public Stun () {
        super();
        this.setLvl(2);
        this.setName("Stun");
        this.setType("2nd-level light side power");
        this.setDescription("Choose a creature that you can see within range. The target must succeed on a Wisdom saving throw or be paralyzed for the duration. At the end of each of its turns, the target can make another Wisdom saving throw. On a success, the power ends on the target.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}