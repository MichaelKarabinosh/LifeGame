public class Events {
    private int happinessChange = 0;
    private int healthChange = 0;
    private int intelligenceChange = 0;
    private boolean lucky;
    private boolean statChange = true;


    public String processChoice(int i, String input, Player p) {
        statChange = true;
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
                    return "You find an old toy. It gives you nostalgia.";
                } else {
                    addStats(p);
                    return "A rat jumps out and hits you in the chest!";
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
                    return "It was heads. Your mom thanks you.";
                } else {
                    addStats(p);
                    return "It was tails. Your mom walks away in anger.";

                }
            } else {
                if (lucky) {
                    addStats(p);
                    return "It was tails. Your mom walks away in anger.";

                } else {
                    addStats(p);
                    return "It was heads. Your mom thanks you.";

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
        if (i == 4)
        {
            if (input.equals("i")) {
                if (lucky) {
                    addStats(p);
                    return "You find a puppy. It is very happy to see you.";

                } else {
                    addStats(p);
                    return "You find a raccoon. It runs away, leaving a mess.";
                }
            }
            else {
                    statChange = false;
            }
        }
        if (i == 5)
        {
          if (input.equals("b"))
          {
              if (lucky)
              {
                  addStats(p);
                  return "Your friends thank you for choosing bowling. It was a lot of fun.";
              }
              else {
                  addStats(p);
                  return "Your friends are upset. Bowling wasn't very fun.";
              }
          }
          else {
              if (lucky)
              {
                  addStats(p);
                  return "Your friends thank you for choosing mini golf. They had a lot of fun.";
              }
              else {
                  addStats(p);
                  return "Your friends ditch you at mini golf. They said it was too boring.";
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
        int i = randomNumGen(1,100);
        if (i <= 90)
        {
            return randomNumGen(1,3);
        }
        else if (i <= 94)
        {
            return randomNumGen(4,6);
        }
         else if (i <= 97) {
            return randomNumGen(7, 9);
        }
         else if (i <= 99)
        {
            return  randomNumGen(10, 12);
        }
         else {
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
        if (randomNumGen(1,20) == 1)
        {
            p.addIntelligence(-5);
            p.addHappiness(20);
            return "Your friends surprise you with a birthday party! (+20 Happiness, -5 Intelligence)\n";
        }
        return "";
    }

    public String ageBasedEvents (Player p, Events c)
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
                    return "You eat the suspicious looking school lunch. It makes you feel energized.";
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
            if (rand == 1)
            {
                if (lucky)
                {
                    return "";
                }
            }

        }
        return "";
    }




}
