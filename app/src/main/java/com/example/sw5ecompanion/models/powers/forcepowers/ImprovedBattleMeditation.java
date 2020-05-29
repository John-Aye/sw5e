import com.example.sw5ecompanion.models.powers.Power;

public class ImprovedBattleMeditation extends Power
{
    public ImprovedBattleMeditation() {
        super();
        this.setLvl(5);
        this.setName("Improved Battle Meditation");
        this.setType("5th-level universal power");
        this.setDescription("You exude an aura out to 15 feet that boosts the morale and overall battle prowess you and your allies while simultaneously reducing the opposition's combat-eectiveness by eroding their will to ght. Whenever you or a friendly creature within your meditation makes an attack roll or a saving throw, they can roll a d6 and add the number rolled to the attack roll or saving throw. Whenever a hostile creature starts enters your meditation or starts its turn there, it must make a Charisma saving throw. On a failed save, it must roll a d6 and subtract the number rolled from each attack roll or saving throw it makes before the end of your next turn. On a successful save, it is immune to this power for 1 day.");
        this.setPrerequiste("Battle Meditation");
        this.setCastingTime("1 action");
        this.setRange("Self (15-foot)");
        this.setDuration("Concentration, up to 1 minute");
    }
}