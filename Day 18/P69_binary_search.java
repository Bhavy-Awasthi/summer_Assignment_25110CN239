import java.util.*;
class P69_binary_search
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt(); //size of array
        int arr[] = new int[n]; //array declaration

        System.out.println("Enter the elements of the array (in sorted order):");
        for(int i=0; i<n; i++) //array input
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search for:");
        int target = sc.nextInt(); //element to search for
        //binary search
       int beg=0; 
       int end=n-1;
       int mid=(beg+end)/2;
       while(beg<=end&&arr[mid]!=target)
       {
        mid=(beg+end)/2;
        if(target>arr[mid])
        {
            beg=mid+1;
        }
        else
        {
            end=mid-1;
        }
       }
       if(arr[mid]==target) //check if element is found
       {
        System.out.println("The element is found at position: " + (mid+1));
       }
       else //if element is not found
       {
        System.out.println("The element is not found in the array.");
       }
       sc.close();
    }

}