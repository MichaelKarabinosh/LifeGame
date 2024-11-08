public class Player {
    int age = 0;
    int happiness = 50;
    int health = 50;
    int intelligence = 50;
    boolean alive = false;
    int hiddenNum = 0;
    int deathNum = 0;


    public Player (int age, int happiness, int health, int intelligence, boolean alive, int hiddenNum, int deathNum)
    {
      this.age = age;
      this.happiness = happiness;
      this.health = health;
      this.intelligence = intelligence;
      this.alive = alive;
      this.hiddenNum = hiddenNum;
      this.deathNum = deathNum;
    }


    public void ageUp()
    {
    age++;
    }

    public String oneGameRound()
    {
       deathNum =(int) (100 * Math.pow(1.08, 48 - age));
       int hiddenNum = (int)(Math.random() * 21);

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

}
