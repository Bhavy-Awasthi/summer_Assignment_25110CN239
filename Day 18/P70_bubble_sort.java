import java.util.*;
class P70_bubble_sort
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n]; //declaring the array of size n
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort logic
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    // Swapping elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("The sorted array is:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

} 
    
