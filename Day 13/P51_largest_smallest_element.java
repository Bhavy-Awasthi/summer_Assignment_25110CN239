import java.util.*;

class P51_largest_smallest_element {
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
        int largest = arr[0]; // variable to store the largest element
        int smallest = arr[0]; // variable to store the smallest element
        for (int i = 1; i < n; i++) // loop to find the largest and smallest element
        {
            if (arr[i] > largest) // if the current element is greater than the largest element
            {
                largest = arr[i]; // update the largest element
            }
            if (arr[i] < smallest) // if the current element is smaller than the smallest element
            {
                smallest = arr[i]; // update the smallest element
            }
        }
        System.out.println("The largest element in the array is: " + largest);
        System.out.println("The smallest element in the array is: " + smallest);
        sc.close();
    }
}