import com.example.sw5ecompanion.models.powers.Power;

public class Ruin extends Power
{
    public Ruin() {
        super();
        this.setLvl(7);
        this.setName("Ruin");
        this.setType("7th-level dark side power");
        this.setDescription("You channel the dark side of the Force to desecrate a creature you can see within range, causing waves of intense pain to assail it. If the target has 100 hit points or fewer, it is subject to crippling pain. Otherwise, the power has no eect on it. While the target is aected by crippling pain, any speed it has can be no higher than 10 feet. The target also has disadvantage on attack rolls, ability checks, and saving throws, other than Constitution saving throws. Finally, if the target tries to cast a power, it must rst succeed on a Constitution saving throw, or the casting fails and the power is wasted. A target suering this pain can make a Constitution saving throw at the end of each of its turns. On a successful save, the pain ends.");
        this.setPrerequiste("Wound");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}