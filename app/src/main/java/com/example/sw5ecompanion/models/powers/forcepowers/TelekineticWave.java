import com.example.sw5ecompanion.models.powers.Power;

public class TelekineticWave extends Power
{
    public TelekineticWave () {
        super();
        this.setLvl(8);
        this.setName("Telekinetic Wave");
        this.setType("8th-level light side power");
        this.setDescription("You manipulate the Force in a 60-foot radius centered on a point you choose within range. Each creature in that area must make a Constitution saving throw. On a failed save, a creature takes 12d6 force damage, is knocked prone, and moved 5 feet in a direction of your choice. On a successful save, it takes half as much damage and isn't knocked prone or moved. F o r c e P o t e n c y . When you cast this power using a force slot of 9th level, the damage increases by 2d6.");
        this.setPrerequiste("Telekinetic Burst");
        this.setCastingTime("1 action");
        this.setRange("150 feet");
        this.setDuration("Instantaneous");
    }
}