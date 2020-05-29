import com.example.sw5ecompanion.models.powers.Power;

public class MindBlank extends Power
{
    public MindBlank() {
        super();
        this.setLvl(8);
        this.setName("Mind Blank");
        this.setType("8th-level universal power");
        this.setDescription("Until the power ends, one willing creature you touch is immune to psychic and sonic damage, any eect that would sense its emotions or read its thoughts, and the charmed condition. The power foils powers or eects of similar power used to aect the target's mind or to gain information about the target.");
        this.setPrerequiste("Mind Trap");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("24 hours");
    }
}