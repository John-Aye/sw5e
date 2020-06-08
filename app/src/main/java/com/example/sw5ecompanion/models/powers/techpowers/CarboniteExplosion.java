import com.example.sw5ecompanion.models.powers.Power;

public class CarboniteExplosion extends Power
{
    public CarboniteExplosion () {
        super();
        this.setLvl(9);
        this.setName("Carbonite Explosion");
        this.setType("9th-level tech power");
        this.setDescription("You generate an explosion of cryogenic energy in a 60-foot-radius sphere centered on a point you can see within range. Each creature in the aected area must make a Constitution saving throw. On a failed save, the creature takes 8d6 + 20 cold damage and is restrained for 1 minute as it is encased in carbonite. On a successful save, the creature takes half damage and is restrained until the end of its next turn. As an action, a restrained creature can make a Strength check against your tech save DC, ending this eect on itself on a success. A creature reduced to 0 hit points by this power dies instantly, as its body shatters into frozen chunks.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("250 feet");
        this.setDuration("Instantaneous");
    }
}