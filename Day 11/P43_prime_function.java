import java.util.*;
class P43_prime_function
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        int n = sc.nextInt(); //taking input of the number to be checked
        P43_prime_function ob= new P43_prime_function(); //creating an object of the class to call the prime function
        int result = ob.isPrime(n); //calling the prime function and storing the result in a variable
        if(result == 2) //if the count of factors is 2 then the number is prime
            System.out.println("The number is prime.");
        else
            System.out.println("The number is not prime.");
        sc.close();
    }
    int isPrime(int x)
    {
        int i, count= 0;
        for(i=1; i<=x; i++)
        {
            if(x%i == 0)
                count++;
        }
        return count; //returning the count of factors of the number
    }
}