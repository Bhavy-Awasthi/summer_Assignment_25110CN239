import java.util.*;

public class P110_Bank_Account_System
 {
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);

        // Account Details and Initial State
        String accountHolder = "Mahesh Singh";
        String accountNumber = "1234567890";
        double balance = 0.0;
        boolean isRunning = true;
        System.out.println("  Welcome to the Simple Bank System  ");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);

        // Main Program Loop
        while (isRunning)
         {
            System.out.println("Main Menu ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = sc.nextInt();

            // Handling User Choices without separate functions
            if (choice == 1) 
            {
                
                // CHECK BALANCE LOGIC
                System.out.println("[Current Balance] " + balance);
                
            } 
            else if (choice == 2) 
            {
                
                // DEPOSIT LOGIC
                System.out.print("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                
                if (depositAmount > 0)
                 {
                    balance += depositAmount;
                    System.out.println("Success! Deposited: " + depositAmount);
                    System.out.println("New Balance: " + balance);
                } 
                else 
                {
                    System.out.println("Error: Deposit amount must be greater than zero.");
                }
                
            }
             else if (choice == 3) 
             {
                
                // WITHDRAW LOGIC
                System.out.print("\nEnter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                
                if (withdrawAmount <= 0) 
                {
                    System.out.println("Error: Withdrawal amount must be greater than zero.");
                } 
                else if (withdrawAmount > balance) 
                {
                    System.out.println("Error: Insufficient funds! Your current balance is " + balance);
                } 
                else 
                {
                    balance -= withdrawAmount;
                    System.out.println("Success! Withdrew: " + withdrawAmount);
                    System.out.println("Remaining Balance: " + balance);
                }
                
            } 
            else if (choice == 4) 
            {
                
                // EXIT LOGIC
                System.out.println("Thank you for using the Bank System. Goodbye!");
                isRunning = false; // This breaks the while loop
                
            } 
            else
             {
                
                // INVALID INPUT LOGIC
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
                
            }
        }

        // Close the scanner to prevent memory leaks
        sc.close();
    }
}