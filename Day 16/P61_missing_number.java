import java.util.*;

class P61_missing_number {
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
        int a = 1;
        for (int i = 0; i < n; i++) // loop to calculate the sum of the elements of the array
        {
            if (a != arr[i]) {
                System.out.println("The missing number is: " + a);
                break;
            }
            a++;
        }
        sc.close();
    }
}