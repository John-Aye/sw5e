import com.example.sw5ecompanion.models.powers.Power;

public class RingOfFire extends Power
{
    public RingOfFire () {
        super();
        this.setLvl(1);
        this.setName("Ring Of Fire");
        this.setType("1st-level tech power");
        this.setDescription("A wall of flames erupts out of the ground in a ring around you with a radius of 15 feet and a height of 10 feet. Creatures who start their turn in the ring of re or pass through it on their turn take 1d6 re damage. Creatures within the ring of re who willingly try to move through the re to escape must succeed on a Wisdom saving throw to do so. Creatures who are immune to fear or re automatically succeed on this saving throw. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the damage of the ring of re increases by 1d6 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
}