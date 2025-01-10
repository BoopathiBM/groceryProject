import java.util.ArrayList;
import java.util.Scanner;

public class UpdateQuantity {
    ArrayList<Integer> quantity = new ArrayList<>();

    public void updateQuantity(Integer oldQuantity) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter additional Quantity: ");

        int updateQuantity = scanner.nextInt();
        updateQuantity += oldQuantity;

        quantity.add(updateQuantity);

    
        System.out.println("quantity to be update: " + quantity);

    

    }

}