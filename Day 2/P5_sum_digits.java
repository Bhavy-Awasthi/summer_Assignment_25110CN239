import java.util.*;

class P5_sum_digits {
    public static void main() {
        int n, sum = 0, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose sum of digits is required ");
        n = sc.nextInt();
        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println("The sum of digits is " + sum);
        sc.close();
    }

}
