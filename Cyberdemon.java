
/**
 * The Cyberdemon is a standard Demon. Max/min hp [100/25], Max/min str [40/20].
 *
 * @author Edmund Dougherty
 * @version 11/16/25
 */
public class Cyberdemon extends Demon
{
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;
    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        super(
        Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR,
        Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP        
        );
    }
    
    //attack() not overriden, does standard demonic attack.
}
