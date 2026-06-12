import java.util.*;

class P50_sum_average_array {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt(); // taking input of the size of the array
        int arr[] = new int[n]; // declaring an array of size n
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) // loop to take input of the elements of the array
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0; // variable to store the sum of the elements
        for (int i = 0; i < n; i++) // loop to calculate the sum of the elements
        {
            sum += arr[i];
        }
        double average = (double) sum / n; // calculating the average
        System.out.println("The sum of the elements is: " + sum);
        System.out.println("The average of the elements is: " + average);
        sc.close();
    }
}