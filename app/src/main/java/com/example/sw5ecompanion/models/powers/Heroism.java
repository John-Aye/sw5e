import com.example.sw5ecompanion.models.powers.Power;

public class Heroism extends Power
{
    public Heroism() {
        super();
        this.setLvl(1);
        this.setName("Heroism");
        this.setType("1st-level light side power");
        this.setDescription("A willing creature you touch is imbued with bravery. Until the power ends, the creature is immune to being frightened and gains temporary hit points equal to your forcecasting ability modier at the start of each of its turns. When the power ends, the target loses any remaining temporary hit points from this power. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, you can target one additional creature for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 minute");
    }
}