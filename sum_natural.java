import java.util.*;

class sum_natural {
    public static void main() {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers to be added");
        n = sc.nextInt();
        sum = (n * (n + 1)) / 2;
        System.out.println("The sum of first " + n + " natural numbers is " + sum);
        sc.close();
    }
}