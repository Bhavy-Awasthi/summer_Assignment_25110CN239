import java.util.*;

class table {
    public static void main() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print its table");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
        sc.close();
    }
}