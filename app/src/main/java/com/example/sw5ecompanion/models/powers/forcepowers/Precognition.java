import com.example.sw5ecompanion.models.powers.Power;

public class Precognition extends Power
{
    public Precognition() {
        super();
        this.setLvl(9);
        this.setName("Precognition");
        this.setType("9th-level universal power");
        this.setDescription("Your mastery of the Force gives you a limited ability to see into the immediate future. For the duration, you can't be surprised and you have advantage on attack rolls, ability checks, and saving throws. Additionally, other creatures have disadvantage on attack rolls against you for the duration.");
        this.setPrerequiste("Danger Sense");
        this.setCastingTime("1 minute");
        this.setRange("Self");
        this.setDuration("8 hours");
    }
}