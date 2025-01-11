import java.util.ArrayList;
import java.util.Scanner;

public class InventoryItems {
    
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> quantity = new ArrayList<>();

    public void addNewItem(String itemName, int itemQuantity) {
        this.name.add(itemName);
        this.quantity.add(itemQuantity);
    }

    public void addItemUserInput(Scanner scanner) {

        System.out.print("\nEnter Item name: ");
        String itemName = scanner.next();

        System.out.print("\nEnter Quantity of Items: ");
        int itemQuantity = scanner.nextInt();

        this.addNewItem(itemName, itemQuantity);
        this.printNewItems();

    }

    public void printNewItems() {
        System.out.println("Entered Item Name: " + this.name);
        System.out.println("Entered Item Quantity: " + this.quantity);

    }
    

    public void printInventory(){
        System.out.println("************ Inventory *************");
        for(int i=0; i< this.name.size(); i++){
            System.out.println("Item Name "+ this.name.get(i) + " Quantity:"+ this.quantity.get(i));
        }
        System.out.println("***********************************");

    }

    public void removeInventory(Scanner scanner){

        System.out.print("\nEnter item no to remove: ");
        int itemNo = scanner.nextInt();
        this.name.remove(itemNo);
        this.quantity.remove(itemNo);
    }

    public void updateInventory(Scanner scanner){

        System.out.print("\nEnter item no to update: ");
        int itemNo = scanner.nextInt();
        System.out.print("\nEnter quantity to update: ");
        int quantity = scanner.nextInt();
         this.quantity.set(itemNo, quantity);
    }

    
    

}