public class Events {


public void Birthday(Player test)
{
    if ((int) (Math.random() * 10) + 1 == 1)
    {
        System.out.println("Your friends surprise you with a birthday party! (+20 Happiness, -5 Intelligence)");
        test.addIntelligence(-5);
        test.addHappiness(20);
    }
}






}
