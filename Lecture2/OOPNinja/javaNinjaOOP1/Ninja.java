class Ninja {

// Member Varibales
    private String name;
    private int health;
// Static Variable
    private static String dojoName = "NEFEL";
    private static int numberOfNinjas;

// Constuctor
    public Ninja(String name){
        this.name = name;
        this.health = 100;
        Ninja.numberOfNinjas++;
    }

// Overloading Constuctor
    public Ninja(){
        this.name = "UNKNOWN";
        this.health = 100;
        Ninja.numberOfNinjas++;
    }

// === Methods ===
    public void displayStats(){
        System.out.println("Name: " + this.name);
        System.out.println("Health:" + this.health);
    }

    public Ninja eatStrawberry(){
        this.health += 10;
        return this;
    }

    // GETTERS & SETTERS
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static String getDojoName(){
        return Ninja.dojoName;
    }

    public static void setDojoName(String newName){
        Ninja.dojoName = newName;
    }
      public static int getNumberOfNinjas(){
        return Ninja.numberOfNinjas;
    }


}