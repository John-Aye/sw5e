import com.example.sw5ecompanion.models.powers.Power;

public class Ward extends Power
{
    public Ward () {
        super();
        this.setLvl(0);
        this.setName("Ward");
        this.setType("At-will tech power");
        this.setDescription("You emit a powerful force field that deflects incoming attacks. Until the end of your next turn, you have resistance against kinetic and energy damage dealt by weapon attacks.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self");
        this.setDuration("1 round");
    }
}