import com.example.sw5ecompanion.models.powers.Power;

public class CoerceMind extends Power
{
    public CoerceMind() {
        super();
        this.setLvl(2);
        this.setName("Coerce Mind");
        this.setType("2nd-level universal power");
        this.setDescription("You suggest a course of activity (limited to a sentence or two) and inuence with the Force a creature you can see within range that can hear and understand you. Creatures that can't be charmed are immune to this eect. The suggestion must be worded in such a manner as to make the course of action sound reasonable. Asking the creature to harm itself automatically negates the eect of the power. The target must make a Wisdom saving throw. On a failed save, it pursues the course of action you described to the best of its ability. The suggested course of action can continue for the entire duration. If the suggested activity can be completed in a shorter time, the power ends when the subject nishes what it was asked to do. You can also specify conditions that will trigger a special activity during the duration. For example, you might suggest that a soldier give her speeder to the rst vagrant she meets. If the condition isn't met before the power expires, the activity isn't performed. If you or any of your companions damage the target, the power ends. This power has no eect on droids or constructs.");
        this.setPrerequiste("Affect Mind");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 8 hours");
    }
}