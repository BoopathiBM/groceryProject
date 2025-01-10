import java.util.ArrayList;
import java.util.Scanner;

public class Additems {

    public void addItem() {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();

        System.out.println("Enter Item name: ");
        String itemName = scanner.nextLine();

        System.out.println("Enter Quantity of Items: ");

        ArrayList<Integer> quantity = new ArrayList<>();
        int itemQuantity = scanner.nextInt();

        name.add(itemName);
        quantity.add(itemQuantity);
        System.out.println("Entered Item Name: " + name);
        System.out.println("Entered Item Quantity: " + quantity);

    }

}