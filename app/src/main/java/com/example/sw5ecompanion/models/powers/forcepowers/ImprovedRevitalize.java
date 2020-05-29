import com.example.sw5ecompanion.models.powers.Power;

public class ImprovedRevitalize extends Power
{
    public ImprovedRevitalize() {
        super();
        this.setLvl(7);
        this.setName("Improved Revitalize");
        this.setType("7th-level light side power");
        this.setDescription("You return a dead creature you touch to life, provided that it has been dead no longer than 1 hour. If the creature's soul is both willing and at liberty to rejoin the body, the creature returns to life with all its hit points. This power also neutralizes any poisons and cures diseases that aected the creature at the time it died. This power closes all mortal wounds and restores any missing body parts. Coming back from the dead is an ordeal. The target takes a -4 penalty to all attack rolls, saving throws, and ability checks. Every time the target nishes a long rest, the penalty is reduced by 1 until it disappears.");
        this.setPrerequiste("Revitalize");
        this.setCastingTime("10 minutes");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
    
}