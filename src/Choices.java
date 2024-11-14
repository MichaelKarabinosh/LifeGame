import java.util.Scanner;

public class Choices {
    int randomNum = 0;
    int happinessChange = 0;
    int healthChange = 0;
    int intelligenceChange = 0;
    LifeGameRunner e = new LifeGameRunner();


    public String FirstChoice (int i, Player test)
    {
        if (i == 1) {
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
        if (i == 4)
        {

        }
        if (i == 5) {

        }
        if (i == 6) {

        }
        if (i == 7) {

        }
        if (i == 8) {

        }
        if (i == 9) {

        }
        if (i == 10) {

        }
        return "";
    }


public int randomStatGenerator()
{
    int i = (int) ((Math.random() * 100) + 1);
    if (i <= 5)
    {
        return randomNumGen(10, 12);
    } else if (i <= 15) {
        return randomNumGen(4, 6);
    } else if (i <= 85) {
        return randomNumGen(1, 3);
    } else if (i <= 95) {
        return randomNumGen(7, 9);
    } else {
        return randomNumGen(13, 15);
    }
}

public int randomNumGen(int a, int b)
        {
            return (int) (Math.random() * ((b - a) + 1)) + a;
        }
        public String printLuck()
        {
            if (e.getLucky()) {
                return " (+" + happinessChange + " Happiness, +" + healthChange + " Health, +" + intelligenceChange + " Intelligence)";
            }
            else
            {
                return " (" + happinessChange + " Happiness, " + healthChange + " Health, " + intelligenceChange + " Intelligence)";
            }
        }

        public void addStats(Player test)
        {
            test.addHappiness(happinessChange);
            test.addHealth(healthChange);
            test.addIntelligence(intelligenceChange);
        }




    }

