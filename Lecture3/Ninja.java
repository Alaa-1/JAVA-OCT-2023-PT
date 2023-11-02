public class Ninja{
  // MEMBER VARIABLES
  private String name;
  private Integer health;
  private Weapon weapon; // association
  private int power;

  // public Ninja(){}; // zero-args constructor (default JAVA CONSTRUCTOR)

  // Constructor
  public Ninja(String name,Integer health,Weapon weapon,int power ){ // all args constructor
    this.name = name;
    this.health = health;
    this.weapon = weapon;
    this.power = power;
  }
  // Overloading Constructor
  public Ninja(){
    this.name = "anonymous";
    this.health = 150;
    this.weapon = new Weapon("punches", "human", 25);
    this.power = 20;
  }

  // Methods

  public void displayStats(){
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("power: " + this.power);

  }

  public void attack(Ninja target){
        System.out.println(this.name + " attacks " + target.name);
        target.setHealth(target.health - this.weapon.getDamage());

  }
  
  // GETTERS & SETTERS
  public String getName(){

    return this.name;
  }

  public void setName(String newName){
    
    this.name = newName;
  }

    public Integer getHealth(){
    return this.health;
  }

  public void setHealth(Integer newHealth){
    this.health = newHealth;
  }

    public Weapon getWeapon(){
    return this.weapon;
  }

  public void setWeapon(Weapon newWeapon){
    this.weapon = newWeapon;
  }

    public int getPower(){
    return this.power;
  }

  public void setPower(int newPower){
    this.power = newPower;
  }
}