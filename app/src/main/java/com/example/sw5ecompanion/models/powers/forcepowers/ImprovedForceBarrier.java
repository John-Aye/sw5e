import com.example.sw5ecompanion.models.powers.Power;

public class ImprovedForceBarrier extends Power
{
    public ImprovedForceBarrier() {
        super();
        this.setLvl(5);
        this.setName("Improved Force Barrier");
        this.setType("5th-level light side power");
        this.setDescription("This power further bolsters your allies with toughness and resolve. Choose up to twelve creatures within range. Each target gains the following benets: The becomes immune to poison and disease. Any currently existing poison or diseases still exist. The creature becomes immune to being frightened by powers. The creature's hit point maximum and current hit points increase by 2d10 for the duration. These benets last for 24 hours or until the end of your next long rest, whichever happens first.");
        this.setPrerequiste("Force Barrier");
        this.setCastingTime("10 minutes");
        this.setRange("30 feet");
        this.setDuration("Instantaneous");
    }
    
}