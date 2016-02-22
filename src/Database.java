import java.util.ArrayList;

public class Database {
  public ArrayList<Tower> getTower(int id) {
    ArrayList<Tower> towers = new ArrayList<Tower>();
    
    //Tower(id, name, speed, damage)
    Tower tower1 = new Tower(1, "yellow", 5, 20);
    Tower tower2 = new Tower(2, "red", 10, 50);
    
    towers.add(tower1);
    towers.add(tower2);
    
    return towers;
  }
}
