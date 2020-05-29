import com.example.sw5ecompanion.models.powers.Power;

public class DominateMonster extends Power
{
    public DominateMonster() {
        super();
        this.setLvl(8);
        this.setName("Dominate Monster");
        this.setType("8th-level dark side power");
        this.setDescription("You attempt to beguile a creature that you can see within range. It must succeed on a Wisdom saving throw or be charmed by you for the duration. If you or creatures that are friendly to you are ghting it, it has advantage on the saving throw. While the creature is charmed, you have a telepathic link with it as long as you are within 1 mile of it. You can use this telepathic link to issue commands to the creature while you are conscious (no action required), which it does its best to obey. You can specify a simple and general course of action, such as \"Attack that creature,\" \"Run over there,\" or \"Fetch that object.\" If the creature completes the order and doesn't receive further direction from you, it defends and preserves itself to the best of its ability. You can use your action to take total and precise control of the target. Until the end of your next turn, the creature takes only the actions you choose, and doesn't do anything that you don't allow it to do. During this time, you can also cause the creature to use a reaction, but this requires you to use your own reaction as well. Each time the target takes damage, it makes a new Wisdom saving throw against the power. If the saving throw succeeds, the power ends. F o r c e P o t e n c y . When you cast this power with a 9thlevel force slot, the duration is concentration, up to 8 hours.");
        this.setPrerequiste("Dominate Mind");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 hour");
    }
}