import com.example.sw5ecompanion.models.powers.Power;

public class TacticalAdvantage extends Power
{
    public TacticalAdvantage () {
        super();
        this.setLvl(3);
        this.setName("Tactical Advantage");
        this.setType("3rd-level tech power");
        this.setDescription("Choose a willing creature that you can see within range. Until the power ends, the target's speed is doubled, it gains a +2 bonus to AC, it has advantage on Dexterity saving throws, and it gains an additional action on each of its turns. That action can be used only to take the Attack (one weapon attack only), Dash, Disengage, Hide, or Use an Object action. When the power ends, the target can't move or take actions until after its next turn, as a wave of lethargy sweeps over it.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}