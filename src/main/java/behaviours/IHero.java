package behaviours;

public interface IHero {

    void takeDamage(int damagePoints);
    String attack(IVillain villain);
    String getName();
    int getHealthPoints();
}
