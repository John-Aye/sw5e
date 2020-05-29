import com.example.sw5ecompanion.models.powers.Power;

public class DominateBeast extends Power
{
    public DominateBeast() {
        super();
        this.setLvl(4);
        this.setName("Dominate Beast");
        this.setType("4th-level dark side power");
        this.setDescription("A beast you can see must succeed on a Wisdom save or be charmed. If you or your companions are ghting it, it has advantage on this saving throw. While it's charmed, you have a telepathic link to it if you're on the same planet. You can use this link to issue commands while you are conscious, no action required, which it does its best to obey. You can specify a simple and general course of action. If it completes the order and doesn't receive further orders, it focuses on defending itself. You can use your action to take total control of the target. Until the end of your next turn, the beast takes only the actions you decide and nothing you don't allow it to. You can also have the beast use a reaction, but this takes your reaction as well. If the beast takes damage, it makes another Wisdom save. On a success, the power ends. F o r c e P o t e n c y . When you cast this power using a 5th-level force slot, the duration is up to 10 minutes. At a 6th-level slot, the duration is up to 1 hour. At a slot of 7th or higher, the duration is up to 8 hours.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}