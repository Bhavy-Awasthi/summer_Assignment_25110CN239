import java.util.*;
class P42_maximum_function
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements to be compared : ");
        int a = sc.nextInt(); //taking input of the first number
        int b=sc.nextInt(); //taking input of the second number
        P42_maximum_function ob= new P42_maximum_function(); //creating an object of the class to call the maximum function
        int result = ob.maximum(a,b); //calling the maximum function and storing the result in a variable
        System.out.println("The maximum of the two numbers is : " + result);
        sc.close();
    }
    int maximum(int x, int y)
    {
        if(x>y) //comparing the two numbers
            return x; //returning the first number if it is greater than the second number
        else
            return y; //returning the second number if it is greater than or equal to the first number
    }
}