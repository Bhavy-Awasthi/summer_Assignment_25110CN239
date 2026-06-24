import java.util.*;
class P94_longest_word
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int l=s.length();
        String longst="";
        int longst_length=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)!=' ')
            {
                int j=i+1;
                while(j<l&&s.charAt(j)!=' ')
                {
                    j++;
                }
               if(j-i>longst_length)
             {
                 longst_length=j-i;
                 longst=s.substring(i,j);
             }
             i=j;
            }
        }
        System.out.println(" The longest word is: "+longst+" and its length is: "+longst_length);
        sc.close();
    }
}