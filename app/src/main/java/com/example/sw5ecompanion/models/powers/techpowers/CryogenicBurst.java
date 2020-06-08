import com.example.sw5ecompanion.models.powers.Power;

public class CryogenicBurst extends Power
{
    public CryogenicBurst () {
        super();
        this.setLvl(0);
        this.setName("Cryogenic Burst");
        this.setType("At-will level tech power");
        this.setDescription("A emit a burst of cold energy at a creature within range. Make a ranged tech attack against the target. On a hit, it takes 1d8 cold damage, and its speed is reduced by 10 feet until the start of your next turn. The power's damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}