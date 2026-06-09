import java.util.*;
class P34_reverse_number_triangle{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--) //outer loop for rows
        {
             for(int j=1;j<=i;j++) //inner loop for columns
            {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}