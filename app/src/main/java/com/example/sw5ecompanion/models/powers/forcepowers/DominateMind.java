import com.example.sw5ecompanion.models.powers.Power;

public class DominateMind extends Power
{
    public DominateMind() {
        super();
        this.setLvl(5);
        this.setName("Dominate Mind");
        this.setType("5th-level dark side power");
        this.setDescription("You attempt to beguile a humanoid that you can see within range. It must succeed on a Wisdom saving throw or be charmed by you for the duration. If you or creatures that are friendly to you are ghting it, it has advantage on the saving throw. While the target is charmed, you have a telepathic link with it as long as you are within 1 mile of it. You can use this telepathic link to issue commands to the creature while you are conscious (no action required), which it does its best to obey. You can specify a simple and general course of action, such as \"Attack that creature,\" \"Run over there,\" or \"Fetch that object.\" If the creature completes the order and doesn't receive further direction from you, it defends and preserves itself to the best of its ability. You can use your action to take total and precise control of the target. Until the end of your next turn, the creature takes only the actions you choose, and doesn't do anything that you don't allow it to do. During this time you can also cause the creature to use a reaction, but this requires you to use your own reaction as well. Each time the target takes damage, it makes a new Wisdom saving throw against the power. If the saving throw succeeds, the power ends. This power has no eect on droids or constructs. F o r c e P o t e n c y . When you cast this power using a 6th-level force slot, the duration is 10 minutes. When you use a 7th-level force slot, the duration is 1 hour. When you use a force slot of 8th level or higher, the duration is 8 hours.");
        this.setPrerequiste("Dominate Beast");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}