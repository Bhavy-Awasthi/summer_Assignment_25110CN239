import java.util.*;
class P55_second_largest
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt(); //taking input of the size of the array
        int[] arr = new int[n]; //declaring an array of size n
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++) //loop to take input of the elements of the array
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1]) //if the current element is greater than the next element
                {
                    int temp = arr[j]; //swap the elements
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The second largest element in the array is: " + arr[n-2]);
        sc.close();
    }
}