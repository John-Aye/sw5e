import com.example.sw5ecompanion.models.powers.Power;

public class Analyze extends Power
{
    public Analyze () {
        super();
        this.setLvl(1);
        this.setName("Analyze");
        this.setType("1st-level tech power");
        this.setDescription("You choose one object that you must touch throughout the casting of the power. If it is an enhanced or modied item, you learn its properties and how to use them, whether it requires attunement to use, and how many charges it has, if any. You learn whether any powers are aecting the item and what they are. If the item was created by a power, you learn which power created it. If you instead touch a creature throughout the casting, you learn what tech powers, if any, are currently aecting it.");
        this.setPrerequiste("");
        this.setCastingTime("1 minute");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}