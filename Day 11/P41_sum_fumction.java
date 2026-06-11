import java.util.*;

class P41_sum_function {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements to be added : ");
        int a = sc.nextInt(); // taking input of the first number
        int b = sc.nextInt(); // taking input of the second number
        P41_sum_function ob = new P41_sum_function(); // creating an object of the class to call the sum function
        int result = ob.sum(a, b); // calling the sum function and storing the result in a variable
        System.out.println("The sum of the two numbers is : " + result);
        sc.close();
    }

    int sum(int x, int y) {
        return x + y; // returning the sum of the two numbers
    }
}