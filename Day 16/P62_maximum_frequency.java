import java.util.*;
class P6_maximum_frequency
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
        int max_freq = 0; //variable to store the maximum frequency
        int num = 0; //variable to store the number with maximum frequency
        for(int i=0; i<n; i++) //loop to calculate the frequency of each element in the array
        { int freq=0; //variable to store the frequency of the current element
            for(int j=0; j<n; j++)
            {
                if(arr[i] == arr[j]) //if the current element is equal to the element at index j, increment the frequency
                {
                    freq++;
                }
            }
            if(freq > max_freq) //if the frequency of the current element is greater than the maximum frequency, update the maximum frequency and the number with maximum frequency
            {
                max_freq = freq;
                num = arr[i];
            }
        }
        System.out.println("The number with maximum frequency is: " + num + " and its frequency is: " + max_freq);
        sc.close();
    }
}