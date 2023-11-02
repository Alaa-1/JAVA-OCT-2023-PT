public class Weapon{
  //MEMBER VARIABLES
  private String name;
  private String type;
  private int damage;

  // CONSTRUCTOR
  public Weapon(String name, String type, int damage){
    this.name= name;
    this.type = type;
    this.damage = damage;
  }
  // GETTERS & SETTERS
  public String getName(){
    return this.name;
  }

  public void setName(String newName){
    this.name = newName;
  }
    public int getDamage(){
    return this.damage;
  }

  public void setDamage(int newDamage){
    this.damage = newDamage;
  }

    public String getType(){
    return this.type;
  }

  public void setType(String newType){
    this.type = newType;
  }
}