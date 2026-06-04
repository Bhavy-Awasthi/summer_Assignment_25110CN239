import java.util.*;
class P18_strong_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int sum=0,n1=n;
        int f,d;
     while(n1>0) //to find the sum of factorial of digits
        {
            d=n1%10;
            f=1;
            for(int i=1;i<=d;i++) //to find the factorial of the digit
            {
                f=f*i;
            }
            sum=sum+f;
            n1=n1/10;
        }
        if(sum==n) //to check if the sum of factorial of digits is equal to the original number
        {
            System.out.println("It is a Strong number");
        }
        else //to check if the sum of factorial of digits is not equal to the original number
        {
            System.out.println("It is not a Strong number");
        }
        sc.close();
    }
}