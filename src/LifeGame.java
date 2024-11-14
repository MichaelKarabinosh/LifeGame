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
            c.printPlayerStats();
            int choiceNum = a.randomNumGen(1,3);
            b.Birthday(c);
            a.FirstChoice(choiceNum,c);
            c.printPlayerStats();
        }

    }
}
