import com.example.sw5ecompanion.models.powers.Power;

public class MobileLights extends Power
{
    public MobileLights () {
        super();
        this.setLvl(0);
        this.setName("Mobile Lights");
        this.setType("At-will tech power");
        this.setDescription("You create up to four orbs of light within range that hover in the air for the duration. You can also combine the four lights into one glowing vaguely humanoid form of Medium size. Whichever form you choose, each light sheds dim light in a 10-foot radius. As a bonus action on your turn, you can move the lights up to 60 feet to a new spot within range. A light must be within 20 feet of another light created by this power, and a light winks out if it exceeds the power's range.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}