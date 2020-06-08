import com.example.sw5ecompanion.models.powers.Power;

public class Scourge extends Power
{
    public Scourge() {
        super();
        this.setLvl(6);
        this.setName("Scourge");
        this.setType("6th-level dark side power");
        this.setDescription("For the power's duration, your eyes become an inky void imbued with dread power. One creature of your choice within 60 feet of you that you can see must succeed on a Constitution saving throw or be aected by one of the following eects of your choice for the duration. On each of your turns until the power ends, you can use your action to target another creature but can't target a creature again if it has succeeded on a saving throw against this casting of s co u r g e. A s l e e p . The target falls unconscious. It wakes up if it takes any damage or if another creature uses its action to shake the sleeper awake. P a n i c k e d . The target is frightened of you. On each of its turns, the frightened creature must take the Dash action and move away from you by the safest and shortest available route, unless there is nowhere to move. If the target moves to a place at least 60 feet away from you where it can no longer see you, this eect ends. S i c k e n e d . The target has disadvantage on attack rolls and ability checks. At the end of each of its turns, it can make another Wisdom saving throw. If it succeeds, the eect ends.");
        this.setPrerequiste("Plague");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
}