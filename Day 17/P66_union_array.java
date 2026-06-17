import java.util.*;
class P66_union_array
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
        int unionArray[] = new int[n1 + n2]; //declaring a union array of size n1+n2
        int k = 0; //index for union array
        for(int i=0; i<n1; i++) //loop to copy elements from the first array to union array
        {
            unionArray[k++] = arr1[i];
        }
        for(int i=0; i<n2; i++) //loop to copy elements from the second array to union array
        {
            int isPresent = 0; //flag to check if the element is already present in the union array
            for(int j=0; j<k; j++) //loop to check if the element is already present in the union array
            {
                if(arr2[i] == unionArray[j]) //if the element is already present
                {
                    isPresent = 1; //set the flag to 1
                    break; //break the loop
                }
            }
            if(isPresent == 0) //if the element is not present in the union array
            {
                unionArray[k++] = arr2[i]; //copy the element to the union array
            }
        }
        System.out.println("The union of the two arrays is:");
        for(int i=0; i<k; i++) //loop to print the elements of the union array
        {
            System.out.print(unionArray[i] + " ");
        }
        sc.close();
    }
}