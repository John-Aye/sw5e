import com.example.sw5ecompanion.models.powers.Power;

public class ImprovedPhasewalk extends Power
{
    public ImprovedPhasewalk() {
        super();
        this.setLvl(5);
        this.setName("Improved Phasewalk");
        this.setType("5th-level universal power");
        this.setDescription("You teleport up to 60 feet to an unoccupied space you can see. On each of your turns before the power ends, you can use a bonus action to teleport in this way again.");
        this.setPrerequiste("Phasewalk");
        this.setCastingTime("1 bonus action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
    
}