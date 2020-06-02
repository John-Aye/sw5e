import com.example.sw5ecompanion.models.powers.Power;

public class RepairDroid extends Power
{
    public RepairDroid () {
        super();
        this.setLvl(1);
        this.setName("Repair Droid");
        this.setType("1st-level tech power");
        this.setDescription("A droid or construct you touch regains a number of hit points equal to 1d8 + your techcasting ability modier. This power only eects droids and constructs. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the healing increases by 1d8 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}