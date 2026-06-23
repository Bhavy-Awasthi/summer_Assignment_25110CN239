import java.util.*;
class maximum_occuring_character
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine(); //taking input
        char ch[]= new char[s.length()];
        for(int i=0;i<s.length();i++) //converting string to char array
        {
            ch[i]=s.charAt(i);
        }
        int count=0; //variable to count the frequency
        int maxcount=0; //variable to store the maximum frequency
        char maxchar='a'; //variable to store the maximum occuring character
        for(int i=0;i<s.length();i++)
        {
            count=0;
            for(int j=0;j<s.length();j++) //checking if the character is present in the string
            {
                if(ch[i]==ch[j])
                {
                    count++;
                }
            }
            if(count>maxcount) //if the frequency of the character is greater than the maximum frequency
            { maxcount=count;
                maxchar=ch[i];
            }
            }
            System.out.println("The maximum occuring character is "+maxchar); //printing the maximum occuring character
            sc.close();    
        }
    }