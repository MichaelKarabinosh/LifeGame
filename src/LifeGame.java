import java.util.Scanner;

public class LifeGame {
    Choices c = new Choices();
    Events e = new Events();
    Player p = new Player();
    public String beginGame()
    {
        return "fjkldsfjdf";
    }

    public void oneGameRound()
    {
        p.calculateDeathNum();
        if (!p.deathRoll(c))
        {
            System.out.println(p.printPlayerStats());
            int choiceNum = c.randomNumGen(1,3);
            System.out.print(e.Birthday(p));
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
            System.out.println(p.printPlayerStats());
            System.out.println(e.events(p,c));
            System.out.println(c.printLuck());
        }

    }
    public String getChoiceInformation(int i)
    {
        if (i == 1)
        {
            return "You find a random door in your house. Open it? (y/n) ";
        }
        if (i == 2)
        {
            return "A magical genie asks you to predict a coin toss. Heads or tails? (h/t) ";
        }
        if (i == 3)
        {
            return "You find a spider in your room. Do you leave it be (l) or try to kill it (k)? ";

        }
        return null;
    }
}