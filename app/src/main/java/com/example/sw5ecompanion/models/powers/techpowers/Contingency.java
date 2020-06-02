import com.example.sw5ecompanion.models.powers.Power;

public class Contingency extends Power
{
    public Contingency () {
        super();
        this.setLvl(6);
        this.setName("Contingency");
        this.setType("6th-level tech power");
        this.setDescription("Choose a tech power of 5th-level or lower that you can cast, that has a casting time of 1 action, and that can target you. You cast that power, called the contingent power, as part of casting contingency, expending tech points for both, but the contingent power doesn't come into eect. Instead, it takes eect when a certain circumstance occurs. You describe that circumstance when you cast the two powers. The contingent power takes eect immediately after the circumstance is met for the rst time, whether or not you want it to, and then contingency ends. The contingent power takes eect only on you, even if it can normally target others. You can use only one contingency power at a time. If you cast this power again, the eect of another contingency power on you ends. Also, contingency ends on you if your tech focus is ever not on your person.");
        this.setPrerequiste("");
        this.setCastingTime("10 minutes");
        this.setRange("Self");
        this.setDuration("10 days");
    }
}