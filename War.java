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
    
    public void autoFight()
    {
        while (goodArmy.size() > 0 && (evilArmy.size() > 0))
        {
            fight();
        }
    }
    
    public void fight()
    {
        int goodWarriorDamage;
        int evilWarriorDamage;
        
        goodWarriorDamage = goodWarrior.attack();
        evilWarriorDamage = evilWarrior.attack();
        
        evilWarrior.takeDamage(goodWarriorDamage);
        goodWarrior.takeDamage(evilWarriorDamage);
        
        if (goodWarrior.isKnockedOut())
        {
            goodArmy.remove(goodWarrior);
            if (goodArmy.size() < 1)
            {
                fightEnd();
                return;
            }
            goodWarrior = goodArmy.get(goodArmy.size() - 1);
            System.out.println("A good warrior has been felled!");
        }
        
        if (evilWarrior.isKnockedOut())
        {
            evilArmy.remove(evilWarrior);
            if (evilArmy.size() < 1)
            {
                fightEnd();
                return;
            }
            evilWarrior = evilArmy.get(evilArmy.size() - 1);
            System.out.println("An evil warrior has been felled!");
        }
        
        if (goodArmy.size() < 1 || evilArmy.size() < 1)
        {
            fightEnd();
        }
    }
    
    private void fightEnd()
    {   
        if (goodArmy.size() < 1)
        {
            System.out.println("The good army has been defeated in battle.");
            System.out.println("The world falls into darkness.");
        }
        
        if (evilArmy.size() < 1)
        {
            System.out.println("The evil army has been defeated in battle.");
            System.out.println("The world is saved!");
        }
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
        while (evilArmy.size() < 50)
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
