import com.example.sw5ecompanion.models.powers.Power;

public class OilSlick extends Power
{
    public OilSlick () {
        super();
        this.setLvl(1);
        this.setName("Oil Slick");
        this.setType("1st-level tech power");
        this.setDescription("You cover the ground in a 10-foot square within range in oil. For the duration, it is dicult terrain. When the oil appears, each creature standing in its area must succeed on a Dexterity saving throw or fall prone. A creature that enters the area or ends its turn there must also succeed on a Dexterity saving throw. The oil is ammable. Any 5 foot square of the oil exposed to re burns away in one round. Each creature who enters the re or starts it turn there must make a Dexterity saving throw, taking 3d6 re damage on a failed save, or half as much on a successful one. The re ignites any ammable objects in the area that aren't being worn or carried.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("60 feet");
        this.setDuration("1 minute");
    }
}