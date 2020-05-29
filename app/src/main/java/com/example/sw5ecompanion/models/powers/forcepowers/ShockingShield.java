import com.example.sw5ecompanion.models.powers.Power;

public class ShockingShield extends Power
{
    public ShockingShield() {
        super();
        this.setLvl(4);
        this.setName("Shocking Shield");
        this.setType("4th-level dark side power");
        this.setDescription("Lightning courses in a sphere surrounding your body, shedding bright light in a 10-foot radius and dim light for an additional 10 feet. You can use your action to end the power early. Whenever a creature within 5 feet of you hits you with a melee attack, it takes 2d8 lightning damage.");
        this.setPrerequiste("Shock");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("10 minutes");
    }
}