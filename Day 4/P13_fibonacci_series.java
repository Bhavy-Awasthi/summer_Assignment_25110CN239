import java.util.*;
class P13_fibonacci_series {
    public static void main()
     {
        int n, a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        n = sc.nextInt(); //number of terms in the fibonacci series
        System.out.print("Fibonacci Series : ");
        for (int i = 1; i <= n; i++) //for fibonacci series, we need to run the loop n times
        {
            System.out.print(a + " "); //print the current term
            c = a + b;
            a = b;
            b = c;
        }
        sc.close(); 
    }
}