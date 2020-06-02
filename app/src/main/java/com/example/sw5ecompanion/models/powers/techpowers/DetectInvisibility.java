import com.example.sw5ecompanion.models.powers.Power;

public class DetectInvisibility extends Power
{
    public DetectInvisibility () {
        super();
        this.setLvl(2);
        this.setName("Detect Invisibility");
        this.setType("2nd-level tech power");
        this.setDescription("For the duration, you see invisible creatures and objects as if they were visible.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self");
        this.setDuration("1 hour");
    }
}