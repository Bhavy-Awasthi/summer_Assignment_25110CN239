import java.util.*;

 class P109_library_management_system 
 {
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);

        // Arrays to store book details and their availability status
        String books[] = {
            "Introduction to Java", 
            "Data Structures and Algorithms", 
            "Artificial Intelligence", 
            "Database Management", 
            "Operating Systems"
        };
        boolean isAvailable[] = new boolean[5];

        System.out.println("  Welcome to the Library System!  ");

        boolean keepRunning = true;

        // Main program loop
        while (keepRunning) 
        {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. View all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = sc.nextInt();

            // 1. VIEW BOOKS
            if (choice == 1) 
            {
                System.out.println(" Library Catalog ");
                for (int i = 0; i < 5; i++) {
                    String status;
                    if (isAvailable[i]==false) 
                    {
                        status = "Available";
                    } else {
                        status = "Borrowed";
                    }
                    System.out.println((i + 1) + ". " + books[i] + " [" + status + "]");
                }
            } 
            // 2. BORROW A BOOK
            else if (choice == 2) 
            {
                System.out.print("Enter the book number to borrow (1-" + books.length + "): ");
                int bookId = sc.nextInt();

                // Validate user input is within the array bounds
                if (bookId > 0 && bookId <= books.length) {
                    int index = bookId - 1; // Convert human-readable ID to array index
                    
                    if (isAvailable[index]==false) 
                    {
                        isAvailable[index] = true; // Mark as borrowed
                        System.out.println("Success! You have borrowed: '" + books[index] + "'.");
                    } 
                    else 
                    {
                        System.out.println("Sorry, that book is currently checked out.");
                    }
                }
                 else 
                {
                    System.out.println("Error: Invalid book number.");
                }
            } 
            // 3. RETURN A BOOK
            else if (choice == 3) 
            {
                System.out.print("Enter the book number to return (1-" + books.length + "): ");
                int bookId = sc.nextInt();

                if (bookId > 0 && bookId <= books.length) {
                    int index = bookId - 1; 
                    
                    if (isAvailable[index])
                     { // If it is currently borrowed
                        isAvailable[index] = false; // Mark as available
                        System.out.println("Success! You have returned: '" + books[index] + "'.");
                    }
                     else 
                    {
                        System.out.println("That book is already in the library. You can't return it.");
                    }
                } 
                else
                 {
                    System.out.println("Error: Invalid book number.");
                }
            } 
            // 4. EXIT PROGRAM
            else if (choice == 4)
             {
                System.out.println("\nExiting Library System. Have a great day!");
                keepRunning = false; // Breaks the while loop
            } 
            // INVALID INPUT
            else
             {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }

        sc.close();
    }
}