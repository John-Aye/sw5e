import com.example.sw5ecompanion.models.powers.Power;

public class FindThePath extends Power
{
    public FindThePath () {
        super();
        this.setLvl(6);
        this.setName("Find The Path");
        this.setType("6th-level tech power");
        this.setDescription("This power calculates out the shortest, most direct physical route to a specic xed location that you are familiar with on the same planet. If you name a destination that moves (such as a mobile fortress), or a destination that isn't specic (such as \"a Black Sun lair\"), the power fails. For the duration, as long as you are on the same planet as the destination, you know how far it is and in what direction it lies. While you are traveling there, whenever you are presented with a choice of paths along the way, you automatically determine which path is the shortest and most direct route (but not necessarily the safest route) to the destination.");
        this.setPrerequiste("");
        this.setCastingTime("1 minute")
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 day");
    }
}