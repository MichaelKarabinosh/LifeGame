public class LifeGame {
    Choices a = new Choices();
    Events b = new Events();
    Player c = new Player();
    public String beginGame()
    {
return "fjkldsfjdf";
    }

    public void oneGameRound() {
        if (!c.deathRoll()) {
            c.printPlayerStats();
            int choiceNum = (int) (Math.random() * 10) + 1;
            b.Birthday(c);
            a.firstChoice(choiceNum, c);


        }

    }
}
