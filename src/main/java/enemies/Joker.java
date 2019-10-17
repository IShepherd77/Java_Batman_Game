package enemies;

import enemies.Enemy;

public class Joker extends Enemy {

public Joker(){
    super(100);

}

public void takeDamage(){
    int newHealthPoints = getHealthPoints() -5;
     setHealthPoints(newHealthPoints);
}
}
