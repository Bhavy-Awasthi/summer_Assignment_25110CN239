import java.util.*;
class P83_count_vowels_consonents
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); // Read a string from the user
        str=str.toLowerCase(); // Convert the string to lowercase
        int vowels = 0, consonants = 0; // Initialize counters for vowels and consonants


        for (int i = 0; i < str.length(); i++) // Iterate through each character in the string
          {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
       // Print the results
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        sc.close();
    }

}