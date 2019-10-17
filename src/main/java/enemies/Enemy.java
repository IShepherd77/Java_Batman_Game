package enemies;


public abstract class Enemy {
    private int healthPoints;

    public Enemy(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public abstract void takeDamage(int damagePoints);

    public int getHealthPoints(){
        return healthPoints > 0 ? healthPoints : 0;
    }

    public void setHealthPoints(int newHealthPoints){
        this.healthPoints = newHealthPoints;
    }


}
