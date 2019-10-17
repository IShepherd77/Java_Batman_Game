package enemies;

public class Penguin extends Enemy{

    public Penguin(){
        super(75);
    }

    public void takeDamage(){
        int newHealthPoints = getHealthPoints() -5;
        setHealthPoints(newHealthPoints);
    }
}
