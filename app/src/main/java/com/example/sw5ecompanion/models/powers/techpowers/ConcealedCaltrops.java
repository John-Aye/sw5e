import com.example.sw5ecompanion.models.powers.Power;

public class ConcealedCaltrops extends Power
{
    public ConcealedCaltrops () {
        super();
        this.setLvl(2);
        this.setName("Concealed Caltrops");
        this.setType("2nd-level tech power");
        this.setDescription("You scatter a large number of caltrops across ground in a 20-foot radius centered on a point within range. These caltrops pierce deep into the feet and boots of anyone who walks upon them. The area becomes dicult terrain for the duration. When a creature moves into or within the area, it takes 2d4 kinetic damage for every 5 feet it travels. The caltrops are nearly invisible to the naked eye. Any creature that can't see the area at the time the power is cast must make a Wisdom (Perception) check against your tech save DC to notice the caltrops before entering the area.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("150 feet");
        this.setDuration("Concentration, up to 1 hour");
    }
}