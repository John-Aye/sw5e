import com.example.sw5ecompanion.models.powers.Power;

public class CorrosiveSphere extends Power
{
    public CorrosiveSphere () {
        super();
        this.setLvl(4);
        this.setName("Corrosive Sphere");
        this.setType("4th-level tech power");
        this.setDescription("You create a globule of acid and hurl it at a point within range, where it explodes in a 20-foot-radius sphere. Each creature in that area must make a Dexterity saving throw. On a failed save, a creature takes 10d4 acid damage and another 5d4 acid damage at the end of its next turn. On a successful save, a creature takes half the initial damage and no damage at the end of its next turn.");
        this.setPrerequiste("");
        this.setCastingTime("10 minutes");
        this.setRange("150 feet");
        this.setDuration("Instantaneous");
    }
}