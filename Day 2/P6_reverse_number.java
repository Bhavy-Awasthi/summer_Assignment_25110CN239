import java.util.*;

class P6_reverse_number {
    public static void main() {
        int n, r, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed ");
        n = sc.nextInt();
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println("The reversed number is " + rev);
        sc.close();
    }

}