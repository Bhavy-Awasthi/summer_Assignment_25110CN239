import java.util.*;
class P64_remove_duplicates
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt(); //taking input of the size of the array
        int arr[] = new int[n]; //declaring an array of size n
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++) //loop to take input of the elements of the array
        {
            arr[i] = sc.nextInt();
        }
        int temp[] = new int[n];
        int j=0;
        for(int i=0; i<n; i++)
        {
            int isDuplicate = 0; //variable to check if the current element is a duplicate
            for(int k=0; k<j; k++)
            {
                if(arr[i] == temp[k]) //if the current element is equal to any of the elements in the temp array
                {
                    isDuplicate = 1; //set isDuplicate to 1 if the current element is a duplicate
                    break; //break the loop if a duplicate element is found
                }
            }
            if(isDuplicate == 0) //if the current element is not a duplicate
            {
                temp[j] = arr[i]; //add the current element to the temp array
                j++; //increment j
            }
        }
        System.out.println("Array after removing duplicates:");
        for(int i=0; i<j; i++)
        {
            System.out.print(temp[i] + " ");
        }
        sc.close();
    }
}