import java.util.*;

class P59_rotate_array_right {
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
        System.out.println("Enter the number of positions to rotate:");
        int d = sc.nextInt(); // taking input of the number of positions to rotate
        System.out.println("The rotated array is:");
        for (int i = n - d; i < n; i++) // loop to print the elements of the array from index n-d to n-1
        {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n - d; i++) // loop to print the elements of the array from index 0 to n-d-1
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
