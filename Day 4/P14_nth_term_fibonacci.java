import java.util.*;
class P14_nth_term_fibonacci {
    public static void main()
     {
        int n, a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term number : ");
        n = sc.nextInt(); //term number in the fibonacci series
        for (int i = 1; i < n; i++) //for nth term in fibonacci series we need to run the loop n-1 times
        {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("The " + n + "th term in the Fibonacci Series is : " + a);
        sc.close(); 
    }
}