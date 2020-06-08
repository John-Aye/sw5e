import com.example.sw5ecompanion.models.powers.Power;

public class Infiltrate extends Power
{
    public Infiltrate () {
        super();
        this.setLvl(2);
        this.setName("Incendiary Cloud");
        this.setType("2nd-level tech power");
        this.setDescription("A creature you touch becomes invisible. Anything the target is carrying is invisible as long as it is on the target. The power ends if the target attacks or casts a power. O v e r c h a r g e T e c h . You can target one additional creature for each slot level above 2nd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 hour");
    }
}