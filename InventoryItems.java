import java.util.ArrayList;
import java.util.Scanner;

public class InventoryItems {
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> quantity = new ArrayList<>();

    public void addNewItem(String itemName, int itemQuantity) {
        this.name.add(itemName);
        this.quantity.add(itemQuantity);
    }

    public void addItemUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Item name: ");
        String itemName = scanner.nextLine();

        System.out.println("Enter Quantity of Items: ");
        int itemQuantity = scanner.nextInt();

        this.addNewItem(itemName, itemQuantity);

        System.out.println("Entered Item Name: " + name);
        System.out.println("Entered Item Quantity: " + quantity);

        scanner.close();
    }

}