import java.util.*;

class P90_first_repeating_character 
{

    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine(); // taking input
        char ch[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) // converting string to char array
        {
            ch[i] = s.charAt(i);
        }
        int count = 0; // variable to count the frequency
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (ch[i] == ch[j]) // checking if the character is present in the string
                {
                    count++;
                }
            }
            if (count > 1) // if the frequency of the character is 1
            {
                System.out.println("The first repeating character is " + ch[i]);
                break; // breaking the loop
            }
        }
        sc.close();
    }
}