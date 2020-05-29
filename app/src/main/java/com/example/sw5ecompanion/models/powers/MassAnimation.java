import com.example.sw5ecompanion.models.powers.Power;

public class MassAnimation extends Power
{
    public MassAnimation () {
        super();
        this.setLvl(5);
        this.setName("Mass Animation");
        this.setType("5th-level universal power");
        this.setDescription("You snag several objects using the Force and whip them into the air around you, controlling them to attack at your command. Choose up to ten unenhanced objects within range that are not being worn or carried. Medium targets count as two objects, Large targets count as four objects, Huge targets count as eight objects. You can't control any object larger than Huge. Each object animates and hovers near you, remaining within 100 feet of you for the duration. An animated object behaves as though it is was a construct, with AC, hit points, and attacks determined by its size, and a ying speed of 30 feet. As a bonus action, you can mentally direct any object controlled by this power. If you control multiple objects, you can command any or all of them at the same time. You decide what action the object will take and where it will move. The objects act at the end of your turn. If you command an object to attack, it can make a single melee attack against a creature within 5 feet of it. It makes a slam attack with an attack bonus and kinetic damage determined by its size. Size HP AC Attack Tiny 20 16 +6 to hit, 1d4 + 3 damage Small 25 15 +6 to hit, 1d8 + 2 damage Medium 40 13 +5 to hit, 2d6 + 1 damage Large 50 10 +6 to hit, 2d10 + 2 damage Huge 80 10 +8 to hit, 2d12 + 4 damage\n" +
                "F o r c e P o t e n c y . If you cast this power using a force slot of 6th level or higher, you can animate two additional objects for each slot level above 5th.");
        this.setPrerequiste("Animate Weapon");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
    
}