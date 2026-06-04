import java.util.*;
class P16_armstrong_range {
    public static void main()
     {
        int n1, n2, a=0,d,pow=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting term number : ");
        n1 = sc.nextInt(); 
        System.out.println("Enter the ending term number : ");
        n2 = sc.nextInt(); 
        System.out.println("Armstrong numbers between "+n1+" and "+n2+" are : ");
        for(int i=n1; i<=n2; i++) //to check for all the numbers between n1 and n2
        {
            int n=i;
            while(n>0) //to calculate the number of digits in the term number
            {
               pow++;
                  n=n/10;
            }
            n=i;
            while(n>0) //to calculate the sum of the digits raised to the power of number of digits
            {
                d=n%10;
              a=a+(int)Math.pow(d,pow);
                n=n/10;
            }
            if(a==i) //if the sum is equal to the term number, then it is an Armstrong number
                System.out.print(i+" ");
                a=0; //reset a and pow for the next term number
                pow=0;
        }
        sc.close();
    }
}