import java.util.*;

class P8_palindrome_number {
    public static void main() {
        int n, d, n1, r = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        n1 = n;
        while (n > 0) {
            d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        if (n1 == r) 
        {
            System.out.println(n1 + " is a palindrome number.");
        } else
         {
            System.out.println(n1 + " is not a palindrome number.");
            sc.close();
        }
    }
}