public class TestNinja {
  public static void main(String[]args){
    // System.out.println("It's working !!!");
   Weapon weapon1 = new Weapon("Katana", "Sword", 54);

    Ninja Mikey = new Ninja();
    Ninja Leo = new Ninja("Leonardo", 120, weapon1, 99);
    // System.out.println(Mikey.getName());
    // System.out.println(Leo.getName());
    // Leo.displayStats();
    // System.out.println("------------------------");

    // Mikey.attack(Leo);

    // System.out.println("------------------------");

    // Leo.displayStats();

System.out.println(Mikey.getClass());
    
  }
}