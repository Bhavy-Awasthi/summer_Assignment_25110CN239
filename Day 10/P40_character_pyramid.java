import java.util.*;
class character_pyramid
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) //outer loop for rows
        { char a='A'; int b=i-1;
             for(int j=1;j<=n-i;j++) //inner loop for spaces
            {
                System.out.print(" ");
            }
             for(int k=1;k<=i;k++) //inner loop for stars
            {
                System.out.print(a);
                a++;
            }
            for(int l=1;l<i;l++) //inner loop for stars
            {
                System.out.print((char)(b + 64));
                b--;
            }
            System.out.println(); //new line after each row
        }
        sc.close();
    }
}