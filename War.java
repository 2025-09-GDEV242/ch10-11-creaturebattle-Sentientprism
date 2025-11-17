import java.util.ArrayList;
/**
 * Write a description of class War here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class War
{
    ArrayList<Creature> goodArmy = new ArrayList<Creature>();
    ArrayList<Creature> evilArmy = new ArrayList<Creature>();
    public Creature goodWarrior;
    public Creature evilWarrior;

    /**
     * Constructor for objects of class War
     */
    public War()
    {
        initializeGoodArmy();
        initializeEvilArmy();
        goodWarrior = goodArmy.get(goodArmy.size() - 1);
        evilWarrior = evilArmy.get(evilArmy.size() - 1);
    }
    
    public void fight()
    {
        
    }
    
    private void initializeGoodArmy()
    {
        int randomNumber;
        while (goodArmy.size() < 100)
        {
            randomNumber = Randomizer.nextInt(100);
            if (randomNumber > 94)
            {
                goodArmy.add(new Biscuit());
                continue;
            }
            else if (randomNumber > 50)
            {
                goodArmy.add(new Elf());
                continue;
            }
            else if (randomNumber > 30)
            {
                goodArmy.add(new Krogan());
                continue;
            }
            else
            {
                goodArmy.add(new Human());
                continue;
            }
            
        }
    }
    
    private void initializeEvilArmy()
    {
        int randomNumber;
        while (evilArmy.size() < 100)
        {
            randomNumber = Randomizer.nextInt(100);
            if (randomNumber > 80)
            {
                evilArmy.add(new Balrog());
                continue;
            }
            else if (randomNumber > 50)
            {
                evilArmy.add(new Cyberdemon());
                continue;
            }
            else
            {
                evilArmy.add(new Krogan());
                continue;
            }
            
        }
    }
}
