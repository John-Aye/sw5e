import com.example.sw5ecompanion.models.powers.Power;

public class JetOfFlame extends Power
{
    public JetOfFlame () {
        super();
        this.setLvl(0);
        this.setName("Jet Of Flame");
        this.setType("At-will tech power");
        this.setDescription("A flickering flame appears in your hand. The flame remains there for the duration and harms neither you nor your equipment. The ame sheds bright light in a 10-foot radius and dim light for an additional 10 feet. The power ends if you dismiss it as an action or if you cast it again. You can also attack with the ame, although doing so ends the power. When you cast this power, or as an action on a later turn, you can hurl the ame at a creature within 30 feet of you. Make a ranged tech attack. On a hit, the target takes 1d8 re damage. This power's damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self (30-foot sphere)");
        this.setDuration("10 minutes");
    }
}