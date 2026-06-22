import java.util.*;
class P88_remove_spaces
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:"); 
        String str = sc.nextLine(); //taking input of the string
        String result = ""; //variable to store the string without spaces
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) != ' ') //checking if the character is not a space
            {
                result = result + str.charAt(i); //adding the character to the result string
            }
        }
        System.out.println("String after removing spaces: " + result);
        sc.close();
    }

}