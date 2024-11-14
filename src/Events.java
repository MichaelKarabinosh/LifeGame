public class Events {


public String Birthday(Player test)
{
    if ((int) (Math.random() * 10) + 1 == 1)
    {
        test.addIntelligence(-5);
        test.addHappiness(20);
        return "Your friends surprise you with a birthday party! (+20 Happiness, -5 Intelligence)";
    }
    return "";
}






}
