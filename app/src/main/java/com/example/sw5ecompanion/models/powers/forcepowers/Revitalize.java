import com.example.sw5ecompanion.models.powers.Power;

public class Revitalize extends Power
{
    public Revitalize() {
        super();
        this.setLvl(5);
        this.setName("Revitalize");
        this.setType("5th-level light side power");
        this.setDescription("You return a dead creature you touch to life, provided that it has been dead no longer than 10 minutes. If the creature's soul is both willing and at liberty to rejoin the body, the creature returns to life with 1 hit point. This power also neutralizes any poisons and cures diseases that aected the creature at the time it died. This power closes all mortal wounds, but it doesn't restore missing body parts. If the creature is lacking body parts or organs integral for its survival—its head, for instance—the power automatically fails. Coming back from the dead is an ordeal. The target takes a -4 penalty to all attack rolls, saving throws, and ability checks. Every time the target nishes a long rest, the penalty is reduced by 1 until it disappears.");
        this.setPrerequiste("Spare the Dying");
        this.setCastingTime("1 minute");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}