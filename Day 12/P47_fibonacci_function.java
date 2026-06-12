import java.util.*;
class P47_fibonacci_function
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        P47_fibonacci_function ob=new P47_fibonacci_function();
        for(int i=1;i<=n;i++)
        {
            int result=ob.fibonacci(i); //calling the recursive function to calculate the nth Fibonacci number
           System.out.print(result+" ");
        }
        sc.close();
    }
    int fibonacci(int n) //recursive function to calculate the nth Fibonacci number
    {
        if(n==1) //base case: F(1) = 0
        { 
            return 0;
        }
        else if(n==2) //base case: F(2) = 1
        {
            return 1;
        }
        else
        {
            return fibonacci(n-1)+fibonacci(n-2); //recursive case: F(n) = F(n-1) + F(n-2)
        }
    }
}