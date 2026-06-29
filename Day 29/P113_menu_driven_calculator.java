import java.util.*;

class P113_menu_driven_calculator {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println((float) a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }

}