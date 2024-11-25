import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * The LifeGame class simulates a life simulation game where the player
 * makes choices and experiences events as they age.
 */
public class LifeGame {
    Events e = new Events();
    Player p = new Player();
    Scanner scanner = new Scanner(System.in);
    int choicesMade = 0;

    /**
     * Starts the first year of the game. Prompts the player to press enter to begin.
     */
    public void firstYear()
    {
        System.out.print("Press enter to start a new life.");
        if (scanner.nextLine().isEmpty())
        {
            oneGameRound();
        }
    }

    /**
     * Simulates the full game loop where the player ages up and plays until death.
     */
    public void fullGame()
    {
        while (p.alive) {
            System.out.print("Press enter to age up.");
            if (scanner.nextLine().isEmpty())
            {
                p.ageUp();
                oneGameRound();
            }
        }
        System.out.println("You died. You lived to be " + p.getAge() + " years old.");
        System.out.println("Throughout your life you made " + choicesMade + " total choices.");
    }

    /**
     * Simulates a single game round, which includes death checks, stat updates,
     * events, and player choices.
     */
    public void oneGameRound()
    {
        p.calculateDeathNum();
        if (!p.deathRoll(e))
        {
            Scanner s = new Scanner(System.in);
            String input;
            p.hardCap();
            System.out.println(p.printPlayerStats());
            int choiceNum = e.randomNumGen(1,5);
            System.out.print(e.seasonalEvents(p));
            e.setStatChange(false);
            if (e.getYearsLeftSick() > 0)
            {
                e.Sickness(p);
                System.out.println("You are still sick... (-2 Health)");
                p.addHealth(-2);
            }
            if (e.randomNumGen(1,3) == 1){
            System.out.print(e.regularEvents(p, e));
        }
            if (e.getStatChange()){
                System.out.println(e.printLuck());
            }
            if (e.randomNumGen(1,5) == 1) {
                System.out.print(getBasicChoiceInformation(choiceNum));
                input = s.nextLine();
                System.out.print(e.processChoice(choiceNum, input, p));
                if (e.getStatChange()) {
                    System.out.println(e.printLuck());
                } else {
                    System.out.println();
                }
                choicesMade++;
            }
            choiceNum = e.randomNumGen(1,5);
            if (e.randomNumGen(1,2) == 1) {
                System.out.print(getAgeBasedChoiceInformation(choiceNum));
                input = s.nextLine();
                System.out.print(e.processAgeBasedChoice(choiceNum, input, p));
                choicesMade++;
                if (e.getStatChange()) {
                    System.out.println(e.printLuck());
                }
                else {
                    System.out.println();
                }
            }
            if (e.randomNumGen(1, 5) == 1)
            {
                System.out.print(getMathBasedChoiceInfo(p,e));
                try
                {
                    e.setUserMathAns(Double.parseDouble(s.nextLine()));
                }
                catch (NumberFormatException p)
                {
                    e.setUserMathAns(0);
                }
                System.out.print(e.processMathBasedChoice(p));
                System.out.println(e.printLuck());
                choicesMade++;
            }
        }
        else {
            p.alive = false;
        }
    }

    /**
     * Provides the basic choice information for a player to make a decision.
     *
     * @param i the choice number corresponding to an event
     * @return a String describing the event and available options
     */
    public String getBasicChoiceInformation(int i)
    {
        if (i == 1)
        {
            return "You find a mystery box in the attie. Open it? (y/n) ";
        }
        if (i == 2)
        {
            return "Your mom asks you to predict a coin toss. Heads or tails? (h/t) ";
        }
        if (i == 3)
        {
            return "You find a spider in your room. Do you leave it be (l) or try to kill it (k)? ";
        }
        if (i == 4)
        {
            return "You hear rustling in the garbage can. Investigate it (i) or leave it be (l)? ";
        }
        if (i == 5) {
            return "Your friends ask you to choose between bowling (b) and mini golf (m). Which do you choose? ";
        }
        return null;
    }

