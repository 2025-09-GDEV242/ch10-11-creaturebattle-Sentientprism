/**
 * @Edmund Dougherty
 * @11/16/25
 */
public class Demon extends Creature
{
    /**
     * Constructor for objects of class Demon
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }

    public int attack()
    {
        int totalDamage; //give a place to hold value returned from creature
        
        totalDamage = super.attack(); //ask creature to compute the damage due to strength
        
        //roll the dice, if in range, double the damage value
        if (Randomizer.nextInt(100) > 95)
        {
            totalDamage = totalDamage + 50;
        };
        
        return totalDamage;
    }
    
    // takeDamage(int) - not overridden, because Demons take all damage assigned to them
}
