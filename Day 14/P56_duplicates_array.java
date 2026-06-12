import java.util.*;

class P56_duplicates_array {
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
        boolean visit[] = new boolean[n]; // boolean array to keep track of visited elements
        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < n; i++) // loop to find duplicate elements in the array
        {
            if (visit[i] == true) // if the current element is already visited, skip it
            {
                continue;
            }
            int count = 1; // variable to count the frequency of the current element
            for (int j = i + 1; j < n; j++) // loop to compare the current element with the rest of the elements in the
                                            // array
            {
                if (arr[i] == arr[j]) // if a duplicate element is found
                {
                    visit[j] = true; // mark the duplicate element as visited
                    count++; // increment count if a duplicate element is found
                }
            }
            if (count > 1) // if the frequency of the current element is greater than 1, print it as a
                           // duplicate element
            {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}