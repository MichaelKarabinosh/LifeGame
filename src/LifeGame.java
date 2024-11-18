import java.util.Scanner;

public class LifeGame {
    Events c = new Events();
    Player p = new Player();
    Scanner scanner = new Scanner(System.in);
    public void firstYear()
    {
        System.out.print("Enter \"+\" to start a new life. ");
        if (scanner.nextLine().equals("+"))
        {
            oneGameRound();
        }
    }

    public void fullGame()
    {
        for (int i = p.getAge(); p.alive; i++)
        {
            System.out.print("Enter \"+\" to age up. ");
            if (scanner.nextLine().equals("+")){
                p.ageUp();
                oneGameRound();
            }
        }
    }


    public void oneGameRound()
    {
        p.calculateDeathNum();
        if (!p.deathRoll(c))
        {
            System.out.println(p.printPlayerStats());
            int choiceNum = c.randomNumGen(1,3);
            System.out.print(c.Birthday(p));
            System.out.print(c.events(p,c));
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
            System.out.println(p.printPlayerStats());
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