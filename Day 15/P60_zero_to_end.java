import java.util.*;
class P60_zero_to_end
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
        System.out.println("The array with zeros moved to the end is:");
        for(int i=0; i<n; i++) //loop to print the non-zero elements of the array
        {
            if(arr[i] != 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
        for(int i=0; i<n; i++) //loop to print the zero elements of the array
        {
            if(arr[i] == 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}