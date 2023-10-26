import java.util.Arrays;
import java.util.ArrayList;

public class Test{ 
  // Pascal Casing

public static void main(String[] args){
    
    // System.out.println("Hello");

// === VARIABLES ===

// ? Primitive Types
int x = 3;
boolean vote =true;
double tax = 2.5;
float pi = 3.14f;
char letter = 'a';

// ? Object Types & "Wrapper Classes"
Integer y = 321;
String name = "Joe";
Boolean isAdmin = false;
Double pie = 687.2;

// System.out.println(name.length());
// System.out.println(name.concat(" Doe"));
// System.out.println(Character.toUpperCase(letter));
// System.out.println( "hello" + 5);

// ==== Arrays ====

int[] numbers; // declaring the varibale
numbers = new int[3]; // instantiate
numbers[0] = 55;
numbers[1] = 89;
numbers[2] = 11;
// numbers[3] = 101;

int[] myArray = {515, 989, 101};
// System.out.println(myArray.length);
// System.out.println(Arrays.toString(myArray));


// ==== ArrayLists (Dynamic Arrays) ====

ArrayList<Integer> myIntegers = new ArrayList<Integer>();
// System.out.println(myIntegers);

myIntegers.add(10);
myIntegers.add(11);
myIntegers.add(101);
myIntegers.add(119);
System.out.println(myIntegers);
// System.out.println(myIntegers.size());

for(int i = 0; i<myIntegers.size(); i++){
  Integer el = myIntegers.get(i);
  System.out.println(el);
}

// ==== Enhanced For Loop ====
for(Integer el : myIntegers){
  System.out.println(el);
}

}
}