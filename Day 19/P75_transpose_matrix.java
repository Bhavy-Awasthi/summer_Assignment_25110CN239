import java.util.*;
class transpose_matrix
{    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        int r = sc.nextInt(); //rows
        int c = sc.nextInt(); //columns

        int matrix[][] = new int[r][c];
        int transpose[][] = new int[c][r];

        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Transposing the matrix
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("The transpose of the matrix is:");
        for(int i = 0; i < c; i++)
        {
            for(int j = 0; j < r; j++)
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}