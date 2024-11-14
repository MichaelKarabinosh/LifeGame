import java.awt.*;
import java.util.Scanner;

public class LifeGameRunner {




    public static void main(String[] args) {

        System.out.println("Welcome to Life Game®");
        LifeGame d = new LifeGame();
        d.oneGameRound();









    }

    boolean lucky;
    public LifeGameRunner()
    {
        lucky = false;
    }

public boolean getLucky()
{
    return lucky;
}

    public void firstChoiceAnswer(int choiceNum, Choices a, Player test) {
        a.randomNum = a.randomNumGen(1,2);
        if (a.randomNum == 1)
        {
            a.happinessChange = a.randomStatGenerator();
            a.healthChange = a.randomStatGenerator();
            a.intelligenceChange = a.randomStatGenerator();
            lucky = true;
        }
        else
        {
            a.happinessChange = -a.randomStatGenerator();
            a.healthChange = -a.randomStatGenerator();
            a.intelligenceChange = -a.randomStatGenerator();
        }
        Scanner s = new Scanner(System.in);
        if (choiceNum == 1)
        {
            System.out.print("");
            String input = s.nextLine();
            if (input.equals("y"))
            {
                if (lucky)
                {
                    System.out.print("You get a blessing from the gods!");
                    System.out.println(a.printLuck());
                    a.addStats(test);
                }
                else
                {
                    System.out.print("You are cursed by the gods!");
                    System.out.println(a.printLuck());
                    a.addStats(test);
                }

            }
        }
        if (choiceNum == 2) {

        }
        if (choiceNum == 3) {

        }
        if (choiceNum == 4) {

        }
        if (choiceNum == 5) {

        }
        if (choiceNum == 6) {

        }
        if (choiceNum == 7) {

        }
        if (choiceNum == 8) {

        }
        if (choiceNum == 9) {

        }
        if (choiceNum == 10) {

        }
    }

            }