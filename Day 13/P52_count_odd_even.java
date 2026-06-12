import java.util.*;

class P52_count_odd_even {
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
        int oddCount = 0; // variable to count the number of odd elements
        int evenCount = 0; // variable to count the number of even elements
        for (int i = 0; i < n; i++) // loop to count the number of odd and even elements
        {
            if (arr[i] % 2 == 0) // if the current element is even
            {
                evenCount++; // increment the even count
            } else // if the current element is odd
            {
                oddCount++; // increment the odd count
            }
        }
        System.out.println("The number of odd elements in the array is: " + oddCount);
        System.out.println("The number of even elements in the array is: " + evenCount);
        sc.close();
    }
}