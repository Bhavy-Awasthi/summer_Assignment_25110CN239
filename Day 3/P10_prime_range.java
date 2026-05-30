import java.util.*;

class P9_prime_range {

    public static void main()

    {
        int n1, n2, i, j, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number : ");
        n1 = sc.nextInt();
        System.out.println("Enter the ending number : ");
        n2 = sc.nextInt();
        for (i = n1; i <= n2; i++) 
        {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println(i + " is a prime number .");
            }
        }
        sc.close();
    }
}