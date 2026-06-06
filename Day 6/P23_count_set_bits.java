import java.util.*;
class P23_count_set_bits
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int n=sc.nextInt();
        int count=0;
        while(n>0) //while loop is used to count the number of set bits in the binary number.
        {
            int rem=n%10;
            if(rem==1)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println("Number of set bits is: "+count);
        sc.close();
    }
}