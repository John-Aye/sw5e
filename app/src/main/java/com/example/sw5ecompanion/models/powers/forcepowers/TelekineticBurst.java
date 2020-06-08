import com.example.sw5ecompanion.models.powers.Power;

public class TelekineticBurst extends Power
{
    public TelekineticBurst () {
        super();
        this.setLvl(6);
        this.setName("Telekinetic Burst");
        this.setType("6th-level light side power");
        this.setDescription("A beam of Force energy ashes out from your hand in a 5-foot-wide, 60-foot-long line. Each creature in the line must make a Constitution saving throw. On a failed save, a creature takes 8d6 force damage and is knocked prone. On a successful save, it takes half as much damage and isn't knocked prone. You can create a new telekinetic gust as your action on your turn until the power ends. F o r c e P o t e n c y . When you cast this power using a force slot of 7th level or higher, the damage increases by 2d6 for each slot level above 6th.");
        this.setPrerequiste("Telekinetic Storm");
        this.setCastingTime("1 action");
        this.setRange("Self (60-foot line)");
        this.setDuration("Concentration, up to 1 minute");
    }
}