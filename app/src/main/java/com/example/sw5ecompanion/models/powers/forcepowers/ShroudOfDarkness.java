import com.example.sw5ecompanion.models.powers.Power;

public class ShroudOfDarkness extends Power
{
    public ShroudOfDarkness() {
        super();
        this.setLvl(4);
        this.setName("ShroudOfDarkness");
        this.setType("4th-level dark side power");
        this.setDescription("You become heavily obscured to others. Dim light within 10 feet of you becomes darkness, and bright light becomes dim light. Until the power ends, you have resistance to force damage. In addition, whenever a creature within 10 feet of you hits you with an attack, it takes 2d8 necrotic damage.");
        this.setPrerequiste("Darkness");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
}