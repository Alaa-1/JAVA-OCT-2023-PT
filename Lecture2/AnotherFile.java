public class AnotherFile{

// access modifier
//    |
//    |   return type
//    |     |
//    |     |   method name (class function)
//    |     |     |
//    V     V     V
  public void greeting(){
    System.out.println("Greetings !!");
    
  }

  //! Method overloading
  //* method name + Paramter list = Method Signature
  public void greeting(String name){
    System.out.println("hi " + name);
    
  }

    public void greeting(int luckyNumber){
    System.out.println("Greetings, Your lucky number is " + luckyNumber);
    
  }

    public void greeting(String name, int repetation){
    
    String result = "";
    for(int i = 0; i<repetation; i++){
      result += "hi " + name + "\n";
    }

    System.out.println(result);
    
  }






  // public String printInfo(int amountOfMemory, String cpuType){

  //   return "This Pc has: " + amountOfMemory + "GB of RAM " + cpuType + " CPU";
  // }


}