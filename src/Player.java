/**
 * The Player class represents a player in the life simulation game.
 * It tracks attributes such as age, happiness, health, intelligence, and life status.
 * The class also provides methods to update and manage the player's stats and life events.
 */
public class Player {
    int age;
    int happiness;
    int health;
    int intelligence;
    boolean alive;
    int choiceNum;
    int deathNum;
    Events e = new Events();
    boolean sick;

    /**
     * Default Constructor for the Player class.
     * This creates a new instance of a Player with randomly initialized stats for happiness, health,
     * and intelligence. The player starts at age 0, is alive, and is not sick.
     */
    public Player()
    {
        age = 0;
        happiness = e.randomNumGen(70,100);
        health = e.randomNumGen(70,100);
        intelligence = e.randomNumGen(70,100);
        alive = true;
        choiceNum = 0;
        deathNum = 0;
        sick = false;
    }

    /**
     * Increases the player's age by one year.
     */
    public void ageUp()
    {
        age++;
    }

    /**
     * Sets the player's sickness status.
     *
     * @param a true if the player is sick; otherwise false
     */
    public void setSick(boolean a)
    {
        sick = a;
    }

    /**
     * Returns whether the player is currently sick.
     *
     * @return true if the player is sick; otherwise false
     */
    public boolean getSick()
    {
        return sick;
    }

    /**
     * Determines if the player dies based on their death number.
     *
     * @param a an Events object used to generate random numbers
     * @return true if the player dies; otherwise false
     */
    public boolean deathRoll(Events a)
    {
        if (deathNum < 0)
        {
            return true;
        }
        return (a.randomNumGen(1, deathNum) == 1);
    }

    /**
     * Calculates the player's death number based on their age, happiness,
     * health, and intelligence. A lower death number increases the chance of death.
     *
     * @return the calculated death number
     */
    public int calculateDeathNum()
    {
        if (age > 30)
        {
            deathNum = (int) (1 - 10 * Math.pow(0.88, 30 - age));
        }
        else {
            deathNum = (int) (100 * Math.pow(1.08, 30 - age));
        }
        if (happiness > 50)
        {
            deathNum += (int) (100 * Math.pow(1.05, happiness - 50));
        }
        else {
            deathNum += (int) (100 - 100 * (Math.pow(1.05, 50 - happiness)));
        }
        if (health > 50)
        {
            deathNum += (int) (100 * (Math.pow(1.05, health - 50)));
        }
        else {
            deathNum += (int) (100 - 100 * (Math.pow(1.05, 50 - health)));
        }
        if (intelligence > 50)
        {
            deathNum += (int) (100 * Math.pow(1.05, intelligence - 50));
        }
        else {
            deathNum += (int) (100 - 100 * (Math.pow(1.05, 50 - intelligence)));
        }
        return deathNum;
    }

    /**
     * Increases the player's happiness by the specified amount.
     *
     * @param i the amount to add to happiness
     */
    public void addHappiness(int i)
    {
        happiness += i;
    }

    /**
     * Increases the player's health by the specified amount.
     *
     * @param i the amount to add to health
     */
    public void addHealth(int i)
    {
        health += i;
    }

    /**
     * Increases the player's intelligence by the specified amount.
     *
     * @param i the amount to add to intelligence
     */
    public void addIntelligence(int i)
    {
        intelligence += i;
    }

    /**
     * Returns the player's current age.
     *
     * @return the player's age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Returns the player's current happiness level.
     *
     * @return the player's happiness
     */
    public int getHappiness()
    {
        return happiness;
    }

    /**
     * Returns the player's current health level.
     *
     * @return the player's health
     */
    public int getHealth()
    {
        return health;
    }

    /**
     * Returns the player's current intelligence level.
     *
     * @return the player's intelligence
     */
    public int getIntelligence()
    {
        return intelligence;
    }

    /**
     * Prints the player's stats in a formatted string, including age, happiness,
     * health, intelligence, and the chance of death.
     *
     * @return a String representation of the player's stats
     */
    public String printPlayerStats()
    {
        String a = "-----------------------\n";
        String b = "You are " + getAge() + " years old.\n";
        String c = "Happiness: " + getHappiness();
        String d = "\nHealth: " + getHealth();
        String e = "\nIntelligence: " + getIntelligence();
        String f = "\nChance of death is: " +  String.format("%.3f", 100 * (1 / ((double)calculateDeathNum() / 20))) + "%";
        String g = "\n-----------------------";
        return a + b + c + d + e + f + g;
    }

    /**
     * Caps the player's three main stats: happiness, intelligence, and health at a maximum of 100.
     */
    public void hardCap()
    {
        if (happiness > 100)
        {
            happiness = 100;
        }
        if (intelligence > 100)
        {
            intelligence = 100;
        }
        if (health > 100)
        {
            health = 100;
        }
    }
}