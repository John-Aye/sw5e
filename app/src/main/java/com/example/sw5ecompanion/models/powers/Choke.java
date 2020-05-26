import com.example.sw5ecompanion.models.powers.Power;

public class Choke extends Power
{
    public Choke() {
        super();
        this.setLvl(3);
        this.setName("Choke");
        this.setType("3rd-level dark side power");
        this.setDescription("You make a constricting gesture at a creature within range. The target must make a Constitution saving throw. On a failed save target takes 5d8 force damage and is restrained until the end of your next turn. On a successful save, the target takes half as much damage and is not restrained. You can use a bonus action while the target is restrained to move the target up to 5 feet in any direction. F o r c e P o t e n c y . When you cast this power using a force slot of 4th level or higher, the damage increases by 1d8 for each slot level above 3rd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}