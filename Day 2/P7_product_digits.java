import java.util.*;

class P7_product_digits {
    public static void main() {
        int n, d, p = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while (n > 0) {
            d = n % 10;
            p = p * d;
            n = n / 10;
        }
        System.out.println("The product of the digits is " + p);
        sc.close();
    }
}
