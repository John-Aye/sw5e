import com.example.sw5ecompanion.models.powers.Power;

public class FreedomOfMovement extends Power
{
    public FreedomOfMovement() {
        super();
        this.setLvl(4);
        this.setName("Force Trance");
        this.setType("4th-level universal power");
        this.setDescription("You touch a willing creature. Its movement is unaected by dicult terrain, and powers and enhanced eects can't reduce its speed or cause it to be paralyzed or restrained. The target can spend 5 feet of movement to automatically escape from unenhanced restraints. Additionally, being underwater imposes no penalties on its movement or attacks.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("1 hour");
    }
}