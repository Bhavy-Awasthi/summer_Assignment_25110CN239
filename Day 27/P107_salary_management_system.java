import java.util.*;
class P107_salary_management_system
{
    public static void main()
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of employees:");
    int n= sc.nextInt(); //taking input of the number of employees
    int salary[]=new int[n];
    for(int i=0;i<n;i++) //loop to take input of the salary
    {
        System.out.println("Enter the salary of employee "+(i+1)+":");
        salary[i]=sc.nextInt();
    }
    System.out.println("Enter the employee number whos salary you want to know:");
    int e=sc.nextInt();
    if(e<1||e>n)
    {
        System.out.println("Invalid employee number");
    }
    for(int i=0;i<n;i++) //loop to print the salary
    {
        if(e==i+1)
    {
        System.out.println("Salary of employee "+(i+1)+": "+salary[i]);
        break;
    }
} sc.close();
    }
}