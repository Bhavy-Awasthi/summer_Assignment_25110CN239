import java.util.*;

 class P116_inventory_management_system
 {
    public static void main()
     {
        Scanner sc = new Scanner(System.in);
        
        // Define maximum capacity for the inventory
        int MAX_ITEMS = 100;
        
        // Parallel arrays to hold item data
        String itemNames[] = new String[MAX_ITEMS];
        int itemQuantities[] = new int[MAX_ITEMS];
        double itemPrices[] = new double[MAX_ITEMS];
        
        int itemCount = 0; // Tracks how many items are currently in the system
        boolean running = true; // Controls the main application loop
        
        System.out.println(" Welcome to the Inventory Management System ");
        
        while (running)
         {
            // Display the menu
            System.out.println("1. Add Item");
            System.out.println("2. View Inventory");
            System.out.println("3. Update Quantity");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by nextInt()
            
            switch (choice) {
                case 1:
                    // ADD ITEM LOGIC
                    if (itemCount >= MAX_ITEMS) 
                    {
                        System.out.println("Error: Inventory is completely full!");
                    } 
                    else
                     {
                        System.out.print("Enter item name: ");
                        itemNames[itemCount] = sc.nextLine();
                        
                        System.out.print("Enter item quantity: ");
                        itemQuantities[itemCount] = sc.nextInt();
                        
                        System.out.print("Enter item price: ");
                        itemPrices[itemCount] = sc.nextDouble();
                        
                        itemCount++; // Increase the total number of items
                        System.out.println("Success: Item added to inventory.");
                    }
                    break;
                    
                case 2:
                    // VIEW INVENTORY LOGIC
                    if (itemCount == 0) {
                        System.out.println("Inventory is currently empty.");
                    } else {
                        System.out.println("\n--- Current Inventory ---");
                        // Print table headers
                        System.out.printf("%-5s | %-15s | %-10s | %-10s\n", "ID", "Name", "Quantity", "Price");
                        System.out.println("------------------------------------------------------");
                        
                        // Loop through parallel arrays to print data
                        for (int i = 0; i < itemCount; i++) {
                            System.out.printf("%-5d | %-15s | %-10d | %-10f\n", 
                                (i + 1), itemNames[i], itemQuantities[i], itemPrices[i]);
                        }
                    }
                    break;
                    
                case 3:
                    // UPDATE QUANTITY LOGIC
                    if (itemCount == 0) 
                    {
                        System.out.println("Inventory is empty. Please add items first.");
                    } else {
                        System.out.print("Enter the ID of the item to update (1 to " + itemCount + "): ");
                        int id = sc.nextInt();
                        
                        // Validate ID (it should be between 1 and the current number of items)
                        if (id > 0 && id <= itemCount) {
                            System.out.print("Enter the new quantity for " + itemNames[id - 1] + ": ");
                            int newQuantity = sc.nextInt();
                            itemQuantities[id - 1] = newQuantity; // id - 1 because arrays are 0-indexed
                            System.out.println("Success: Quantity updated.");
                        } else {
                            System.out.println("Error: Invalid ID entered.");
                        }
                    }
                    break;
                    
                case 4:
                    // EXIT LOGIC
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Error: Invalid option. Please try again.");
            }
        }
        
        sc.close();
    }
}