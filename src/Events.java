public class Events {
Choices c = new Choices();

    public String Birthday(Player p)
    {
        if (c.randomNumGen(1,10) == 1)
        {
            p.addIntelligence(-5);
            p.addHappiness(20);
            return "Your friends surprise you with a birthday party! (+20 Happiness, -5 Intelligence)\n";
        }
        return "";
    }

    public String events (Player p, Choices c)
    {
        if (p.getAge() <= 10)
        {
          int rand = c.randomNumGen(1,1);
          if (rand == 1)
          {
              p.addHappiness(c.randomStatGenerator());
              return "Your mom forces you to go on a playdate. You enjoy it. ";
          }
        }
return "";
    }







}