import com.example.sw5ecompanion.models.powers.Power;

public class Crush extends Power
{
    public Crush() {
        super();
        this.setLvl(6);
        this.setName("Crush");
        this.setType("6th-level dark side power");
        this.setDescription("You make a crushing gesture at a creature within range. The target must make a Constitution saving throw. On a failed save target takes 10d8 force damage and is paralyzed until the end of your next turn. On a successful save, the target takes half as much damage and is not paralyzed. You can use a bonus action while the target is paralyzed to move the target up to 10 feet in any direction. F o r c e P o t e n c y . When you cast this power using a force slot of 7th level or higher, the damage increases by 1d8 for each slot level above 6th.");
        this.setPrerequiste("Choke");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}