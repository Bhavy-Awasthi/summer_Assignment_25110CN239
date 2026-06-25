import java.util.*;

class P97_merge_two_sorted_array {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array1:");
        int n = sc.nextInt(); // taking input of the size of the array
        int arr1[] = new int[n];
        System.out.println("Enter the elements of the array1:");
        for (int i = 0; i < n; i++) // loop to take input of the elements of the array
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the array2:");
        int m = sc.nextInt(); // taking input of the size of the array
        int arr2[] = new int[m];
        System.out.println("Enter the elements of the array2:");
        for (int i = 0; i < m; i++) // loop to take input of the elements of the array
        {
            arr2[i] = sc.nextInt();
        }
        int arr3[] = new int[n + m]; // declaring an array of size n+m
        // bubbling sort
        for (int i = 0; i < n - 1; i++) // loop to sort the array
        {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < m - 1; i++) // loop to sort the array
        {
            for (int j = 0; j < m - i - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }
        int k = 0;
        for (int i = 0; i < n; i++) // loop to merge the arrays
        {
            arr3[k++] = arr1[i];
        }
        for (int i = 0; i < m; i++) {
            arr3[k++] = arr2[i];
        }
        for (int i = 0; i < n + m; i++) // loop to print the merged array
        {
            System.out.print(arr3[i] + " ");
        }
        sc.close();
    }
}