import java.util.*;

class P45_palindrome_function {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is a palindrome : ");
        int n = sc.nextInt(); // taking input of the number to check if it is a palindrome
        P45_palindrome_function ob = new P45_palindrome_function(); // creating an object of the class to call the
                                                                    // palindrome function
        int result = ob.isPalindrome(n); // calling the palindrome function and storing the result in a variable
        if (result == 1) // if the result is 1 then the number is a palindrome
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome.");
        sc.close();
    }

    int isPalindrome(int x) {
        int original = x; // storing the original number in a variable
        int reverse = 0; // initializing the reverse variable to 0
        while (x > 0) // loop to reverse the number
        {
            int digit = x % 10; // getting the last digit of the number
            reverse = reverse * 10 + digit; // adding the last digit to the reverse variable
            x = x / 10; // removing the last digit from the number
        }
        if (original == reverse) // if the original number is equal to the reverse then it is a palindrome
            return 1;
        else
            return 0;
    }
}