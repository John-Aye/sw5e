import com.example.sw5ecompanion.models.powers.Power;

public class ForceLink extends Power
{
    public ForceLink() {
        super();
        this.setLvl(8);
        this.setName("Force Link");
        this.setType("8th-level universal power");
        this.setDescription("You create a telepathic link between yourself and a willing creature with which you are familiar. Until the power ends, you and the target can instantaneously share words, images, sounds, and other sensory messages with one another through the link, and the target recognizes you as the creature it is communicating with. The power enables a creature with an Intelligence score of at least 1 to understand the meaning of your words and take in the scope of any sensory messages you send to it.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Unlimited");
        this.setDuration("24 hours");
    }
}