import com.example.sw5ecompanion.models.powers.Power;

public class SharedShielding extends Power
{
    public SharedShielding () {
        super();
        this.setLvl(2);
        this.setName("Shared Shielding");
        this.setType("2nd-level tech power");
        this.setDescription("This power wards a willing creature you touch and creates an energy link between you and the target until the power ends. While the target is within 60 feet of you, it gains a +1 bonus to AC and saving throws, and it has resistance to all damage. Also, each time it takes damage, you take the same amount of damage. The power ends if you drop to 0 hit points or if you and the target become separated by more than 60 feet. It also ends if the power is cast again on either of the connected creatures. You can also dismiss the power as an action.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Touch");
        this.setDuration("1 hour");
    }
}