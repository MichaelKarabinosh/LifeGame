import java.util.Scanner;

public class LifeGame {
    Events c = new Events();
    Player p = new Player();
    Scanner scanner = new Scanner(System.in);
    public void firstYear()
    {
        System.out.print("Press enter to start a new life.");
        if (scanner.nextLine().isEmpty())
        {
            oneGameRound();
        }
    }

    public void fullGame()
    {
        for (int i = p.getAge(); p.alive; i++)
        {
            System.out.print("Press enter to age up.");
            if (scanner.nextLine().isEmpty())
            {
                p.ageUp();
                oneGameRound();
            }
        }
        System.out.println("You died. You lived to be " + p.getAge() + "years old.");
    }


    public void oneGameRound()
    {
        p.calculateDeathNum();
        if (!p.deathRoll(c))
        {
            p.hardCap();
            System.out.println(p.printPlayerStats());
            int choiceNum = c.randomNumGen(1,5);
            System.out.print(c.Birthday(p));
            System.out.print(c.ageBasedEvents(p,c));
            System.out.println(c.printLuck());
            System.out.print(getChoiceInformation(choiceNum));
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            System.out.print(c.processChoice(choiceNum,input,p));
            if (c.getStatChange())
            {
                System.out.println(c.printLuck());
            }
            else {
                System.out.println();
            }
        }
        else {
            p.alive = false;
        }

    }
    public String getChoiceInformation(int i)
    {
        if (i == 1)
        {
            return "You find a mystery box in the attic. Open it? (y/n) ";
        }
        if (i == 2)
        {
            return "Your mom asks you to predict a coin toss. Heads or tails? (h/t) ";
        }
        if (i == 3)
        {
            return "You find a spider in your room. Do you leave it be (l) or try to kill it (k)? ";
        }
        if (i == 4)
        {
            return "You hear rustling in the garbage can. Investigate it (i) or leave it be (l)? ";
        }
        if (i == 5)
        {
            return "Your friends ask you to choose between bowling (b) and mini golf (m). Which do you choose? ";
        }
        return null;
    }
}