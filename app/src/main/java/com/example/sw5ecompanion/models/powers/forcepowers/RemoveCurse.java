import com.example.sw5ecompanion.models.powers.Power;

public class RemoveCurse extends Power
{
    public RemoveCurse() {
        super();
        this.setLvl(3);
        this.setName("Remove Curse");
        this.setType("3rd-level light side power");
        this.setDescription("At your touch, all curses aecting one creature or object end. If the object is a cursed enhanced item, its curse remains, but the power breaks its owner's attunement to the object so it can be removed or discarded.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}