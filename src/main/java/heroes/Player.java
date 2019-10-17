package heroes;

public abstract class Player {
    private String name;
    private int healthPoints;

    public Player(String name, int healthPoints){
        this.name = name;
        this.healthPoints =healthPoints;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthPoints(){
        return healthPoints > 0 ? healthPoints : 0;
    }

    public void setHealthPoints(int newHealthPoints){
        this.healthPoints = newHealthPoints;
    }


}
