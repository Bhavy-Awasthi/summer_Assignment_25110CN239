import java.util.*;

class P11_gcd {
    public static void main() {
        int n1, n2, gcd = 1;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number : ");
        n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        n2 = sc.nextInt();
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is : " + gcd);
        sc.close();
    }
}