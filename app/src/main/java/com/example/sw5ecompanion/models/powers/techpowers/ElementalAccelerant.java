import com.example.sw5ecompanion.models.powers.Power;

public class ElementalAccelerant extends Power
{
    public ElementalAccelerant () {
        super();
        this.setLvl(4);
        this.setName("Elemental Accelerant");
        this.setType("4th-level tech power");
        this.setDescription("Choose one creature you can see and one damage type: acid, cold, re, lightning, or sonic. The target must make a Constitution saving throw. If it fails, the rst time on each turn when it takes damage of the chosen type, it takes an extra 2d6 damage of it. The target also loses resistance to the type until the power ends. O v e r c h a r g e T e c h . You can target one additional creature for each slot level above 4th. The creatures must be within 30 feet of each other when you target them.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("90 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}