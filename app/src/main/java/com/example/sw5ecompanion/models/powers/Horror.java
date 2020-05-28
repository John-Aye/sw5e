import com.example.sw5ecompanion.models.powers.Power;

public class Horror extends Power
{
    public Horror() {
        super();
        this.setLvl(3);
        this.setName("Horror");
        this.setType("3rd-level dark side power");
        this.setDescription("You project a phantasmal image of a creature's worst fears. Each creature in a 30-foot cone must succeed on a Wisdom saving throw or drop whatever it is holding and become frightened for the duration. This power has no eect on constructs or droids. While frightened by this power, a creature must take the Dash action and move away from you by the safest available route on each of its turns, unless there is nowhere to move. If the creature ends its turn in a location where it doesn't have line of sight to you, the creature can make a Wisdom saving throw. On a successful save, the power ends for that creature.");
        this.setPrerequiste("Fear");
        this.setCastingTime("1 action");
        this.setRange("Self (30-foot cone)");
        this.setDuration("Concentration, up to 1 minute");
    }
}