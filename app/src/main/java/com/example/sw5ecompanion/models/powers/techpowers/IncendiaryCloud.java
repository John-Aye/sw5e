import com.example.sw5ecompanion.models.powers.Power;

public class IncendiaryCloud extends Power
{
    public IncendiaryCloud () {
        super();
        this.setLvl(8);
        this.setName("Incendiary Cloud");
        this.setType("8th-level tech power");
        this.setDescription("You create a swirling cloud of smoke shot through with white-hot embers in a 20-foot-radius sphere centered on a point within range. The cloud spreads around corners and is heavily obscured. It lasts for the duration or until a wind of moderate or greater speed (at least 10 miles per hour) disperses it. When the cloud appears, each creature in it must make a Dexterity saving throw. A creature takes 10d8 re damage on a failed save, or half as much damage on a successful one. A creature must also make this saving throw when it enters the power's area for the rst time on a turn or ends its turn there. The cloud moves 10 feet directly away from you in a direction that you choose at the start of each of your turns.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("150 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}