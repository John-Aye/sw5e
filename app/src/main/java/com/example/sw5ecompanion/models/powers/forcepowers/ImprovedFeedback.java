import com.example.sw5ecompanion.models.powers.Power;

public class ImprovedFeedback extends Power
{
    public ImprovedFeedback() {
        super();
        this.setLvl(1);
        this.setName("Improved Feedback");
        this.setType("1st-level dark side power");
        this.setDescription("You unleash a blast of psychic energy at a target within range. If the target can hear you (though it need not understand you), it must succeed on an Intelligence saving throw. On a failed save, it takes 3d6 psychic damage and must immediately use its reaction, if available, to move as far as its speed allows away from you. The creature doesn't move into obviously dangerous ground, such as a re or a pit. On a successful save, the target takes half as much damage and doesn't have to move away. A deafened creature automatically succeeds on the save. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.");
        this.setPrerequiste("Feedback");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }

}