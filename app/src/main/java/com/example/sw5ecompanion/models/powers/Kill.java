import com.example.sw5ecompanion.models.powers.Power;

public class Kill extends Power
{
    public Kill() {
        super();
        this.setLvl(9);
        this.setName("Kill");
        this.setType("9th-level dark side power");
        this.setDescription("You compel one creature you can see within range to die instantly. If the creature you choose has 100 hit points or fewer, it dies. Otherwise, the power has no effect.");
        this.setPrerequiste("Ruin");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
    
}