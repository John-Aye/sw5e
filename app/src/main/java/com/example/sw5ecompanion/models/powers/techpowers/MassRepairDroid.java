import com.example.sw5ecompanion.models.powers.Power;

public class MassRepairDroid extends Power
{
    public MassRepairDroid () {
        super();
        this.setLvl(5);
        this.setName("Mass Repair Droid");
        this.setType("5th-level tech power");
        this.setDescription("Choose up to six droids or constructs in a 30-footradius sphere centered on a point. Each target regains hit points equal to 3d8 + your techcasting ability modier. This power only eects droids and constructs. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 6th level or higher, the healing increases by 1d8 for each slot level above 5th.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}