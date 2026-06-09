import java.util.*;
class P36_hollow_square
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) //outer loop for rows
        {
             for(int j=1;j<=n;j++) //inner loop for columns
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
             
            }
            System.out.println();
        }
        sc.close();
    }
}