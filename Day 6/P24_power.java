import java.util.*;
class P24_power
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base:");
        int base=sc.nextInt();
        System.out.println("Enter the exponent:");
        int exp=sc.nextInt();
        int result=1;
        for(int i=1;i<=exp;i++) //for loop is used to calculate the power of a number
        {
            result=result*base;
        }
        System.out.println(base+" raised to the power "+exp+" is:"+result);
        sc.close();
    }
}