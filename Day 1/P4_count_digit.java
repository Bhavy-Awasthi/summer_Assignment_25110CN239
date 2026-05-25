import java.util.*;

class P4_count_digit {
    public static void main() {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count its digits : ");
        n = sc.nextInt();
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println("The total number of digits are : " + count);
        sc.close();
    }
}