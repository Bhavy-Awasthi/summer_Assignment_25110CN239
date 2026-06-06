import java.util.*;
class P25_recursive_factorial
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        P25_recursive_factorial ob=new P25_recursive_factorial();
        int result=ob.factorial(n); //calling the recursive function to calculate the factorial of the number
        System.out.println("Factorial of "+n+" is : "+result);
        sc.close();
    }
    int factorial(int n) //recursive function to calculate the factorial of a number
    {
        if(n==0) //base case: factorial of 0 is 1
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1); //recursive case: n! = n * (n-1)!
        }
    }
}