package enemies;


public abstract class Enemy {
    private int healthPoints;

    public Enemy(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public abstract void takeDamage(int damagePoints);

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void setHealthPoints(int newHealthPoints){
        this.healthPoints = newHealthPoints;
    }
}
