
public class Tower {
  private int id;
  private String name;
  private int speed;
  private int damage;
  
  public Tower(int id, String name, int speed, int damage) {
    this.id = id;
    this.name = name;
    this.speed = speed;
    this.damage = damage;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getSpeed() {
    return this.speed;
  }
  
  public int getDamage() {
    return this.damage;
  }
}
