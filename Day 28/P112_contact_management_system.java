import java.util.*;

public class P112_contact_management_system
 {
    public static void main()
     {
        Scanner sc = new Scanner(System.in);
        
        // State of the system
        boolean isRunning = true;
        int maxContacts = 100;
        int contactCount = 0; // Tracks how many contacts have been added
        
        // Parallel arrays to store contact details
        String[] names = new String[maxContacts];
        String[] phoneNumbers = new String[maxContacts];
        System.out.println("  Welcome to the Simple Contact System   ");
        // Main Program Loop
        while (isRunning) 
        {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add a Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search for a Contact");
            System.out.println("4. Delete a Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character

            // 1. ADD CONTACT LOGIC
            if (choice == 1) 
            {
                if (contactCount >= maxContacts)
                 {
                    System.out.println("Error: Contact list is full. Cannot add more contacts.");
                } else 
                {
                    System.out.print("Enter Contact Name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Enter Contact Phone Number: ");
                    String phone = sc.nextLine();
                    
                    // Store in parallel arrays at the current empty index
                    names[contactCount] = name;
                    phoneNumbers[contactCount] = phone;
                    contactCount++; // Increment the total number of contacts
                    
                    System.out.println("Success! Contact added.");
                }
            } 
            
            // 2. VIEW CONTACTS LOGIC
            else if (choice == 2) 
            {
                System.out.println(" Contact List ");
                if (contactCount == 0) 
                {
                    System.out.println("Your contact list is empty.");
                } else 
                {
                    for (int i = 0; i < contactCount; i++) 
                    {
                        System.out.println((i + 1) + ". Name: " + names[i] + " | Phone: " + phoneNumbers[i]);
                    }
                }
            } 
            
            // 3. SEARCH CONTACT LOGIC
            else if (choice == 3) {
                System.out.print("Enter the name to search for: ");
                String searchName = sc.nextLine();
                boolean isFound = false;

                for (int i = 0; i < contactCount; i++) 
                {
                    // Check if the current name matches the search term (ignoring case)
                    if (names[i].equalsIgnoreCase(searchName)) 
                    {
                        System.out.println("[Contact Found]");
                        System.out.println("Name: " + names[i]);
                        System.out.println("Phone: " + phoneNumbers[i]);
                        isFound = true;
                        break; // Stop searching once found
                    }
                }
                
                if (!isFound) 
                {
                    System.out.println("Error: Contact '" + searchName + "' not found.");
                }
            } 
            
            // 4. DELETE CONTACT LOGIC
            else if (choice == 4)
             {
                System.out.print("\nEnter the name of the contact to delete: ");
                String deleteName = sc.nextLine();
                boolean isDeleted = false;

                for (int i = 0; i < contactCount; i++) 
                {
                    if (names[i].equalsIgnoreCase(deleteName)) 
                    {
                        
                        // Shift all subsequent contacts one position to the left to fill the gap
                        for (int j = i; j < contactCount - 1; j++)
                         {
                            names[j] = names[j + 1];
                            phoneNumbers[j] = phoneNumbers[j + 1];
                        }
                        
                        contactCount--; // Reduce the total count of contacts
                        isDeleted = true;
                        System.out.println("Success! Contact '" + deleteName + "' has been deleted.");
                        break; 
                    }
                }
                
                if (!isDeleted) 
                {
                    System.out.println("Error: Contact '" + deleteName + "' not found. Nothing was deleted.");
                }
            } 
            
            // 5. EXIT LOGIC
            else if (choice == 5) {
                System.out.println("Saving contacts... Goodbye!");
                isRunning = false;
            } 
            
            // INVALID MENU CHOICE
            else {
                System.out.println("Invalid choice. Please select a number between 1 and 5.");
            }
        }

        sc.close();
    }
}