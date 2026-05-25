import java.util.*;

class P3_factorial {
    public static void main() {
        int n, i, f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is required ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("The factorial of " + n + " is " + f);
        sc.close();
    }
}