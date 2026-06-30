import java.util.*;

class P119_mini_employee_management_system
 {
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n=sc.nextInt(); //taking input of the number of employees
        String name[]=new String[n]; //creating an array for name
        int id[]=new int[n]; //creating an array for id
        float salary[]=new float[n]; //creating an array for salary
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of employee "+(i+1)+":");
            name[i]=sc.next();
            System.out.println("Enter the id of employee "+(i+1)+":");
            id[i]=sc.nextInt();
            System.out.println("Enter the salary of employee "+(i+1)+":");
            salary[i]=sc.nextFloat();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Name of employee "+(i+1)+": "+name[i]);
            System.out.println("Id of employee "+(i+1)+": "+id[i]);
            System.out.println("Salary of employee "+(i+1)+": "+salary[i]);
        }
        sc.close();
    }
}