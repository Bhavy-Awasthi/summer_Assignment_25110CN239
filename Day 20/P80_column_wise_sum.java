import java.util.*;
class P80_column_wise_sum
{
    public static void main()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        int r = sc.nextInt(); // the number of rows
        int c = sc.nextInt(); // the number of columns
        int matrix[][] = new int[r][c];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Column-wise sum of the matrix:"); // Print the column-wise sum of the matrix
        for (int j = 0; j < c; j++) 
        {
            int colSum = 0; // Initialize the sum of the current column to 0
            for (int i = 0; i < r; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }
        sc.close();
    }

}