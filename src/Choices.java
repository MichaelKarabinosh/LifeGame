import java.util.Scanner;

public class Choices {
    int happinessChange = 0;
    int healthChange = 0;
    int intelligenceChange = 0;
    int randomNum = 0;
    Player test = new Player();

    public void FirstChoice (int i)
    {
        Scanner s = new Scanner(System.in);
        String x = "";
        if (i == 1)
        {
            randomNum = (int)(Math.random() * 3) + 1;
            System.out.print("You find a random door in your house. Open it?(y/n)");
            String input = s.nextLine();
            if (input.equals("y"))
            {
            if (randomNum == 1)
            {
                System.out.println("You get a blessing from the gods!");
                test.addHappiness(10);
                test.addVitality(20);
                test.addIntelligence(0);
            }
            else if (randomNum == 2){
                System.out.println("You are cursed by the gods!");
                test.addHappiness(-10);
                test.addVitality(-20);
                test.addIntelligence(20);
            }
            else {
                System.out.println("You get a small blessing!");
                test.addHappiness(5);
                test.addVitality(5);
                test.addIntelligence(5);
            }
            }
        }
        if (i == 2)
        {

        }
        if (i == 3)
        {

        }
        if (i == 4)
        {

        }
        if (i == 5)
        {

        }
        if (i == 6)
        {

        }
        if (i == 7)
        {

        }
        if (i == 8)
        {

        }
        if (i == 9)
        {

        }
        if (i == 10)
        {

        }





    }

}
