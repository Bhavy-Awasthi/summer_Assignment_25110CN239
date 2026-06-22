import java.util.*;
class palindrome_string
{
     
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine(); //taking input of the string
        String rev = ""; //variable to store the reversed string
        int length = str.length();
        for (int i = length - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i); //reversing the string
        }
        if (str.equalsIgnoreCase(rev)) //checking if the string is a palindrome
        {
            System.out.println(str + " is a palindrome string.");
        }
        else //if the string is not a palindrome
        {
            System.out.println(str + " is not a palindrome string.");
        }
        sc.close();
    }
}