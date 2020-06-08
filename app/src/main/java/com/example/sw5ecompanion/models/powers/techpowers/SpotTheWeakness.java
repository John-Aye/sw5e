import com.example.sw5ecompanion.models.powers.Power;

public class SpotTheWeakness extends Power
{
    public SpotTheWeakness () {
        super();
        this.setLvl(1);
        this.setName("Spot The Weakness");
        this.setType("1st-level tech power");
        this.setDescription("Up to three creatures of your choice that you can see within range must make Dexterity saving throws. Whenever a target that fails this saving throw makes an attack roll or a saving throw before the power ends, the target must roll a d4 and subtract the number rolled from the attack roll or saving throw. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, you can target one additional creature for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}