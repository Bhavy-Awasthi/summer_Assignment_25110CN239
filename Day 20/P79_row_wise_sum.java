import java.util.*;
class P79_row_wise_sum
{
    public static void main()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        int r = sc.nextInt(); //  the number of rows
        int c = sc.nextInt(); // the number of columns
        int matrix[][] = new int[r][c];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Row-wise sum of the matrix:"); // Print the row-wise sum of the matrix
        for (int i = 0; i < r; i++) 
        {
            int rowSum = 0; // Initialize the sum of the current row to 0
            for (int j = 0; j < c; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }
        sc.close();
    }

}