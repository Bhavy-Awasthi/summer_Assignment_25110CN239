import java.util.*;
class P38_reverse_pyramid {
   public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--) //outer loop for rows
        {
             for(int j=1;j<=n-i;j++) //inner loop for spaces
            {
                System.out.print(" ");
            }
             for(int k=1;k<=i;k++) //inner loop for stars
            {
                System.out.print("*");
            }
            for(int l=1;l<i;l++) //inner loop for stars
            {
                System.out.print("*");
            }
            System.out.println(); //new line after each row
        }
        sc.close();
    }
}