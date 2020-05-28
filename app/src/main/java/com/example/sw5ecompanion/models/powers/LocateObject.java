import com.example.sw5ecompanion.models.powers.Power;

public class LocateObject extends Power
{
    public LocateObject () {
        super();
        this.setLvl(2);
        this.setName("Locate Object");
        this.setType("2nd-level universal power");
        this.setDescription("Describe or name an object. You sense the direction to the object's location, as long as its within 1000 feet of you. If the object is in motion, you know the direction of its movement. The power can locate a specic object known to you, as long as you have seen it while within 30 feet of it. Alternatively, the power can locate the nearest object of a particular kind. This power can't locate an object if any thickness of lead blocks a direct path between you and the object.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
    
}