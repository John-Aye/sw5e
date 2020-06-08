import com.example.sw5ecompanion.models.powers.Power;

public class MassCoerceMind extends Power
{
    public MassCoerceMind () {
        super();
        this.setLvl(6);
        this.setName("Mass Coerce Mind");
        this.setType("6th-level universal power");
        this.setDescription("You suggest a course of activity (limited to a sentence or two) and inuence with the Force up to twelve creatures of your choice that you can see within range and that can hear and understand you. Creatures that can't be charmed are immune to this eect. The suggestion must be worded in such a manner as to make the course of action sound reasonable. Asking the creature to harm itself automatically negates the eect of the power. Each target must make a Wisdom saving throw. On a failed save, it pursues the course of action you described to the best of its ability. The suggested course of action can continue for the entire duration. If the suggested activity can be completed in a shorter time, the power ends when the subject nishes what it was asked to do. You can also specify conditions that will trigger a special activity during the duration. For example, you might suggest that a group of soldiers give all their money to the rst beggar they meet. If the condition isn't met before the power ends, the activity isn't performed. If you or any of your companions damage a creature aected by this power, the power ends for that creature. This power has no eect on droids or constructs. F o r c e P o t e n c y . When you cast this power using a 7th-level force slot, the duration is 10 days. When you use an 8th-level force slot, the duration is 30 days. When you use a 9th-level force slot, the duration is a year and a day.");
        this.setPrerequiste("Coerce Mind");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("24 hours");
    }
    
}