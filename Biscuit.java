/**
 * Biscuit is completely busted. You will not win. This is their only hope of 
 * defeating the Balrog. Biscuit always has the same powerful stats, but has
 * a chance of sleeping through his attack.
 *
 * @author Edmund Dougherty
 * @version 11/17/25
 */
public class Biscuit extends Creature
{
    private static final int MAX_BISCUIT_HP = 300;
    private static final int MAX_BISCUIT_STR = 150;
    /**
     * Constructor for objects of class Biscuit
     */
    public Biscuit()
    {
        super(MAX_BISCUIT_STR, MAX_BISCUIT_HP);
    }
    
    /**
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack()
    {
        if (Randomizer.nextInt(50) > 39)
        {
            System.out.println("Biscuit is snoozing.");
            return 0;
        };
        return super.attack() + super.attack();
    }
    
    // takeDamage(int) not overriden, Biscuit is an honorable warrior and takes all damage assigned
}
