import java.util.*;
class P46_armstrong_function
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is an armstrong number : ");
        int n = sc.nextInt(); //taking input of the number to check if it is an armstrong number
        P46_armstrong_function ob= new P46_armstrong_function(); //creating an object of the class to call the armstrong function
        int result = ob.isArmstrong(n); //calling the armstrong function and storing the result in a variable
        if(result == 1) //if the result is 1 then the number is an armstrong number
            System.out.println("The number is an armstrong number.");
        else
            System.out.println("The number is not an armstrong number.");
        sc.close();
    }
    int isArmstrong(int x)
    {   int count=0; //counts the number of digits in the number
        int x1=x;
        int original = x; //storing the original number in a variable
        int sum = 0; //initializing the sum variable to 0
        while(x1 > 0) //loop to count the number of digits in the number
        {
            x1 = x1 / 10; //removing the last digit from the number
            count++; //incrementing the count variable
        }
        while(x > 0) //loop to calculate the sum of the digits raised to the power of the number of digits
        {
            int digit = x % 10; //getting the last digit of the number
            sum = sum + (int)Math.pow(digit, count); //adding the digit raised to the power of the number of digits to the sum variable
            x = x / 10; //removing the last digit from the number
        }
        if(original == sum) //if the original number is equal to the sum, then it is an armstrong number
            return 1;
        else
            return 0;
    }
}