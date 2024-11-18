public class Events {
    private int randomNum = 0;
    private int happinessChange = 0;
    private int healthChange = 0;
    private int intelligenceChange = 0;
    private boolean lucky;
    private boolean statChange = true;


    public String processChoice(int i, String input, Player p) {
        lucky = 1 == randomNumGen(1,2);
        if (lucky)
        {
            happinessChange = randomStatGenerator();
            healthChange = randomStatGenerator();
            intelligenceChange = randomStatGenerator();
        }
        else {
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
            else {
                statChange = false;
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

        return "";
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


    public String Birthday(Player p)
    {
        if (randomNumGen(1,10) == 1)
        {
            p.addIntelligence(-5);
            p.addHappiness(20);
            return "Your friends surprise you with a birthday party! (+20 Happiness, -5 Intelligence)\n";
        }
        return "";
    }

    public String events (Player p, Events c)
    {
        int rand = randomNumGen(1,5);
        lucky = 1 == randomNumGen(1,2);
        if (lucky)
        {
            happinessChange = randomStatGenerator();
            healthChange = randomStatGenerator();
            intelligenceChange = randomStatGenerator();
        }
        else {
            happinessChange = -randomStatGenerator();
            healthChange = -randomStatGenerator();
            intelligenceChange = -randomStatGenerator();
        }
        if (p.getAge() <= 10)
        {
            if (rand == 1)
            {
                if (lucky)
                {
                    addStats(p);
                    return "Your mom forces you to go on a playdate. You enjoy it. ";
                }
                else
                {
                    addStats(p);
                    return "Your mom forces you to go on a playdate. You hate it.";
                }
            }
            if (rand == 2)
            {
                if (lucky)
                {
                    addStats(p);
                    return "At daycare, your friend tells you he likes your shoes.";
                }
                else {
                    addStats(p);
                    return "At daycare, your friend tells you he hates your outfit.";
                }
            }
            if (rand == 3)
            {
                if (lucky)
                {
                    addStats(p);
                    return "You get a A+ on your math test. Your mom is very proud.";
                }
                else {
                    addStats(p);
                    return "You get a C on your math test. Your mom is very upset";
                }
            }
            if (rand == 4)
            {
                if (lucky) {
                    addStats(p);
                    return "You eat the suspicious looking school lunch. It makes you feel good";
                }
                else {
                    addStats(p);
                    return "You eat the suspicious looking school lunch. It makes your tummy rumble.";
                }
            }
            else {
                if (lucky)
                {
                    addStats(p);
                    return "While playing catch, your dad throws the ball a little too hard. You catch it regardless. He is very proud";
                }
                else {
                    addStats(p);
                    return "While playing catch, your dad throws the ball a little too hard. It hits you square in the face.";
                }
            }
        }
        if (p.getAge() <= 21)
        {

        }
        return "";
    }




}
