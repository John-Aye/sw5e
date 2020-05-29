import com.example.sw5ecompanion.models.powers.Power;

public class MassHysteria extends Power
{
    public MassHysteria () {
        super();
        this.setLvl(9);
        this.setName("Mass Hysteria");
        this.setType("9th-level dark side power");
        this.setDescription("Drawing on the deepest fears of a group of creatures, you create illusory creatures in their minds, manifesting their worst nightmares as an implacable threat visible only to them. Each creature in a 30-footradius sphere is frightened for the duration of the power. At the end of each of the frightened creature's turns, it must succeed on a Wisdom saving throw or take 5d10 psychic damage. On a successful save, the power ends for that creature. This power has no eect on droids or constructs.");
        this.setPrerequiste("Hysteria");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}