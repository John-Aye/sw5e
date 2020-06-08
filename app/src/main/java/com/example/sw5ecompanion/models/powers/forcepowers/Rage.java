import com.example.sw5ecompanion.models.powers.Power;

public class Rage extends Power
{
    public Rage() {
        super();
        this.setLvl(6);
        this.setName("Rage");
        this.setType("6th-level dark side power");
        this.setDescription("You endow yourself with endurance and martial prowess fueled by the Force. Until the power ends, you can't cast powers, and you gain the following benets: You gain 50 temporary hit points. If any of these remain when the power ends, they are lost. You have advantage on attack rolls that you make with lightweapons and vibroweapons. When you hit a target with a weapon attack, that target takes an extra 2d12 force damage. You have prociency with all armor, lightweapons, and vibroweapons. You have prociency in Strength and Constitution saving throws. You can attack twice, instead of once, when you take the Attack action on your turn. You ignore this benet if you already have a feature, like Extra Attack, that gives you extra attacks. Immediately after the power ends, you must succeed on a DC 15 Constitution saving throw or suer one level of exhaustion.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 10 minutes");
    }
}