import com.example.sw5ecompanion.models.powers.Power;

public class ExpeditiousRetreat extends Power
{
    public ExpeditiousRetreat () {
        super();
        this.setLvl(1);
        this.setName("Expeditious Retreat");
        this.setType("1st-level tech power");
        this.setDescription("This power gives you a burst of adrenaline that allows you to move at an incredible pace. When you cast this power, and then as a bonus action on each of your turns until the power ends, you can take the Dash action.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action")
        this.setRange("Self");
        this.setDuration("Concentration, up to 10 minutes");
    }
}