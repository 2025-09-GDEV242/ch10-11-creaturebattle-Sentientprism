
/**
 * Krogans are creatures with innate damage resistance and low variability in 
 * their stats.
 *
 * @author Edmund Dougherty
 * @version 11/16/25
 */
public class Krogan extends Creature
{
    private static final int MAX_KROGAN_HP = 65;
    private static final int MIN_KROGAN_HP = 60;
    private static final int MAX_KROGAN_STR = 50;
    private static final int MIN_KROGAN_STR = 45;
    /**
     * Constructor for objects of class Krogan
     */
    public Krogan()
    {
        super(
            Randomizer.nextInt(MAX_KROGAN_STR-MIN_KROGAN_STR)+MIN_KROGAN_STR,
            Randomizer.nextInt(MAX_KROGAN_HP-MIN_KROGAN_HP)+MIN_KROGAN_HP        
        );
    }
    
    /**
     * From Creature: Krogan take 5 less damage from all attacks.
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int damage) {
        damage -= 5;
        hp = hp - damage;
    }
    
    // attack not overriden, Krogan deal normal damage
}
