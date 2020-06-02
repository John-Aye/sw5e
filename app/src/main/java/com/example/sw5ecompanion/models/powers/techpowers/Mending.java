import com.example.sw5ecompanion.models.powers.Power;

public class Mending extends Power
{
    public Mending () {
        super();
        this.setLvl(0);
        this.setName("Mending");
        this.setType("At-will tech power");
        this.setDescription("This ability repairs a single break or tear in an object you touch, such as broken chain link, two halves of a broken key, a torn strap, or a leaking cup. As long as the break or tear is no larger than 1 foot in any dimension, you mend it, leaving no trace of the former damage.");
        this.setPrerequiste("");
        this.setCastingTime("1 minute")
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}