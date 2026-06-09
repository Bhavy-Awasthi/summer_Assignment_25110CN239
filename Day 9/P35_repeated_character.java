import java.util.*;
class P35_repeated_character{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int n = sc.nextInt();
        char ch='A'; //initializing character variable with 'A'
        for(int i=1;i<=n;i++) //outer loop for rows
        {
             for(int j=1;j<=i;j++) //inner loop for columns
            {
                System.out.print(ch);
             
            }ch++;
            System.out.println();
        }
        sc.close();
    }
}