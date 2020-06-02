import com.example.sw5ecompanion.models.powers.Power;

public class Neurotoxin extends Power
{
    public Neurotoxin () {
        super();
        this.setLvl(7);
        this.setName("Neurotoxin");
        this.setType("7th-level tech power");
        this.setDescription("You release a series of darts lled with neurotoxin. Choose any number of creatures you can see within range. Each creature must make a Constitution saving throw. On a failed save, a creature suers an eect based on its current hit points: 60 hit points or fewer: poisoned for 1 minute 50 hit points or fewer: poisoned and deafened for 1 minute 40 hit points or fewer: poisoned, deafened, and blinded for 10 minutes 30 hit points or fewer: poisoned, blinded, deafened, and stunned for 1 hour 20 hit points or fewer: killed instantly This power has no eect on droids or constructs.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action")
        this.setRange("30 feet");
        this.setDuration("Instantaneous");
    }
}