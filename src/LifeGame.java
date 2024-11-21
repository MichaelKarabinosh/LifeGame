import java.util.Scanner;

public class LifeGame {
    Events c = new Events();
    Player p = new Player();
    Scanner scanner = new Scanner(System.in);
    int choicesMade = 0;

    public void firstYear()
    {
        System.out.print("Press enter to start a new life.");
        if (scanner.nextLine().isEmpty())
        {
            oneGameRound();
        }
    }
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


    public void oneGameRound()
    {
        p.calculateDeathNum();
        if (!p.deathRoll(c))
        {
            Scanner s = new Scanner(System.in);
            String input;
            p.hardCap();
            System.out.println(p.printPlayerStats());
            int choiceNum = c.randomNumGen(1,5);
            System.out.print(c.seasonalEvents(p));
            c.setStatChange(false);
            if (c.getYearsLeftSick() > 0)
            {
                c.Sickness(p);
                System.out.println("You are still sick... (-2 Health)");
                p.addHealth(-2);
            }
            if (c.randomNumGen(1,3) == 1){
            System.out.print(c.regularEvents(p, c));
        }
            if (c.getStatChange()){
                System.out.println(c.printLuck());
            }
            if (c.randomNumGen(1,5) == 1) {
                System.out.print(getBasicChoiceInformation(choiceNum));
                input = s.nextLine();
                System.out.print(c.processChoice(choiceNum, input, p));
                if (c.getStatChange()) {
                    System.out.println(c.printLuck());
                } else {
                    System.out.println();
                }
                choicesMade++;
            }
            choiceNum = c.randomNumGen(1,5);
            if (c.randomNumGen(1,3) == 1) {
                System.out.print(getAgeBasedChoiceInformation(choiceNum));
                input = s.nextLine();
                System.out.print(c.processAgeBasedChoice(choiceNum, input, p));
                choicesMade++;
                System.out.println(c.printLuck());
            }
            if (c.randomNumGen(1, 3) == 1)
            {
                System.out.print(getMathBasedChoiceInfo(p,c));
                c.setUserMathAns(Integer.parseInt(s.nextLine()));
                System.out.print(c.processMathBasedChoice(p));
                System.out.println(c.printLuck());
                choicesMade++;
            }
        }
        else {
            p.alive = false;
        }

    }
    public String getBasicChoiceInformation(int i)
    {
        if (i == 1)
        {
            return "You find a mystery box in the attic. Open it? (y/n) ";
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
                return "You see an old friend at the grocery store. Do you chat (c) or walk by (w)? ";
            }
            if (i == 3) {
                return "You’re deciding between two apartments. Do you choose the cheaper one (c) or the more expensive one (e)? ";
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





    public String getMathBasedChoiceInfo(Player p, Events c)
    {
        int randInt = c.randomNumGen(1,2);
        int x = c.randomNumGen(1,10);
        int y = c.randomNumGen(1,9);
        if (p.getAge() <= 10)
        {
            if (randInt == 1){
                c.setActMathAns(x + y);
                return "Your teacher asks you a math question: What is " + x + " + " + y + "? ";
            }
            if (randInt == 2) {
                c.setActMathAns(x -y);
                return "Your teacher asks you a math question: What is " + x + " - " + y + "? ";
            }
        }
        if (p.getAge() <= 21)
        {
            if (randInt == 1){
                c.setActMathAns(x * y);
                return "Your teacher asks you a math question: What is " + x + " * " + y + "? ";
            }
            if (randInt == 2) {
                c.setActMathAns(x / y);
                return "Your teacher asks you a math question: What is " + x + " / " + y + "? (Rounded down)";
            }
        }
        if (p.getAge() <= 40)
        {
            c.setActMathAns((int) Math.pow(x,y));
            return "Your boss asks you a math question: What is " + x + " ^ " + y + "? ";
        }
        else if (p.getAge() >= 41)
        {
            c.setActMathAns((int)Math.sqrt(x) + (int)Math.sqrt(y));
            return "Your child asks you a math question: What is the sum of the square root of " + x + " and the square root of " + y + " rounded to the nearest integer? ";
        }
        return "";
    }
}