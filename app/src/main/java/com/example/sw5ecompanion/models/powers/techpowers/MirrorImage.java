import com.example.sw5ecompanion.models.powers.Power;

public class MirrorImage extends Power
{
    public MirrorImage () {
        super();
        this.setLvl(2);
        this.setName("Mirror Image");
        this.setType("2nd-level tech power");
        this.setDescription("Three illusory duplicates of yourself appear in your space. Until the power ends, the duplicates move with you and mimic your actions, shifting position so it's impossible to track which image is real. You can use your action to dismiss the illusory duplicates. Each time a creature targets you with an attack during the power's duration, roll a d20 to determine whether the attack instead targets one of your duplicates. If you have three duplicates, you must roll a 6 or higher to change the attack's target to a duplicate. With two duplicates, you must roll an 8 or higher. With one duplicate, you must roll an 11 or higher. A duplicate's AC equals 10 + your Dexterity modier. If an attack hits a duplicate, the duplicate is destroyed. A duplicate can be destroyed only by an attack that hits it. It ignores all other damage and eects. The power ends when all three duplicates are destroyed. A creature is unaected by this power if it can't see, if it relies on senses other than sight, such as blindsight, or if it can perceive illusions as false, as with truesight.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self");
        this.setDuration("1 minute");
    }
}