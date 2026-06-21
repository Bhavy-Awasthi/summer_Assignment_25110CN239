import java.util.*;
class P84_lowercase_to_uppercase
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string in lowercase: ");
        String str = sc.nextLine(); // Read a string from the user
        String str1=""; // Initialize an empty string to store the uppercase version
        for(int i=0;i<str.length();i++)
        {

            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z')
            ch-=32; // Convert the lowercase character to uppercase by subtracting 32 from its ASCII value
            str1+=ch; // Append the uppercase character to the result string
        }
        
        System.out.println("Uppercase string: " + str1); // Print the uppercase string
        sc.close();
    }

}