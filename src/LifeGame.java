public class LifeGame {
    Choices a = new Choices();
    Events b = new Events();
    Player c = new Player();
    LifeGameRunner e = new LifeGameRunner();

    public LifeGame()
    {
        Choices a;
        Events b;
        Player c;

    }


    public String beginGame()
    {
return "fjkldsfjdf";
    }

    public void oneGameRound()
    {
        c.calculateDeathNum();
        if (!c.deathRoll(a))
        {
            System.out.println(c.printPlayerStats());
            int choiceNum = a.randomNumGen(1,3);
            System.out.println(a.FirstChoice(choiceNum,c));
            e.firstChoiceAnswer(choiceNum, a, c);
            System.out.println(b.Birthday(c));
            System.out.println(c.printPlayerStats());
        }

    }
}
