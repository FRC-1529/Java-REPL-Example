public class Entity {
  public String Name = "";
  public int Hitpoints = 20;
  public int Attack = 5;
  public int Defense = 3;
  public int Speed = 4;

  public Entity(String nName) {
    //Create the Entity Randomly
    Name = nName;
  }

  public Entity(String nName, int nHitpoints, int nAttack, int nDefense, int nSpeed) {
    Name = nName;
    Hitpoints = nHitpoints;
    Attack = nAttack;
    Defense = nDefense;
    Speed = nSpeed;
  }

  String Symbol() {
    return Name.toUpperCase().substring(0, 1);
  }
}