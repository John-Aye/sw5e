import com.example.sw5ecompanion.models.powers.Power;

public class Telekinesis extends Power
{
    public Telekinesis () {
        super();
        this.setLvl(5);
        this.setName("Telekinesis");
        this.setType("5th-level universal power");
        this.setDescription("You gain the ability to move or manipulate creatures and objects with the Force. When you cast this power, and as your action each round for the duration, you can exert your will on one creature or object that you can see within range, causing the appropriate eect below. You can aect the same target round after round, or choose a new one at any time. If you switch targets, the prior target is no longer aected by the power. C r e a t u r e . You can try to move a Huge or smaller creature. The target must make a Strength saving throw. On a failed save, you move the creature up to 30 feet in any direction, including upward but not beyond the range of this power. Until the end of your next turn, the creature is restrained in your telekinetic grip. A creature lifted upward is suspended in mid-air. On subsequent rounds, you can use your action to attempt to maintain your telekinetic grip on the creature by repeating the contest. O b j e c t . You move an object that isn't being worn or carried and weighs up to 2,500 lbs up to 30 feet in any direction, but not beyond the range of this power. You can exert ne control on objects with your telekinetic grip, such as manipulating a simple tool, opening a door or a container, stowing or retrieving an item from an open container, or pouring the contents from a vial. F o r c e P o t e n c y . When you cast this power using a force slot of 6th level or higher, the maximum object weight increases by 2,500 lbs for every slot level above 5th.");
        this.setPrerequiste("Force Throw");
        this.setCastingTime("1 action");
        this.setRange("90 feet");
        this.setDuration("Concentration, up to 10 minutes");
    }
}