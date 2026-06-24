import java.util.*;
class P96_remove_duplicate_character
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next(); // taking input
        String s1=""; // variable to store the unique characters
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i); // character at index i
            if(s1.indexOf(ch)==-1) // if the character is not present in the string
            {
                s1=s1+ch;
            }
        }
        System.out.println(s1); // printing the unique characters
        sc.close();
    }
}