import com.example.sw5ecompanion.models.powers.Power;

public class ImprovedPhasestrike extends Power
{
    public ImprovedPhasestrike() {
        super();
        this.setLvl(5);
        this.setName("Improved Phasestrike");
        this.setType("5th-level universal power");
        this.setDescription("Choose up to five creatures you can see within range. Make a melee force attack against each one. On hit, a target takes 6d10 force damage. You can then teleport to an unoccupied space you can see within 5 feet of one of the creatures you chose.");
        this.setPrerequiste("Phasestrike");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Instantaneous");
    }
    
}