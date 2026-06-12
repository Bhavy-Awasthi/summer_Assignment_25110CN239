import java.util.*;

class P53_linear_search {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt(); // taking input of the size of the array
        int arr[] = new int[n]; // declaring an array of size n
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) //  loop to take input of the elements of the array
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int s = sc.nextInt(); // taking input of the element to be searched
        int found = 0; // variable to check if the element is found or not
        int position = -1; // variable to store the position of the element in the array
        for (int i = 0; i < n; i++) // loop to search for the element in the array
        {
            if (arr[i] == s) // if the current element is equal to the element to be searched
            {
                found = 1; // set found to 1 if the element is found
                position = i + 1; // store the position of the element in the array
                break; // break the loop if the element is found
            }
        }
        if (found == 1) // if the element is found
        {
            System.out.println("Element found in the array.");
            System.out.println("Position of the element in the array: " + position);
        } else // if the element is not found
        {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}