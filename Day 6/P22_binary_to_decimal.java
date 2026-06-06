import java.util.*;
class P22_binary_to_decimal
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int n=sc.nextInt();
        int decimal=0; //variable to store the decimal equivalent of the binary number
        int i=0;
        while(n>0) //while loop is used to convert the binary number to decimal number
        {
            int rem=n%10;
            decimal=decimal+rem*(int)Math.pow(2,i);
            n=n/10;
            i++;
        }
        System.out.println("Decimal equivalent is:"+decimal);
        sc.close();
    }
}