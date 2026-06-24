import java.util.*;
class P94_compress_string
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int count=1; //variable to count the frequency
        for(int i=0;i<s.length();i++)
        {
            if((i+1)<s.length()&&s.charAt(i)==s.charAt(i+1)) //if the current character is equal to the next character
            {
                count++;
            }
            else
            {
                System.out.print(s.charAt(i)+""+count);
                count=1; //reset the count variable to 1
            }

        }
        sc.close();
}
}