
/*
 * Grocery Store Inventory Manager

=============================
Create a program to manage a grocery store’s inventory using ArrayList. The program should allow the following operations:
	1.	Add a new item: Add the name and quantity of a grocery item to the inventory.
	2.	Update an item’s quantity: Update the quantity of an existing item.
	3.	Remove an item: Remove an item from the inventory.
	4.	View the inventory: Display all items and their quantities in the inventory.

Requirements:
	•	Use an ArrayList to store the names of items.
	•	Use another ArrayList to store the quantities of corresponding items.
	•	The program should dynamically allow users to add, update, remove, or view items through a menu.

Example Input/Output:
	1.	Add an item
	2.	Update an item’s quantity
	3.	Remove an item
	4.	View inventory
	5.	Exit    


Input:

1  
Enter item name: Apples  
Enter quantity: 10  

1  
Enter item name: Bananas  
Enter quantity: 20  

4  
Inventory:  
1. Apples - 10  
2. Bananas - 20  

2  
Enter item number to update: 1  
Enter new quantity: 15  

4  
Inventory:  
1. Apples - 15  
2. Bananas - 20  

5
Exit
 */

 import java.util.Scanner;
 import java.util.ArrayList;

 public class GroceryRunner {
     public static void main(String[] args) {
 
         Scanner scanner = new Scanner(System.in);
 
         InventoryItems addItems = new InventoryItems();
         UpdateQuantity addQuantity = new UpdateQuantity();
 
         System.out.println("Enter the option :\n" + "\t1.\tAdd an item\n" + //
                 "\t2.\tUpdate an item’s quantity\n" + //
                 "\t3.\tRemove an item\n" + //
                 "\t4.\tView inventory\n" + //
                 "\t5.\tExit ");
         int options = scanner.nextInt();
         switch (options) {
             case 1:
                 // Add an item
                addItems.addItemUserInput();
                 break;
 
             case 2:
                 // update an item quantity
                 
                 break;
 
             case 3:
 
                 // Remove an item
                 break;
 
             case 4:
                 // View Inventory
                 break;
             case 5:
                 // Exit
 
             default:
                 System.out.println("Invaild input ! \n \t please give correct input");
                 break;
         }
         scanner.close();
 
     }
 }