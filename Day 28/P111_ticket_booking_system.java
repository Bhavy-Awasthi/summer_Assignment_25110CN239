import java.util.*;
class P111_ticket_booking_system
{
    public static void main()
     {
        Scanner sc = new Scanner(System.in);
        
        // State of the system
        boolean isRunning = true;
        int totalSeats = 10;
        
        // Array to hold seat status. 
        // false = available (default), true = booked
        boolean[] seats = new boolean[totalSeats];
        System.out.println("  Welcome to the Ticket Booking System   ");

        // Main Program Loop
        while (isRunning) {
            System.out.println("Main Menu");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Cancel a Ticket");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = sc.nextInt();

            // 1. VIEW SEATS LOGIC
            if (choice == 1)
             {
                System.out.println("Seat Status ");
                // Loop through the array to print the status of each seat
                for (int i = 0; i < totalSeats; i++)
                 {
                    int seatNumber = i + 1; // Array is 0-indexed, but seats are 1-indexed for the user
                    if (seats[i]) 
                    {
                        System.out.println("Seat " + seatNumber + ": [ BOOKED ]");
                    } else 
                    {
                        System.out.println("Seat " + seatNumber + ": [ AVAILABLE ]");
                    }
                }
            } 
            
            // 2. BOOK TICKET LOGIC
            else if (choice == 2) 
        {
                System.out.print("\nEnter seat number to book (1 - " + totalSeats + "): ");
                int seatToBook = sc.nextInt();

                // Validate input is within range
                if (seatToBook >= 1 && seatToBook <= totalSeats)
                 {
                    int arrayIndex = seatToBook - 1;
                    
                    if (seats[arrayIndex])
                     {
                        System.out.println("Sorry, Seat " + seatToBook + " is already booked.");
                    } else 
                    {
                        seats[arrayIndex] = true; // Mark as booked
                        System.out.println("Success! Seat " + seatToBook + " has been booked for you.");
                    }
                } 
                else
                 {
                    System.out.println("Error: Invalid seat number.");
                }
            } 
            
            // 3. CANCEL TICKET LOGIC
            else if (choice == 3) 
            {
                System.out.print("\nEnter seat number to cancel (1 - " + totalSeats + "): ");
                int seatToCancel = sc.nextInt();

                // Validate input is within range
                if (seatToCancel >= 1 && seatToCancel <= totalSeats) 
                {
                    int arrayIndex = seatToCancel - 1;
                    
                    if (seats[arrayIndex]) 
                    {
                        seats[arrayIndex] = false; // Mark as available
                        System.out.println("Success! Your booking for Seat " + seatToCancel + " has been cancelled.");
                    } else {
                        System.out.println("Error: Seat " + seatToCancel + " is not currently booked.");
                    }
                } else {
                    System.out.println("Error: Invalid seat number.");
                }
            } 
            
            // 4. EXIT LOGIC
            else if (choice == 4) {
                System.out.println("\nThank you for using the TicketBooking System. Goodbye!");
                isRunning = false; // Break the while loop
            } 
            
            // INVALID MENU CHOICE
            else {
                System.out.println("\nInvalid choice. Please select a number between 1 and 4.");
            }
        }

        // Clean up resources
        sc.close();
    }
}