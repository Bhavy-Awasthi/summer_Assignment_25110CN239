import java.util.*;
class P17_perfect_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int sum=0; //to store the sum of factors of n
        for(int i=1;i<n;i++)
        {
            if(n%i==0) //if the number is divisible by i, then it is a factor of n
            {
                sum=sum+i;
            }
        }
        if(sum==n) //if the sum of factors is equal to n, then n is a perfect number
        {
            System.out.println(n+" is a perfect number.");
        }
        else
        {
            System.out.println(n+" is not a perfect number.");
        }
        sc.close();
    }
}