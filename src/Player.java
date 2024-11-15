public class Player {
    int age;
    int happiness;
    int health;
    int intelligence;
    boolean alive;
    int choiceNum;
    int deathNum;

    public Player (int age, int happiness, int health, int intelligence, boolean alive, int choiceNum, int deathNum)
    {
        this.age = age;
        this.happiness = happiness;
        this.health = health;
        this.intelligence = intelligence;
        this.alive = alive;
        this.choiceNum = choiceNum;
        this.deathNum = deathNum;
    }
    public Player()
    {
        age = 0;
        happiness = 50;
        health = 50;
        intelligence = 50;
        alive = true;
        choiceNum = 0;
        deathNum = 0;
    }



    public void ageUp()
    {
        age++;
    }
    public void setAge(int i)
    {
        age =i;
    }






    public boolean deathRoll(Choices a)
    {
        if (deathNum < 0)
        {
            return false;
        }
        return (a.randomNumGen(1, deathNum) == 1);
    }
    public int calculateDeathNum()
    {
        if (age > 100)
        {
            deathNum = (int) (1 - 30 * Math.pow(0.975, 150 - age));
        }
        else {
            deathNum = (int) (100 * Math.pow(1.08, 48 - age));
        }
        if (happiness > 50)
        {
            deathNum += (int) (20 * Math.pow(1.09, happiness - 50));

        }
        else {
            deathNum += (int) (100 - 100 * (Math.pow(1.05, 50 - happiness)));
        }
        if (health > 50)
        {
            deathNum += (int) (20 * Math.pow(1.09, health - 50));
            return deathNum;

        }
        else {
            deathNum += (int) (100 - 100 * (Math.pow(1.05, 50 - health)));
        }
        if (intelligence > 50)
        {
            deathNum += (int) (20 * Math.pow(1.09, intelligence - 50));
        }
        else {
            deathNum += (int) (100 - 100 * (Math.pow(1.04, 50 - intelligence)));
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
    public boolean getLifeStatus()
    {
        return alive;
    }
    public void setHappiness(int i)
    {
        happiness = i;
    }





    public String printPlayerStats()
    {
        String a = "-----------------------\n";
        String b = "You are " + getAge() + " years old.\n";
        String c = "Happiness: " + getHappiness();
        String d = "\nVitality: " + getHealth();
        String e = "\nIntelligence: " + getIntelligence();
        String f = "\ndeath num is: " + calculateDeathNum();
        String g = "\n-----------------------";
        return a + b + c + d + e + f + g;
    }

}