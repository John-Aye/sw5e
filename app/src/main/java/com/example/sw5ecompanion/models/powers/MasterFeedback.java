import com.example.sw5ecompanion.models.powers.Power;

public class MasterFeedback extends Power
{
    public MasterFeedback() {
        super();
        this.setLvl(9);
        this.setName("Master Feedback");
        this.setType("9th-level dark side power");
        this.setDescription("You unleash the power of your mind to blast the intellect of up to ten creatures of your choice that you can see within range. Creatures that have an Intelligence score of 2 or lower are unaected. Each target must make an Intelligence saving throw. On a failed save, a target takes 14d6 psychic damage and is stunned. On a successful save, a target takes half as much damage and isn't stunned. A stunned target can make a Wisdom saving throw at the end of each of its turns. On a successful save, the stunning effect ends.");
        this.setPrerequiste("Greater Feedback");
        this.setCastingTime("1 action");
        this.setRange("90 feet");
        this.setDuration("Instantaneous");
    }
}