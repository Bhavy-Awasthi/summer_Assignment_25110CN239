import java.util.*;
class P87_charcter_frequency
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine(); //taking input of the string
         int freq=0; //variable to store the frequency of the character
         for(int i=0;i<str.length();i++)
         {
             freq=0; 
             for(int j=0;j<str.length();j++)
             {
                 if(str.charAt(i)==str.charAt(j)) //checking if the character is present in the string
                 {
                     freq++; //incrementing the frequency
                 }
             }
             System.out.println("Character "+(i+1)+" i.e. "+str.charAt(i)+" occured = "+freq+ " times");
         }
        }
     }