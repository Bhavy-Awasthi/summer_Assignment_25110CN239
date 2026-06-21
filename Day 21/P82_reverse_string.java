import java.util.*;
class P82_reverse_string
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); // Read a string from the user
        String reversed = ""; // Initialize an empty string to store the reversed string

        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversed += str.charAt(i); // Append each character to the reversed string
        }
        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
        sc.close(); 
    }

}