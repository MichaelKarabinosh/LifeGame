public class LifeGame {
    Choices a = new Choices();
    Events b = new Events();
    Player c = new Player();
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
            System.out.println(b.Birthday(c));
            a.FirstChoice(choiceNum,c);
            System.out.println(c.printPlayerStats());
        }

    }
}