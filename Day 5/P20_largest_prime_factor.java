import java.util.*;
class P20_largest_prime_factor
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int n1=n;
        if(n<2)
        {
            System.out.println("Invalid input");
            sc.close(); 
            return;//to check if the input number is less than 2, as prime factors are defined for numbers greater than or equal to 2
        }

        int largest=2; //to store the largest prime factor
        for(int i=2;i<=n;i++) //to find the prime factors of the number
        {
            while(n%i==0) //to check if the number is divisible by the prime factor
            {
               largest=i; //to store the largest prime factor
                n=n/i; //to divide the number by the prime factor
            }
        }
        System.out.println("The largest prime factor of "+n1+" is: "+largest);
        sc.close();
    }
}