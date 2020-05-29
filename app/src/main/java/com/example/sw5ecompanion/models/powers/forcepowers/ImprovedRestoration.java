import com.example.sw5ecompanion.models.powers.Power;

public class ImprovedRestoration extends Power
{
    public ImprovedRestoration() {
        super();
        this.setLvl(5);
        this.setName("Improved Restoration");
        this.setType("5th-level light side power");
        this.setDescription("You imbue a creature you touch with positive energy to undo a debilitating eect. You can reduce the target's exhaustion level by one, or end one of the following eects on the target: One eect that charmed the target. One curse, including the target's attunement to a cursed item. Any reduction to one of the target's ability scores. One eect reducing the target's hit point maximum.");
        this.setPrerequiste("Restoration");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
    
}