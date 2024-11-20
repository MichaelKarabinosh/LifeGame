public class Events {
    private int happinessChange = 0;
    private int healthChange = 0;
    private int intelligenceChange = 0;
    private boolean lucky;
    private boolean statChange = true;


    public String processChoice(int i, String input, Player p) {
        statChange = true;
        lucky = randomNumGen(1,10) <= 4;
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
    public String processAgeBasedChoice(int i, String input, Player p)
    {
        if (p.getAge() <= 10)
        {
            if (i == 1) {
                if (input.equals("j")) {
                    if (lucky) {
                        addStats(p);
                        return "You have a blast playing tag and make new friends! ";
                    } else {
                        addStats(p);
                        return "You trip while running and scrape your knee. ";
                    }
                } else if (input.equals("r")) {
                    if (lucky) {
                        addStats(p);
                        return "The book is fascinating, and you feel smarter after reading it. ";
                    } else {
                        addStats(p);
                        return "You get bored reading alone and feel left out. ";
                    }
                }
            }
            if (i == 2)
            {
                    if (input.equals("p")) {
                        if (lucky) {
                            addStats(p);
                            return "You find a rare coin! It’s exciting to show your friends. ";
                        } else {
                            addStats(p);
                            return "The shiny object is just a broken piece of glass. It cuts you. ";
                        }
                    } else if (input.equals("l")) {
                        if (lucky) {
                            addStats(p);
                            return "You avoid picking up the object and feel safe knowing you made the right call. ";
                        } else {
                            addStats(p);
                            return "Someone else picks it up and finds a cool treasure, leaving you feeling left out. ";
                        }
                    }
            }
            if (i == 3)
            {
                if (input.equals("v")) {
                    if (lucky) {
                        addStats(p);
                        return "You clean the chalkboard perfectly, and your teacher praises you! ";
                    } else {
                        addStats(p);
                        return "You smudge chalk all over your clothes, and your classmates laugh. ";
                    }
                } else if (input.equals("s")) {
                    if (lucky) {
                        addStats(p);
                        return "You stay quiet and avoid the messy chalkboard job. ";
                    } else {
                        addStats(p);
                        return "The teacher picks you anyway, and it’s super embarrassing. ";
                    }
                }
            }
            if (i == 4)
            {
                if (input.equals("a")) {
                    if (lucky) {
                        addStats(p);
                        return "They welcome you, and you quickly learn the game while having fun. ";
                    } else {
                        addStats(p);
                        return "They say the game is full, and you feel awkward. ";
                    }
                } else if (input.equals("w")) {
                    if (lucky) {
                        addStats(p);
                        return "You enjoy watching and learn the rules for next time. ";
                    } else {
                        addStats(p);
                        return "You feel left out and bored watching from afar. ";
                    }
                }
            }
            if (i == 5)
            {
                if (input.equals("n")) {
                    if (lucky) {
                        addStats(p);
                        return "The new snack is delicious, and you’re glad you tried it! ";
                    } else {
                        addStats(p);
                        return "The new snack tastes awful, and you feel queasy. ";
                    }
                } else if (input.equals("f")) {
                    if (lucky) {
                        addStats(p);
                        return "Your favorite snack is as tasty as always, making you happy. ";
                    } else {
                        addStats(p);
                        return "You get bored of the same snack and wish you’d tried something new. ";
                    }
                }
            }
        }
        if (p.getAge() <= 21) {
            if (i == 1) {
                if (input.equals("g")) {
                    if (lucky) {
                        addStats(p);
                        return "You have an amazing time at the party and make new friends! ";
                    } else {
                        addStats(p);
                        return "You feel awkward and end up leaving early. ";
                    }
                } else if (input.equals("h")) {
                    if (lucky) {
                        addStats(p);
                        return "You have a relaxing night at home and feel refreshed. ";
                    } else {
                        addStats(p);
                        return "You feel lonely staying home and regret not going out. ";
                    }
                }
            }
            if (i == 2) {
                if (input.equals("f")) {
                    if (lucky) {
                        addStats(p);
                        return "You successfully fix the phone and sell it for a good price. ";
                    } else {
                        addStats(p);
                        return "You can’t fix it, and it ends up being worth nothing. ";
                    }
                } else if (input.equals("s")) {
                    if (lucky) {
                        addStats(p);
                        return "You sell the phone for a decent amount of money. ";
                    } else {
                        addStats(p);
                        return "The phone is outdated, and you get very little for it. ";
                    }
                }
            }
            if (i == 3) {
                if (input.equals("t")) {
                    if (lucky) {
                        addStats(p);
                        return "The dog becomes your best friend and helps you feel happier. ";
                    } else {
                        addStats(p);
                        return "The dog is difficult to care for and causes a lot of trouble. ";
                    }
                } else if (input.equals("l")) {
                    if (lucky) {
                        addStats(p);
                        return "You walk away feeling proud of your decision to leave the dog behind. ";
                    } else {
                        addStats(p);
                        return "You feel guilty for leaving the dog behind. ";
                    }
                }
            }
            if (i == 4) {
                if (input.equals("a")) {
                    if (lucky) {
                        addStats(p);
                        return "You have a good time and enjoy the experience. ";
                    } else {
                        addStats(p);
                        return "You feel anxious and paranoid after trying it. ";
                    }
                } else if (input.equals("r")) {
                    if (lucky) {
                        addStats(p);
                        return "You feel proud for sticking to your principles. ";
                    } else {
                        addStats(p);
                        return "Your friend gets upset with you for refusing. ";
                    }
                }
            }
            if (i == 5) {
                if (input.equals("s")) {
                    if (lucky) {
                        addStats(p);
                        return "You study hard and ace your exam! ";
                    } else {
                        addStats(p);
                        return "You study but still don’t perform well on the exam. ";
                    }
                } else if (input.equals("o")) {
                    if (lucky) {
                        addStats(p);
                        return "You go out and have a great time with friends, but still manage to pass your exam. ";
                    } else {
                        addStats(p);
                        return "You fail the exam and feel guilty for not studying. ";
                    }
                }
            }
        }
        if (p.getAge() <= 40)
        {
            if (i == 1) {
                if (input.equals("a")) {
                    if (lucky) {
                        addStats(p);
                        return "You excel in your new job and get a promotion! ";
                    } else {
                        addStats(p);
                        return "The new job is not what you expected and you regret your decision. ";
                    }
                } else if (input.equals("s")) {
                    if (lucky) {
                        addStats(p);
                        return "You find satisfaction in sticking with your current job and get a raise. ";
                    } else {
                        addStats(p);
                        return "Your current job becomes more frustrating, and you start feeling stuck. ";
                    }
                }
            }
                if (i == 2) {
                    if (input.equals("c")) {
                        if (lucky) {
                            addStats(p);
                            return "You catch up with your friend and feel reconnected. ";
                        } else {
                            addStats(p);
                            return "Your friend has changed, and the conversation feels awkward. ";
                        }
                    } else if (input.equals("w")) {
                        if (lucky) {
                            addStats(p);
                            return "You avoid the awkward conversation and feel relieved. ";
                        } else {
                            addStats(p);
                            return "You feel guilty for not saying hello to your friend. ";
                        }
                    }
                }
                if (i == 3) {
                    if (input.equals("c")) {
                        if (lucky) {
                            addStats(p);
                            return "You save a lot of money and enjoy a cozy home. ";
                        } else {
                            addStats(p);
                            return "The apartment is small and uncomfortable. ";
                        }
                    } else if (input.equals("e")) {
                        if (lucky) {
                            addStats(p);
                            return "You love the luxury apartment and feel more relaxed. ";
                        } else {
                            addStats(p);
                            return "You regret the high rent and feel financially strained. ";
                        }
                    }
                }
                if (i == 4) {
                    if (input.equals("g")) {
                        if (lucky) {
                            addStats(p);
                            return "You have an unforgettable time and make lasting memories. ";
                        } else {
                            addStats(p);
                            return "The getaway doesn't live up to expectations, and you feel disappointed. ";
                        }
                    } else if (input.equals("h")) {
                        if (lucky) {
                            addStats(p);
                            return "You enjoy a peaceful weekend at home, catching up on rest. ";
                        } else {
                            addStats(p);
                            return "You get bored and feel like you missed out on a good experience. ";
                        }
                    }
                }
                if (i == 5) {
                    if (input.equals("t")) {
                        if (lucky) {
                            addStats(p);
                            return "You rekindle your relationship, and things work out better than before. ";
                        } else {
                            addStats(p);
                            return "The relationship ends again, and you both feel heartbroken. ";
                        }
                    } else if (input.equals("m")) {
                        if (lucky) {
                            addStats(p);
                            return "You move on and feel stronger for it. ";
                        } else {
                            addStats(p);
                            return "You struggle with moving on and feel regretful. ";
                        }
                    }
                }

        }
        else if (p.getAge() >= 41) {
            if (i == 1) {
                if (input.equals("a")) {
                    if (lucky) {
                        addStats(p);
                        return "You get the promotion and are excited for the future. ";
                    } else {
                        addStats(p);
                        return "The promotion is more stressful than you expected. ";
                    }
                } else if (input.equals("d")) {
                    if (lucky) {
                        addStats(p);
                        return "You find peace in your current position and are satisfied with your work-life balance. ";
                    } else {
                        addStats(p);
                        return "You start feeling stuck in your career and regret turning down the promotion. ";
                    }
                }
            }
            if (i == 2) {
                if (input.equals("v")) {
                    if (lucky) {
                        addStats(p);
                        return "You make a positive impact and feel fulfilled. ";
                    } else {
                        addStats(p);
                        return "The project is chaotic, and you end up feeling frustrated. ";
                    }
                } else if (input.equals("p")) {
                    if (lucky) {
                        addStats(p);
                        return "You enjoy some much-needed rest and feel rejuvenated. ";
                    } else {
                        addStats(p);
                        return "You feel guilty for passing on the opportunity to help others. ";
                    }
                }
            }
            if (i == 3) {
                if (input.equals("g")) {
                    if (lucky) {
                        addStats(p);
                        return "The trip is life-changing, and you come back with new perspectives. ";
                    } else {
                        addStats(p);
                        return "The travel experience doesn’t go as planned, and you regret going. ";
                    }
                } else if (input.equals("h")) {
                    if (lucky) {
                        addStats(p);
                        return "You enjoy a peaceful time at home and recharge. ";
                    } else {
                        addStats(p);
                        return "You feel bored and wish you had taken the opportunity to travel. ";
                    }
                }
            }
            if (i == 4) {
                if (input.equals("g")) {
                    if (lucky) {
                        addStats(p);
                        return "Your child appreciates the advice and grows stronger. ";
                    } else {
                        addStats(p);
                        return "Your advice doesn’t have the desired effect, and your child struggles. ";
                    }
                } else if (input.equals("f")) {
                    if (lucky) {
                        addStats(p);
                        return "Your child learns valuable lessons through their own experiences. ";
                    } else {
                        addStats(p);
                        return "Your child makes a poor decision and faces consequences. ";
                    }
                }
            }
            if (i == 5) {
                if (input.equals("r")) {
                    if (lucky) {
                        addStats(p);
                        return "You retire early and enjoy a fulfilling life with hobbies and travel. ";
                    } else {
                        addStats(p);
                        return "Retirement is more challenging than you thought, and you struggle to find purpose. ";
                    }
                } else if (input.equals("w")) {
                    if (lucky) {
                        addStats(p);
                        return "You find new excitement in your career and achieve even greater success. ";
                    } else {
                        addStats(p);
                        return "You begin to feel burnt out and wish you had retired earlier. ";
                    }
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
        lucky = randomNumGen(1,10) <= 4;
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
        if (p.getAge() <= 1000)
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
                    return "You get a C on your math test. Your mom is very upset.";
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
                    return "While playing catch, your dad throws the ball a little too hard. You catch it regardless. He is very proud.";
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
