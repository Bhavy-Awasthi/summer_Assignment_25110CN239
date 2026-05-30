import java.util.*;

class P12_lcm
{

    public static void main() {
        int n1, n2, lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        n2 = sc.nextInt();
        int i = Math.max(n1, n2);
        while (true) {
            if (i % n1 == 0 && i % n2 == 0) {
                lcm = i;
                break;
            }
             i++;
        }
        System.out.println("LCM of " + n1 + " and " + n2 + " is : " + lcm);
        sc.close();
    }
}