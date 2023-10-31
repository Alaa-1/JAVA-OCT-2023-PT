public class ShoppingCart {
// Member Variables
public String store; // null
public double total; // 0.0
public ArrayList<String> items = new ArrayList<String>(); // []
// METHOD
public void add_item(String item, double price){
this.items.add(item);
this.total += price;
}
}