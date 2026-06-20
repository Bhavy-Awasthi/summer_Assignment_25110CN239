import java.util.*;
class P78_check_symmetric_matrix
{
    public static void main()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
       // Check if the matrix is symmetric
        boolean isSymmetric = true;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) // Check if the matrix is not symmetric
                 {
                    isSymmetric = false; // If not symmetric, set isSymmetric to false 
                    break;
                }
            }
            if (isSymmetric==false)
             break;
        }

        if (isSymmetric) // If the matrix is symmetric
         {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
        sc.close();
    }

}