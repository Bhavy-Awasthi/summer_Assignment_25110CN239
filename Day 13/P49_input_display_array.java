import java.util.*;

class P49_input_display_array {
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
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) // loop to display the elements of the array
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}