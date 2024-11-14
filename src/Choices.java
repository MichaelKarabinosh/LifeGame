import java.util.Scanner;

public class Choices {
    int randomNum = 0;
    int happinessChange = 0;
    int healthChange = 0;
    int intelligenceChange = 0;
    boolean lucky;


    public void FirstChoice (int i, Player test)
    {
        randomNum = randomNumGen(1,2);
        if (randomNum == 1)
        {
            happinessChange = randomStatGenerator();
            healthChange = randomStatGenerator();
            intelligenceChange = randomStatGenerator();
            lucky = true;
        }
        else
        {
            happinessChange = -randomStatGenerator();
            healthChange = -randomStatGenerator();
            intelligenceChange = -randomStatGenerator();
        }
        Scanner s = new Scanner(System.in);
        if (i == 1)
        {
            System.out.print("You find a random door in your house. Open it? (y/n) ");
            String input = s.nextLine();
            if (input.equals("y"))
            {
                if (lucky)
                {
                    System.out.print("You get a blessing from the gods!");
                    changeStats(test);
                }
                else
                {
                    System.out.print("You are cursed by the gods!");
                    changeStats(test);
                }
            }
        }
        if (i == 2)
        {
            System.out.print("A magical genie asks you to predict a coin toss. Heads or tails? (h/t) ");
            String input = s.nextLine();
            if (input.equals("h"))
            {
                if (lucky)
                {
                    System.out.print("It was heads. The genie thanks you.");
                    changeStats(test);
                }
                else
                {
                    System.out.print("It was tails. The genie teleports away in anger.");
                    changeStats(test);
                }
            } else {
                if (lucky) {
                    System.out.print("It was tails. The genie teleports away in anger.");
                    changeStats(test);
                } else
                {
                    System.out.print("It was heads. The genie thanks you.");
                    changeStats(test);
                }
            }
        }
        if (i == 3)
        {
            randomNum = (int) (Math.random() * 2) + 1;
            System.out.print("You find a spider in your room. Do you leave it be (l) or try to kill it (k)? ");
            String input = s.nextLine();
            if (input.equals("k")) {
                if (lucky) {
                    System.out.print("You smash the spider really hard with your hand and get a massive bruise.");
                    changeStats(test);
                } else {
                    System.out.print("You hit the spider precisely and kill it.");
                    changeStats(test);

                }
            }
        }

        if (i == 4) {

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
        public void printLuck()
        {
            if (lucky) {
                System.out.println(" (+" + happinessChange + " Happiness, +" + healthChange + " Health, +" + intelligenceChange + " Intelligence)");
            }
            else
            {
                System.out.println(" (" + happinessChange + " Happiness, " + healthChange + " Health, " + intelligenceChange + " Intelligence)");
            }
        }

        public void addStats(Player test)
        {
            test.addHappiness(happinessChange);
            test.addHealth(healthChange);
            test.addIntelligence(intelligenceChange);
        }
        public void changeStats(Player test)
        {
            printLuck();
            addStats(test);
        }



    }

