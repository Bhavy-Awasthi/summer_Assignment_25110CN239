import java.util.*;
class P31_character_triangle{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) //outer loop for rows
        { char ch='A';
             for(int j=1;j<=i;j++) //inner loop for columns
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}