
/**
 * Write a description of class Balrog here.
 *
 * @author Edmund Dougherty
 * @version 11/16/25
 */
public class Balrog extends Cyberdemon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;
    /**
    * Constructor for objects of class Balrog
    */
    public Balrog()
    {
        this.str = Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR;
        this.hp = Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP;
    }
    
    public int attack()
    {
        return super.attack() + super.attack();
    }
    
    // takeDamage(int) - not overridden, because Balrogs take all damage assigned to them
}
