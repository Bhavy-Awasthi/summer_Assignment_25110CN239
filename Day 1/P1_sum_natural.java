import java.util.*;

public class P1_sum_natural {
    public static void main() {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the sum of natural numbers : ");
        n = sc.nextInt();
        sum = (n * (n + 1)) / 2;
        System.out.println("The sum of first " + n + " natural numbers is : " + sum);
        sc.close();
    }

}
