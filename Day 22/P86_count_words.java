import java.util.*;
class P86_count_words
{
     
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine(); //taking input of the string
        str=str+" "; //adding a space at the end of the string
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ') //checking if the character is a space
            {
                count++; //incrementing the count
            }
        }
        System.out.println("Number of words in the string: " + count); //printing the count
        sc.close();
    }

}