import com.example.sw5ecompanion.models.powers.Power;

public class BestowCurse extends Power
{
    public BestowCurse() {
        super();
        this.setLvl(3);
        this.setName("Bestow Curse");
        this.setType("3rd-level dark side power");
        this.setDescription("You touch a creature, and that creature must succeed on a Wisdom saving throw or become cursed for the duration of the power. When you cast this power, choose the nature of the curse from the following options: Choose one ability score. While cursed, the target has disadvantage on ability checks and saving throws made with that ability score. While cursed, the target has disadvantage on attack rolls against you. While cursed, the target must make a Wisdom saving throw at the start of each of its turns. lf it fails, it wastes its action that turn doing nothing. While the target is cursed, your attacks and powers deal an extra 1d8 necrotic damage to the target. A remove curse power ends this eect. At the GM's discretion, you may choose an alternative curse eect, but it should be no more powerful than those described above. The GM has nal say on such a curse's effect. ");
        this.setPrerequiste("Curse");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 minute");
    }
}