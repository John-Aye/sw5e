import com.example.sw5ecompanion.models.powers.Power;

public class SkillEmpowerment extends Power
{
    public SkillEmpowerment() {
        super();
        this.setLvl(5);
        this.setName("Skill Empowerment");
        this.setType("5th-level light side power");
        this.setDescription("Your power with the Force deepens a creature's understanding of its own talent. You touch one willing creature and give it expertise in one skill of your choice; until the power ends, the creature doubles its prociency bonus for ability checks it makes that use the chosen skill. You must choose a skill in which the target is procient and that isn't already beneting from an eect, such as Expertise, that doubles its prociency bonus.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 hour");
    }
}