import com.example.sw5ecompanion.models.powers.Power;

public class LocateCreature extends Power
{
    public LocateCreature () {
        super();
        this.setLvl(4);
        this.setName("Locate Creature");
        this.setType("4th-level universal power");
        this.setDescription("Describe or name a creature familiar to you. You sense the direction to the creature's location, as long as its within 1000 feet of you. If the creature is in motion, you know the direction of its movement. The power can locate a specic creature known to you or the nearest of a specic kind, as long as you have seen it while within 30 feet of it. If the creature is in a dierent form, the power doesn't work. This power can't locate a creature if running water at least 10 feet wide blocks a direct path between you and the creature.");
        this.setPrerequiste("Locate Object");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
    
}