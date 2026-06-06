import java.util.*;

class P21_decimal_to_binary {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int n = sc.nextInt();
        int binary = 0; // variable to store the binary equivalent of the decimal number
        int i = 1;
        while (n > 0) // while loop is used to convert the decimal number to binary number
        {
            int rem = n % 2;
            binary = binary + rem * i;
            n = n / 2;
            i = i * 10;
        }
        System.out.println("Binary equivalent is:" + binary);
        sc.close();
    }
}