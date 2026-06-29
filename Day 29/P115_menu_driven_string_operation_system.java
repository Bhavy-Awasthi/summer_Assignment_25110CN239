import java.util.Scanner;

public class P115_menu_driven_string_operation_system 
{

    public static void main()
    
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        String inputString;

        do {
            // Display the menu
            System.out.println("STRING OPERATIONS MENU");
            System.out.println("1. Find Length of a String");
            System.out.println("2. Convert String to Uppercase");
            System.out.println("3. Reverse the String");
            System.out.println("4. Check if String is a Palindrome");
            System.out.println("5. Count Vowels and Consonants");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            // Read user choice
            choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter a string: ");
                    inputString = sc.nextLine();
                    System.out.println("Length of the string is: " + inputString.length());
                    break;

                case 2:
                    System.out.print("Enter a string: ");
                    inputString = sc.nextLine();
                    System.out.println("Uppercase string: " + inputString.toUpperCase());
                    break;

                case 3:
                    System.out.print("Enter a string: ");
                    inputString = sc.nextLine();
                    // Using StringBuilder to easily reverse the string
                    System.out.print("Reversed string: ");
                  for (int i = inputString.length() - 1; i >= 0; i--) {
                        System.out.print(inputString.charAt(i));
                    }
                    System.out.println();
                    break;

                case 4: //palindrome string
                    System.out.print("Enter a string: ");
                    inputString = sc.nextLine();
                    
                    String reversed = "";
                    for (int i = inputString.length() - 1; i >= 0; i--) 
                    {
                        reversed += inputString.charAt(i);
                    }
                    
                    if (inputString.equalsIgnoreCase(reversed)) 
                    {
                        System.out.println(inputString + " is a palindrome.");
                    } else 
                    {
                        System.out.println(inputString + " is not a palindrome.");
                    }
                    break;

                case 5:
                    System.out.print("Enter a string: ");
                    inputString = sc.nextLine();
                    int vowels = 0, consonants = 0;
                    
                    // Convert to lowercase to simplify condition checks
                    String lowerStr = inputString.toLowerCase();
                    
                    for (int i = 0; i < lowerStr.length(); i++)
                     {
                        char ch = lowerStr.charAt(i);
                        // Check if the character is a letter
                        if (Character.isLetter(ch))
                         {
                            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                vowels++;
                            } else
                             {
                                consonants++;
                            }
                        }
                    }
                    System.out.println("Number of vowels: " + vowels);
                    System.out.println("Number of consonants: " + consonants);
                    break;

                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option from 1 to 6.");
            }
        } while (choice != 6);

        sc.close();
}
}