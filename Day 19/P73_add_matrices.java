import java.util.*;
class add_matrices
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrices:");
        int r = sc.nextInt(); //rows
        int c = sc.nextInt(); //columns

        int matrix1[][] = new int[r][c]; 
        int matrix2[][] = new int[r][c];
        int sum[][] = new int[r][c];

        System.out.println("Enter the elements of the first matrix:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Adding the matrices
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j]; // storing sum of matrix 1 and matrix 2 in sum
            }
        }

        System.out.println("The sum of the matrices is:"); // printing the sum of the matrices
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}