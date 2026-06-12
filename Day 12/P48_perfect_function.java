import java.util.*;
class P48_perfect_function
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        P48_perfect_function ob=new P48_perfect_function();
        int result=ob.perfect(n); //calling the function to check if the number is perfect or not
        if(result==1)
        {
            System.out.println(n+" is a perfect number.");
        }
        else
        {
            System.out.println(n+" is not a perfect number.");
        }
        sc.close();
    }
    int perfect(int n) //function to check if the number is perfect or not
    {
        int sum=0;
        for(int i=1;i<n;i++) //loop to calculate the sum of proper divisors of n
        {
            if(n%i==0) //if i is a divisor of n
            {
                sum+=i; //add i to the sum
            }
        }
        if(sum==n) //if the sum of proper divisors is equal to n, then n is a perfect number
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}