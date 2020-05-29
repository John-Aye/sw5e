import com.example.sw5ecompanion.models.powers.Power;

public class ShareLife extends Power
{
    public ShareLife() {
        super();
        this.setLvl(3);
        this.setName("Share Life");
        this.setType("3rd-level light side power");
        this.setDescription("You sacrice some of your health to mend another creature's injuries. You take 4d8 necrotic damage, and one creature of your choice that you can see within range regains a number of hit points equal to twice the necrotic damage you take. This power has no eect on droids or constructs. F o r c e P o t e n c y . When you cast this power using a force slot of 4th level or higher, the damage increases by 1d8 for each slot level above 3rd.");
        this.setPrerequiste("Give Life");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Instantaneous");
    }
}