import com.example.sw5ecompanion.models.powers.Power;

public class TelekineticStorm extends Power
{
    public TelekineticStorm () {
        super();
        this.setLvl(3);
        this.setName("Telekinetic Storm");
        this.setType("3rd-level light side power");
        this.setDescription("You stir the Force around you, creating a turbulent eld of telekinetic energy that buets enemies around you. The eld extends out to a distance of 15 feet around you for the duration. When you cast this power, you can designate any number of creatures you can see to be unaected by it. An aected creature's speed is halved in the area, and when the creature enters the area for the rst time on a turn or starts its turn there, it must make a Constitution saving throw. On a failed save, the creature takes 3d8 force damage. On a successful save, the creature takes half as much damage. F o r c e P o t e n c y . When you cast this power using a force power slot of 4th level or higher, the damage increases by 1d8 for each slot level above 3rd.");
        this.setPrerequiste("Turbulence");
        this.setCastingTime("1 action");
        this.setRange("Self (15-foot radius)");
        this.setDuration("Concentration, up to 1 minute");
    }
}