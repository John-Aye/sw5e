import com.example.sw5ecompanion.models.powers.Power;

public class InvisibilityToCameras extends Power
{
    public InvisibilityToCameras () {
        super();
        this.setLvl(3);
        this.setName("Invisibility to Cameras");
        this.setType("3rd-level tech power");
        this.setDescription("Up to four creatures of your choice become undetectable to electronic sensors and cameras. Anything the target is wearing or carrying is also undetectable, so long as it's on the target's person. The target is still visible to regular vision.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("10 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}