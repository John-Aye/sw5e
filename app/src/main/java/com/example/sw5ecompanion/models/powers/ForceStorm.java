import com.example.sw5ecompanion.models.powers.Power;

public class ForceStorm extends Power
{
    public ForceStorm() {
        super();
        this.setLvl(9);
        this.setName("Force Storm");
        this.setType("9th-level dark side power");
        this.setDescription("A crackling storm of lightning appears in a location you choose within range. Whenever a creature enters the storm or starts its turn there, it must make a Dexterity saving throw. On a failed save, it takes 30d6 lightning damage or half as much as a successful one. The power damages objects in the area and ignites ammable objects that aren't being worn or carried.");
        this.setPrerequiste("Force Lightning Cone");
        this.setCastingTime("1 action");
        this.setRange("150 feet (60-foot cylinder)");
        this.setDuration("Concentration, up to 1 minute");
    }
}