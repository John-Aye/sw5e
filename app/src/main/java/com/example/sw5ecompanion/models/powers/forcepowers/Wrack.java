import com.example.sw5ecompanion.models.powers.Power;

public class Wrack extends Power
{
    public Wrack () {
        super();
        this.setLvl(6);
        this.setName("Wrack");
        this.setType("6th-level dark side power");
        this.setDescription("You wrack the body of a creature that you can see with a virulent, disease-like condition. The target must make a Constitution saving throw. On a failed save, it takes 14d6 necrotic damage, or half as much damage on a successful save. The damage can't reduce the target's hit points below 1. If the target fails the saving throw, its hit point maximum is reduced for 1 hour by an amount equal to the necrotic damage it took. Any eect that removes a disease allows a creature's hit point maximum to return to normal before that time passes. F o r c e P o t e n c y . If you cast this power using a force slot of 7th level or higher, the power deals an extra 2d6 damage for each slot level above 6th.");
        this.setPrerequiste("Plague");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}