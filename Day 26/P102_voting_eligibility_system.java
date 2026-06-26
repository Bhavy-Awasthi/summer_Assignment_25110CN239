import java.util.*;

class P102_voting_eligibility_system {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt(); // taking input of the age
        if (age >= 18) // checking if the age is greater than or equal to 18
        {
            System.out.println("You are eligible for voting");
        } else // if the age is less than 18
        {
            System.out.println("You are not eligible for voting");
        }
        sc.close();
    }
}