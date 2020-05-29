import com.example.sw5ecompanion.models.powers.Power;

public class Enfeeble extends Power
{
    public Enfeeble() {
        super();
        this.setLvl(0);
        this.setName("Enfeeble");
        this.setType("At-will dark side power");
        this.setDescription("Dark energy courses from your hand at a creature within range. The target must succeed on a Wisdom saving throw. If it is missing any hit points, it takes 1d12 necrotic damage. Otherwise, it takes 1d8. The power's damage increases by one die when you reach 5th, 11th, and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}