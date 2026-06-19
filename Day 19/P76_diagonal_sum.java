import java.util.*;
class P76_diagonal_sum
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix (n x n):");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        System.out.println("Enter the elements of the matrix:"); // taking input of the matrix
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        int principalDiagonalSum = 0; //sum of the principal diagonal
        int secondaryDiagonalSum = 0; //sum of the secondary diagonal


        for(int i = 0; i < n; i++) // calculating the sum of the principal and secondary diagonal
        {
            principalDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }
           // printing the sum of the principal and secondary diagonal
        System.out.println("Sum of the principal diagonal: " + principalDiagonalSum);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
        
        sc.close();
    }

}