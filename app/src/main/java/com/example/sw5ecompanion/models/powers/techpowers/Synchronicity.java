import com.example.sw5ecompanion.models.powers.Power;

public class Synchronicity extends Power
{
    public Synchronicity () {
        super();
        this.setLvl(4);
        this.setName("Synchronicity");
        this.setType("4th-level tech power");
        this.setDescription("A creature you touch isn't inconvenienced by mundane delays. Trac lights are always green, there's always a waiting elevator, and a taxi is always around the corner. The target can run at full speed through dense crowds and attacks of opportunity provoked by the target's movement are made with disadvantage. The power also grants advantage to stealth checks, since cover is always available. Additionally, the target has advantage on all ability checks made to drive a vehicle. If two or more creatures under the eect of the power are attempting to avoid being inconvenienced by each other, the creatures make Charisma checks each time the eects would oppose each other. The higher check of the two's power takes effect.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 hour");
    }
}