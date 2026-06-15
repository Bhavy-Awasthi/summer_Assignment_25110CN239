import java.util.*;

class P57_reverse_array {
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
        System.out.println("The reversed array is:");
        for (int i = n - 1; i >= 0; i--) // loop to print the elements of the array in reverse order
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}