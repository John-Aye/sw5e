import com.example.sw5ecompanion.models.powers.Power;

public class ProgrammedIllusion extends Power
{
    public ProgrammedIllusion () {
        super();
        this.setLvl(6);
        this.setName("Programmed Illusion");
        this.setType("6th-level tech power");
        this.setDescription("You create an illusion of an object, a creature, or some other visible phenomenon within range that activates when a specic condition occurs. The illusion is imperceptible until then. It must be no larger than a 30-foot cube, and you decide when you cast the power how the illusion behaves and what sounds it makes. This scripted performance can last up to 5 minutes. When the condition you specify occurs, the illusion springs into existence and performs in the manner you described. Once the illusion nishes performing, it disappears and remains dormant for 10 minutes. After this time, the illusion can be activated again. The triggering condition can be as general or as detailed as you like, though it must be based on visual or audible conditions that occur within 30 feet of the area. For example, you could create an illusion of yourself to appear and warn o others who attempt to open a trapped door, or you could set the illusion to trigger only when a creature says the correct word or phrase. Physical interaction with the image reveals it to be an illusion, because things can pass through it. A creature that uses its action to examine the image can determine that it is an illusion with a successful Intelligence (Investigation) check against your tech save DC. If a creature discerns the illusion for what it is, the creature can see through the image, and any noise it makes sounds hollow to the creature.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("120 feet");
        this.setDuration("Until dispelled");
    }
}