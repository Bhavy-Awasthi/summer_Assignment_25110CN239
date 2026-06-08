import java.util.*;
class P32_repeated_number{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) //outer loop for rows
        {
             for(int j=1;j<=i;j++) //inner loop for columns
            {
                System.out.print(i);
             
            }
            System.out.println();
        }
        sc.close();
    }
}