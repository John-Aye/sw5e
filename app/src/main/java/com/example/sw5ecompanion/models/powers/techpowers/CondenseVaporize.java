import com.example.sw5ecompanion.models.powers.Power;

public class CondenseVaporize extends Power
{
    public CondenseVaporize () {
        super();
        this.setLvl(1);
        this.setName("Condense Vaporize");
        this.setType("1st-level tech power");
        this.setDescription("In an open container, you can create up to 10 gallons of drinkable water. You may also produce a rain that falls within a 30-foot cube and extinguishes open-air ames. You can destroy the same amount of water in an open container, or destroy a 30-foot cube of fog. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the amount of water you can create increases by 10 gallons, or the size of the cube increases by 5 feet, for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Instantaneous");
    }
}