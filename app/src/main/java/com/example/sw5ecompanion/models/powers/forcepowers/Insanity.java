import com.example.sw5ecompanion.models.powers.Power;

public class Insanity extends Power
{
    public Insanity() {
        super();
        this.setLvl(5);
        this.setName("Insanity");
        this.setType("5th-level dark side power");
        this.setDescription("This power assaults and twists creatures' minds, spawning delusions and provoking uncontrolled action. Each creature in a 30-foot-radius sphere centered on you must succeed on a Wisdom saving throw when you cast this power or be aected by it. An aected target can't take reactions and must roll a d8 at the start of each of its turns to determine its behavior for that turn. This power has no eect on constructs or droids. d8   Behavior\n" +
                "1\n" +
                "The creature uses all its movement to move in a random direction. To determine the direction, roll a d8 and assign a direction to each die face. The creature doesn't take an action this turn. 2-6 The creature doesn't move or take actions this turn.\n" +
                "7-8\n" +
                "The creature uses its action to make a melee attack against a randomly determined creature within its reach. If there is no creature within its reach, the creature does nothing this turn.\n" +
                "At the end of each of its turns, an aected target can make a Wisdom saving throw. If it succeeds, this eect ends for that target. F o r c e P o t e n c y . When you cast this power using a power slot of 6th level or higher, the radius of the sphere increases by 5 feet for each force slot level above 5th.");
        this.setPrerequiste("Horror");
        this.setCastingTime("1 action");
        this.setRange("Self (30-foot sphere)");
        this.setDuration("Concentration, up to 1 minute");
    }
    
}