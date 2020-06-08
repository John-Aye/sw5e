import com.example.sw5ecompanion.models.powers.Power;

public class OverrideInterface extends Power
{
    public OverrideInterface () {
        super();
        this.setLvl(5);
        this.setName("Override Interface");
        this.setType("5th-level tech power");
        this.setDescription("You choose one droid or construct you can see within range and attempt to remotely override its controls. The target must make an Intelligence saving throw. If the construct has the 'Piloted' trait, and has a pilot controlling it that is not incapacitated, it gains a bonus to the saving throw equal to the pilot's Intelligence modier. If you or creatures that are friendly to you are ghting it, it has advantage on the saving throw. On a failed save, the creature is charmed by you for the duration. While the droid is charmed, you have a wireless link with it as long as the two of you are on the same planet. Via your tech focus, you can use this link to issue commands to the creature while you are conscious (no action required), which it does its best to obey. You can specify a simple and general course of action, such as \"Attack that creature,\" \"Move over there,\" or \"Fetch that object.\" If the droid completes the order and doesn't receive further direction from you, it defends and preserves itself to the best of its ability. You can use your action to take total and precise control of the target. Until the end of your next turn, the droid takes only the actions you choose, and doesn't do anything that you don't allow it to do. During this time, you can also cause the creature to use a reaction, but this requires you to use your own reaction as well. Each time the target takes damage, it makes a new Intelligence saving throw against the power. If the saving throw succeeds, the power ends. O v e r c h a r g e T e c h . When you cast this power using a 6th-level tech slot, the duration is 10 minutes. When you use a 7th-level tech slot, the duration is 1 hour. When you use a tech slot of 8th level or higher, the duration is 8 hours.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}