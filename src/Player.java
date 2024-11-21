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

    public Player()
    {
        age = 0;
        happiness = e.randomNumGen(60,100);
        health = e.randomNumGen(60,100);
        intelligence = e.randomNumGen(60,100);
        alive = true;
        choiceNum = 0;
        deathNum = 0;
        sick = false;
    }



    public void ageUp()
    {
        age++;
    }
    public void setSick(boolean a)
    {
        sick = a;
    }
    public boolean getSick()
    {
        return sick;
    }



    public boolean deathRoll(Events a)
    {
        if (deathNum < 0)
        {
            return true;
        }
        return (a.randomNumGen(1, deathNum) == 1);
    }
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

    public void addHappiness(int i)
    {
        happiness += i;
    }
    public void addHealth(int i)
    {
        health += i;
    }
    public void addIntelligence(int i)
    {
        intelligence += i;
    }
    public int getAge()
    {
        return age;
    }
    public int getHappiness()
    {
        return happiness;
    }
    public int getHealth()
    {
        return health;
    }
    public int getIntelligence()
    {
        return intelligence;
    }


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