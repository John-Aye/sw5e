import com.example.sw5ecompanion.models.powers.Power;

public class AcidSplash extends Power
{
    public AcidSplash () {
        super();
        this.setLvl(0);
        this.setName("Acid Splash");
        this.setType("At-will tech power");
        this.setDescription("You emit a burst of acid. Choose one creature within range, or choose two creatures within range that are within 5 feet of each other. A target must succeed on a Dexterity saving throw or take 1d6 acid damage. This power's damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}