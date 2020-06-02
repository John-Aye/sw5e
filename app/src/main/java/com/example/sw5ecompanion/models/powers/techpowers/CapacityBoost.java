import com.example.sw5ecompanion.models.powers.Power;

public class CapacityBoost extends Power
{
    public CapacityBoost () {
        super();
        this.setLvl(2);
        this.setName("Capacity Boost");
        this.setType("2nd-level tech power");
        this.setDescription("You empower a blaster weapon you are holding. For the duration, you can reload the weapon once per turn without using an action, and as a bonus action on each of your turns you can make one attack with the weapon loaded with the power cell. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 5th level or higher, you can make two attacks with your bonus action, instead of one.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action");
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 minute");
    }
}