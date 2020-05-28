import com.example.sw5ecompanion.models.powers.Power;

public class ForceSight extends Power
{
    public ForceSight() {
        super();
        this.setLvl(2);
        this.setName("Force Sight");
        this.setType("2nd-level universal power");
        this.setDescription("You shift your vision to see through use of the Force; colors fade and inanimate objects appear as shades of gray. You gain the following benets. Living things glow with the power of the Force. Those with an anity for the light side glow blue, those with an anity for the dark side glow red, and those with no attunement to either side of the Force glow yellow. How bright they glow is determined by how strong their connection to the Force is. You gain blindsight to 30 feet. You have advantage on Wisdom (Perception) checks that rely on sight against living targets within 30 feet.");
        this.setPrerequiste("Sense Force");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 10 minutes");
    }
}