import com.example.sw5ecompanion.models.powers.Power;

public class SabotageCharges extends Power
{
    public SabotageCharges () {
        super();
        this.setLvl(3);
        this.setName("Sabotage Charges");
        this.setType("3rd-level tech power");
        this.setDescription("You create six tiny sabotage charges that last for the power's duration. When you cast the power, and as a bonus action on subsequent turns, you can hurl up to two of the charges to points you choose within 120 feet. Each charge explodes if it reaches the point or hits a solid surface. Each creature within 5 feet of the explosion must make a Dexterity save. The explosion deals 2d6 re damage on a failure, or half damage on a success. O v e r c h a r g e T e c h . The number of charges created increases by two for each slot level above 3rd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self");
        this.setDuration("Concentration, up to 10 minutes");
    }
}