import java.util.*;
class P15_armstrong_number {
    public static void main()
     {
      int n, a=0,d,pow=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term number : ");
        n = sc.nextInt(); 
        int n1=n;
        while(n1>0) //to calculate the number of digits in the term number
        {
           pow++;
              n1=n1/10;
        }
        n1=n;
        while(n1>0) //to calculate the sum of the digits raised to the power of number of digits
        {
            d=n1%10;
          a=a+(int)Math.pow(d,pow);
            n1=n1/10;
        }
        if(a==n) //if the sum is equal to the term number, then it
            System.out.println(n+" is an Armstrong number");
            else
            System.out.println(n+" is not an Armstrong number");
        sc.close();
    }
}
