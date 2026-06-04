import java.util.*;
class P19_prime_factors
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("The prime factors of "+n+" are:");
        for(int i=2;i<=n;i++) //to find the prime factors of the number
        {
            while(n%i==0) //to check if the number is divisible by the prime factor
            {
                System.out.print(i+" ");
                n=n/i; //to divide the number by the prime factor
            }
        }
        sc.close();
    }
}