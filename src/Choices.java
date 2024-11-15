import java.util.Scanner;

public class Choices {
    int randomNum = 0;
    int happinessChange = 0;
    int healthChange = 0;
    int intelligenceChange = 0;
    boolean lucky;
    boolean statChange = true;


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

                }
                else
                {
                    System.out.print("You are cursed by the gods!");

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

                }
                else
                {
                    System.out.print("It was tails. The genie teleports away in anger.");

                }
            } else {
                if (lucky) {
                    System.out.print("It was tails. The genie teleports away in anger.");

                } else
                {
                    System.out.print("It was heads. The genie thanks you.");

                }
            }
        }
        if (i == 3)
        {
            System.out.print("You find a spider in your room. Do you leave it be (l) or try to kill it (k)? ");
            String input = s.nextLine();
            if (input.equals("k")) {
                if (lucky) {
                    System.out.print("You hit the spider precisely and kill it.");

                } else {
                    System.out.print("You smash the spider really hard with your hand and get a massive bruise.");


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
    public String processChoice(int i, String input, Player p) {
        randomNum = randomNumGen(1, 2);
        if (randomNum == 1) {
            happinessChange = randomStatGenerator();
            healthChange = randomStatGenerator();
            intelligenceChange = randomStatGenerator();
            lucky = true;
        } else {
            happinessChange = -randomStatGenerator();
            healthChange = -randomStatGenerator();
            intelligenceChange = -randomStatGenerator();
        }
        if (i == 1) {
            if (input.equals("y")) {
                if (lucky) {
                    addStats(p);
                    return "You get a blessing from the gods!";
                } else {
                    addStats(p);
                    return "You are cursed by the gods!";
                }
            }
        }
        if (i == 2) {
            if (input.equals("h")) {
                if (lucky) {
                    addStats(p);
                    return "It was heads. The genie thanks you.";
                } else {
                    addStats(p);
                    return "It was tails. The genie teleports away in anger.";

                }
            } else {
                if (lucky) {
                    addStats(p);
                    return "It was tails. The genie teleports away in anger.";

                } else {
                    addStats(p);
                    return "It was heads. The genie thanks you.";

                }
            }
        }
        if (i == 3) {
            if (input.equals("k")) {
                if (lucky) {
                    addStats(p);
                    return "You hit the spider precisely and kill it.";

                } else {
                    addStats(p);
                    return "You smash the spider really hard with your hand and get a massive bruise.";
                }
            }
            else {
                if (lucky)
                {
                    statChange = false;
                    return "It runs away, leaving you unharmed...";
                }
                else {
                    addStats(p);
                    return "It pounces on you, leaving you hurt.";
                }
            }
        }

        return null;
    }
    public boolean getStatChange()
    {
        return statChange;
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
        if (lucky) {
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
