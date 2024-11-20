import java.awt.*;

public class LifeGameRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to Life Game®");
        System.out.println("In this game, you will progress through life starting as a baby, being forced to make decisions. Your objective is to prolong your life as long as possible. Have fun!");
        System.out.println("If you encounter any weird looking text during the program just press enter and it should fix itself.");
        LifeGame d = new LifeGame();
        d.firstYear();
        d.fullGame();
    }
}