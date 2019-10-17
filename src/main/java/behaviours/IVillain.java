package behaviours;

public interface IVillain {

    void takeDamage(int damagePoints);
    String getName();
    int getHealthPoints();
    String attack(IHero hero);
}
