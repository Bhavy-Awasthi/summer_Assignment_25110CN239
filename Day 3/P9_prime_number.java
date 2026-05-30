import java.util.*;

class P9_prime_number {
    public static void main() {
        int n, i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2)
            System.out.println(n + "  is a prime number..");
        else
            System.out.println(n + " is not a prime number..");
        sc.close();
    }
}
