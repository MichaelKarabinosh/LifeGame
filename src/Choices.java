import java.util.Scanner;

public class Choices {
    int randomNum = 0;


    public void firstChoice (int i, Player test) {
        Scanner s = new Scanner(System.in);
        if (i == 1) {
            randomNum = (int) (Math.random() * 3) + 1;
            System.out.print("You find a random door in your house. Open it? (y/n) ");
            String input = s.nextLine();
            if (input.equals("y")) {
                if (randomNum == 1) {
                    System.out.println("You get a blessing from the gods! (+10 Happiness, +10 Vitality)");
                    test.addHappiness(10);
                    test.addVitality(20);
                } else if (randomNum == 2) {
                    System.out.println("You are cursed by the gods! (-10 Happiness, -10 Vitality, -10 Intelligence)");
                    test.addHappiness(-10);
                    test.addVitality(-20);
                    test.addIntelligence(-10);
                } else {
                    System.out.println("You find a lucky horseshoe! (+5 Happiness, +5 Vitality, +5 Intelligence)");
                    test.addHappiness(5);
                    test.addVitality(5);
                    test.addIntelligence(5);
                }
            }
        }
        if (i == 2) {
            randomNum = (int) (Math.random() * 2) + 1;
            System.out.print("A magical genie asks you to predict a coin toss. Heads or tails? (h/t) ");
            String input = s.nextLine();
            if (input.equals("h")) {
                if (randomNum == 1) {
                    System.out.println("It was heads. The genie thanks you. (+5 Happiness, +5 Intelligence, +5 Vitality)");
                    test.addHappiness(5);
                    test.addVitality(5);
                    test.addIntelligence(5);
                } else if (randomNum == 2) {
                    System.out.println("It was tails. The genie teleports away in anger. (-5 Happiness, -5 Intelligence, -5 Vitality)");
                    test.addHappiness(-5);
                    test.addVitality(-5);
                    test.addIntelligence(-5);
                }
            } else {
                if (randomNum == 1) {
                    System.out.println("It was tails. The genie teleports away in anger. (-5 Happiness, -5 Intelligence, -5 Vitality)");
                    test.addHappiness(-5);
                    test.addVitality(-5);
                    test.addIntelligence(-5);
                } else if (randomNum == 2) {
                    System.out.println("It was heads. The genie thanks you. (+5 Happiness, +5 Intelligence, +5 Vitality)");
                    test.addHappiness(5);
                    test.addVitality(5);
                    test.addIntelligence(5);
                }
            }
        }
        if (i == 3)
        {
            randomNum = (int) (Math.random() * 2) + 1;
            System.out.print("You find a spider in your room. Do you leave it be (l) or try to kill it (k)? ");
            String input = s.nextLine();
            if (input.equals("k"))
            {
                if (randomNum == 1)
                {
                    System.out.println("You smash the spider really hard with your hand and get a massive bruise. (-10 Vitality, -5 Happiness)");
                    test.addHappiness(-5);
                    test.addVitality(-10);
                }
                else
                {
                    System.out.println("You hit the spider precisely and kill it. (+5 Happiness)");
                    test.addHappiness(5);

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
    }
