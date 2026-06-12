import java.util.*;

class P54_frequency_element {
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
        System.out.println("Enter the element to find its frequency:");
        int s = sc.nextInt(); //  taking input of the element to find its frequency
        int count = 0; // variable to count the frequency of the element in the array
        for (int i = 0; i < n; i++) // loop to count the frequency of the element in the array
        {
            if (arr[i] == s) // if the current element is equal to the element to find its frequency
            {
                count++; // increment count if the element is found
            }
        }
        System.out.println("Frequency of " + s + " in the array: " + count);
        sc.close();
    }
}