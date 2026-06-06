import java.util.*;
class P27_recursive_sum_of_digits
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        P27_recursive_sum_of_digits ob=new P27_recursive_sum_of_digits();
        int result=ob.sum_of_digits(n); //calling the recursive function to calculate the sum of digits of the number
        System.out.println("Sum of digits of "+n+" is : "+result);
        sc.close();
    }
    int sum_of_digits(int n) //recursive function to calculate the sum of digits of a number
    {
        if(n==0) //base case: sum of digits of 0 is 0
        {
            return 0;
        }
        else
        {
            return (n%10)+sum_of_digits(n/10); //recursive case: sum of digits of n = last digit + sum of digits of remaining number
        }
    
    }
}