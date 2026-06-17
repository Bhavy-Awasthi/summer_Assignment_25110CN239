import java.util.*;
class P67_intersection_array
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
        boolean ispresent1[] = new boolean[n1]; //declaring a boolean array to check if the elements of the first array are present in the first array
      int intersectionArray[] = new int[Math.min(n1, n2)]; //declaring an intersection array of size min(n1,n2)
        int k = 0; //index for intersection array
        for(int i=0; i<n1; i++) //loop to check if the elements of the first array are present in the second array
        {
            if(ispresent1[i] == true) //if the element is already present in the intersection array
            {
                continue; //skip the element
            }
            for(int j=0; j<n1; j++) //loop to check if the element of the first array is present in the second array
            {
                if(arr1[i] == arr1[j]) //if the element is present in the second array
                {
                    ispresent1[j] = true; //set the flag to true
                }
              }
           
                for(int j=0; j<n2; j++)
                { 
                      if(arr1[i] == arr2[j]) //if the element is present in the second array
                    {
                      intersectionArray[k] = arr1[i]; //copy the element to the intersection array 
                      k++;
                     break;
                    }
            }     
              
        }
        System.out.println("The intersection of the two arrays is:");
        for(int i=0; i<k; i++) //loop to print the elements of the intersection array
        {
            System.out.print(intersectionArray[i] + " ");
        }
        sc.close(); //closing the scanner object
    
    }
}