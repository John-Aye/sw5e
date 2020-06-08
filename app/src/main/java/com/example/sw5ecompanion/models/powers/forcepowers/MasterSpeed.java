import com.example.sw5ecompanion.models.powers.Power;

public class MasterSpeed extends Power
{
    public MasterSpeed() {
        super();
        this.setLvl(7);
        this.setName("Master Speed");
        this.setType("7th-level universal power");
        this.setDescription("Choose up to two willing creatures that you can see within range. Until the power ends, each targets' speed is doubled, they gain a +2 bonus to AC, they have advantage on Dexterity saving throws, and they gain an additional action on each of their turns. That action can be used only to take the Attack (one weapon attack only), Dash, Disengage, Hide, or the Use an Object Action. When the power ends, each target can't move or take actions until after its next turn, as a wave of lethargy sweeps over it. F o r c e P o t e n c y . When you cast this power using a force slot of 8th-level or higher, you can target one additional creature for each slot level above 7th.");
        this.setPrerequiste("Knight Speed");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}