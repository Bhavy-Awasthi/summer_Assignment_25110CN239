import java.util.*;
class P44_factorial_function
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial : ");
        int n = sc.nextInt(); //taking input of the number to find its factorial
        P44_factorial_function ob= new P44_factorial_function(); //creating an object of the class to call the factorial function
        int result = ob.factorial(n); //calling the factorial function and storing the result in a variable
        System.out.println("The factorial of the number is : " + result);
        sc.close();
    }
    int factorial(int x)
    {
        if(x == 0) //if the number is 0 then its factorial is 1
            return 1;
        else
            return x*factorial(x-1); //returning the product of the number and the factorial of the number minus 1
    }
}