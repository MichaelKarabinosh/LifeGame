public class Events {
Choices t = new Choices();

    public String Birthday(Player test)
    {
        if (t.randomNumGen(1,10) == 1);
        {
            test.addIntelligence(-5);
            test.addHappiness(20);
            return "Your friends surprise you with a birthday party! (+20 Happiness, -5 Intelligence)";
        }
    }






}