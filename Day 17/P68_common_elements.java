import java.util.*;
class P68_common_elements
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int n1 = sc.nextInt(); //taking input of the size of the first array
        int arr1[] = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for(int i=0; i<n1; i++) //loop to take input of the elements of the first array
        {
            arr1[i] = sc.nextInt(); //taking input of the elements of the first array
        }
        System.out.println("Enter the size of the second array:");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2]; //declaring the second array of size n2
        System.out.println("Enter the elements of the second array:");
        for(int i=0; i<n2; i++)
        {
            arr2[i] = sc.nextInt(); //taking input of the elements of the second array
        }

        System.out.println("Common elements are:");
        boolean ispresent1[] = new boolean[n1]; //declaring a boolean array to check if the elements of the first array are present in the first array
        
        for(int i=0; i<n1; i++)
        {
            if(ispresent1[i]) //if the element is already present in the first array
            {
                continue; //skip the element
            }
            for(int j=i+1; j<n1; j++) 
            {
                if(arr1[i] == arr1[j])
                {
                    ispresent1[j] = true; //set the flag to true
                }
            }
            for(int j=0; j<n2; j++)
            {
                if(arr1[i] == arr2[j]) //if the element is present in the second array
                {
                    System.out.print(arr1[i] + " "); //print the element
                    break;
                }
            }
        }
        sc.close(); 
    }

}