    /**
     * Provides age-based choice information for a player to make a decision.
     *
     * @param i the choice number corresponding to an event
     * @return a String describing the event and available options
     */
    public String getAgeBasedChoiceInformation(int i) {
        if (p.getAge() <= 10) {
        if (i == 1) {
            return "Your friend invites you to play tag during recess. Do you join them (j) or stay by yourself and read (r)? ";
        }
        if (i == 2) {
            return "You notice a shiny object on the ground. Pick it up (p) or leave it alone (l)? ";
        }
        if (i == 3) {
            return "Your teacher asks for a volunteer to clean the chalkboard. Do you raise your hand (v) or stay quiet (s)? ";
        }
        if (i == 4) {
            return "You see some kids playing a new board game. Ask to join (a) or watch from a distance (w)? ";
        }
        if (i == 5) {
            return "During snack time, you can either try a new snack (n) or stick with your favorite (f). What do you do? ";
        }
    }
        if (p.getAge() <= 21)
        {
            if (i == 1) {
                return "You’re invited to a party. Do you go (g) or stay home (h)? ";
            }
            if (i == 2) {
                return "You find an old phone. Do you try to fix it (f) or sell it (s)? ";
            }
            if (i == 3) {
                return "You see a stray dog. Do you take it home (t) or leave it (l)? ";
            }
            if (i == 4) {
                return "Your friend offers you a joint. Do you accept (a) or refuse (r)? ";
            }
            if (i == 5) {
                return "You have a big exam tomorrow. Do you study (s) or go out with friends (o)? ";
            }
        }
        if (p.getAge() <= 40)
        {
            if (i == 1) {
                return "You’re offered a new job. Do you accept (a) or stay at your current job (s)? ";
            }
            if (i == 2) {
                return "You see an old friend at the grocery store. Do you chat (e) or walk by (w)? ";
            }
            if (i == 3) {
                return "You’re deciding between two apartments. Do you choose the cheaper one (e) or the more expensive one (e)? ";
            }
            if (i == 4) {
                return "You’re invited to a weekend getaway. Do you go (g) or stay home (h)? ";
            }
            if (i == 5) {
                return "You’re offered a second chance at a failed relationship. Do you give it another try (t) or move on (m)? ";
            }
        }
        if (p.getAge() >= 41)
        {
            if (i == 1) {
                return "You are offered a promotion at work. Do you accept (a) or decline (d)? ";
            }
            if (i == 2) {
                return "You’re asked to volunteer for a community project. Do you volunteer (v) or pass (p)? ";
            }
            if (i == 3) {
                return "You’re offered a chance to travel abroad. Do you go (g) or stay home (h)? ";
            }
            if (i == 4) {
                return "Your child asks for advice. Do you give them guidance (g) or let them figure it out (f)? ";
            }
            if (i == 5) {
                return "You have an opportunity to retire early. Do you retire (r) or keep working (w)? ";
            }
        }
        return "";
    }

    /**
     * Generates the format string for rounding numbers based on decimal places.
     *
     * @param r the number of decimal places
     * @return a String format for DecimalFormat
     */
    public static String getRoundString(int r) {
        String f = "#.";
        for (int i = 0; i < r; i++) {
            f += "#";
        }
        return f;
    }

    /**
     * Determines the number of decimal places based on the player's age.
     *
     * @param age the age of the player
     * @return the number of decimal places
     */
    public int numDecimalPlaces(int age)
    {
        if (age <= 11)
        {
            return 1;
        }
        if (age <= 21)
        {
            return 2;
        }
        else {
            return 3;
        }
    }

    /**
     * Provides information about a math-based choice for the player.
     *
     * @param p the player involved in the event
     * @param e the Events instance managing the event
     * @return a String describing the math question for the player
     */
    public String getMathBasedChoiceInfo(Player p, Events e)
    {
        double x = (Math.random() * 20) + 1;
        double y = (Math.random() * 20) + 1;
        int decPlaces = numDecimalPlaces(p.getAge());
        DecimalFormat df = new DecimalFormat(getRoundString(decPlaces));
        int randInt = e.randomNumGen(1,2);
        if (p.getAge() <= 10)
        {
            if (randInt == 1){
                x = Double.parseDouble(df.format(x));
                y = Double.parseDouble(df.format(y));
                e.setActMathAns(Double.parseDouble(df.format(x +y)));
                return "Your teacher asks you a math question: What is " + x + " + " + y + "? ";
            }
            if (randInt == 2) {
                x = Double.parseDouble(df.format(x));
                y = Double.parseDouble(df.format(y));
                e.setActMathAns(Double.parseDouble(df.format(x -y)));
                return "Your teacher asks you a math question: What is " + x + " - " + y + "? ";
            }
        }
        if (p.getAge() <= 21)
        {
            if (randInt == 1){
                x = Double.parseDouble(df.format((Math.random() * 500) + 100));
                y = Double.parseDouble(df.format((Math.random() * 500) + 100));
                e.setActMathAns(Double.parseDouble(df.format(x * y)));
                return "Your teacher asks you a math question: What is " + x + " * " + y + "? ";
            }
            if (randInt == 2) {
                x = Double.parseDouble(df.format((Math.random() * 500) + 100));
                y = Double.parseDouble(df.format((Math.random() * 20) + 10));
                e.setActMathAns(Double.parseDouble(df.format(x / y)));
                return "Your teacher asks you a math question: What is " + x + " / " + y + "? ";
            }
        }
        if (p.getAge() <= 40)
        {
            x = Double.parseDouble(df.format((Math.random() * 200000) + 5000));
            y = Double.parseDouble(df.format((Math.random() * 200000) + 5000));
            e.setActMathAns(Double.parseDouble(df.format(Math.sqrt(x) + Math.sqrt(y))));
            return "Your boss asks you a math question: What is the sum of the square root of " + x + " and the square root of " + y + "? ";
        }
        else if (p.getAge() >= 41)
        {
            double a = (Math.random() * 40) + 1;
            double b = (Math.random() * 500) + 100;
            double c = (Math.random() * 15) + 1;
            a = Double.parseDouble(df.format(a));
            b = Double.parseDouble(df.format(b));
            c = Double.parseDouble(df.format(c));

            double sqrt = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
            e.setActMathAns(Double.parseDouble(df.format((-b + sqrt) / (2 * a))));
            e.setActMathAnsQuadratic(Double.parseDouble(df.format((-b - sqrt) / (2 * a))));
            return "Your child asks you a math question: What is one possible root of " + a + "x^2 + " + b + "x + " + c + "? ";

        }
        return "";
    }
}