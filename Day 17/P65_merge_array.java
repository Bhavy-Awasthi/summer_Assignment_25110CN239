import java.util.*;
class P65_merge_array
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int n1 = sc.nextInt(); //taking input of the size of the first array
        int arr1[] = new int[n1]; //declaring the first array of size n1
        System.out.println("Enter the elements of the first array:");
        for(int i=0; i<n1; i++) //loop to take input of the elements of the first array
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array:");
        int n2 = sc.nextInt(); //taking input of the size of the second array
        int arr2[] = new int[n2]; //declaring the second array of size n2
        System.out.println("Enter the elements of the second array:");
        for(int i=0; i<n2; i++) //loop to take input of the elements of the second array
        {
            arr2[i] = sc.nextInt();
        }
        int mergedArray[] = new int[n1 + n2]; //declaring a merged array of size n1+n2
        for(int i=0; i<n1; i++) //loop to copy elements from the first array to merged array
        {
            mergedArray[i] = arr1[i];
        }
        for(int i=0; i<n2; i++) //loop to copy elements from the second array to merged array
        {
            mergedArray[n1 + i] = arr2[i];
        }
        System.out.println("The merged array is:");
        for(int i=0; i<(n1+n2); i++) //loop to print the merged array
        {
            System.out.print(mergedArray[i] + " ");
        }
        sc.close();
    }
}