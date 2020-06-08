import com.example.sw5ecompanion.models.powers.Power;

public class ImprovedForceCamouflage extends Power
{
    public ImprovedForceCamouflage() {
        super();
        this.setLvl(5);
        this.setName("Improved Force Camouflage");
        this.setType("4th-level universal power");
        this.setDescription("A willing creature you touch becomes invisible until the power ends. Anything the target is wearing or carrying is invisible as long as it is on the target's person.");
        this.setPrerequiste("Force Camouflage");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 minute");
    }
    
}