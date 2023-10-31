public class TestNinja {
    
    public static void main(String[] args) {

        // Predict the Output (if there are any errors,
        // try to predict what it will say, and then fix it.)
        Ninja ninja1 = new Ninja("Miky");
        // System.out.println(ninja1.getName());
        // ninja1.setName("Splinter");
        // System.out.println(ninja1.getName());

        // System.out.println(ninja1.getName());

        Ninja kikomo = new Ninja("Kikomo");
        // kikomo.displayStats();
        // kikomo.eatStrawberry().eatStrawberry().eatStrawberry();
        // kikomo.displayStats();

        System.out.println(Ninja.getDojoName());
        Ninja.setDojoName("KungFu Panda");
        System.out.println(Ninja.getDojoName());

        System.out.println(Ninja.getNumberOfNinjas());


    }
}