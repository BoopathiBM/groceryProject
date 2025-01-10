import java.util.ArrayList;
import java.util.Scanner;

public class UpdateQuantity extends InventoryItems {
    ArrayList<Integer> updatedQuantity = new ArrayList<>();
    //this.quantity = quantity;

    public void quantityUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter additional Quantity: ");

        int addOnQuantity = scanner.nextInt();
        updateNewQuantity(addOnQuantity);
        addNewQuantity();
        printNewQuantity();

        scanner.close();

    }

    public void updateNewQuantity(int addOnQuantity) {
        this.updatedQuantity.add(addOnQuantity);
    }

    public void addNewQuantity() {
        //this.updatedQuantity.add(this.quantity);
        System.out.println(this.updatedQuantity);
        System.out.println(this.quantity);
    }

    public void printNewQuantity() {
        System.out.println("added quantity:" + this.updatedQuantity);
    }

}