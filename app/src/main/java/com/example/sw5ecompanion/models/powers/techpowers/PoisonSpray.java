import com.example.sw5ecompanion.models.powers.Power;

public class PoisonSpray extends Power
{
    public PoisonSpray () {
        super();
        this.setLvl(0);
        this.setName("Poison Spray");
        this.setType("At-will tech power");
        this.setDescription("You extend your hand toward a creature you can see within range and project a pu of noxious gas. The creature must succeed on a Constitution saving throw or take 1d12 poison damage. This power's damage increases by 1d12 when you reach 5th level (2d12), 11th level (3d12), and 17th level (4d12).");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("10 feet");
        this.setDuration("Instantaneous");
    }
}