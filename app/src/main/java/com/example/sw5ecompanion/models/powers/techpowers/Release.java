import com.example.sw5ecompanion.models.powers.Power;

public class Release extends Power
{
    public Release () {
        super();
        this.setLvl(2);
        this.setName("Release");
        this.setType("2nd-level tech power");
        this.setDescription("Choose an object that you can see within range. The object can be a door, a box, a chest, a set of binders, a lock, or another object that contains a mundane or enhanced means that prevents access. A target that is held shut by a mundane lock or that is stuck or barred becomes unlocked, unstuck, or unbarred. If the object has multiple locks, only one of them is unlocked. If you choose a target that is held shut with lo ck , that power is suppressed for 10 minutes, during which time the target can be opened and shut normally.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}