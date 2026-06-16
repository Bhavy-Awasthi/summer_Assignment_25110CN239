import java.util.*;
class P63_pair_with_given_sum
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
        System.out.println("Enter the sum to find pairs:");
        int s = sc.nextInt(); //taking input of the sum to find pairs
        System.out.println("Pairs with given sum " + s + ":");
        int f=0; //variable to check if any pair is found
        for(int i=0; i<n; i++) //loop to find pairs with given sum
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i] + arr[j] == s) //if the sum of the current pair is equal to the given sum, print the pair
                {
                    System.out.println(arr[i] + " and " + arr[j]);
                    f=1; //set f to 1 if a pair is found
                }
            }
        }
        if(f==0)
        {
            System.out.println("No pairs found with the given sum.");
        }
        sc.close();
    }
}