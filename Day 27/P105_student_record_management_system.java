import java.util.*;

class P105_student_record_management_system
 {
    public static void main()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt(); // taking input of the number of students
        String name[] = new String[n]; // creating an array for name
        int roll_no[] = new int[n]; // creating an array for roll no
        float marks[] = new float[n];// creating an array for marks
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter the name of student " + (i + 1) + " : ");
            name[i] = sc.next();
            System.out.println("Enter the roll no of student " + (i + 1) + " : ");
            roll_no[i] = sc.nextInt();
            System.out.println("Enter the marks of student " + (i + 1) + " : ");
            marks[i] = sc.nextFloat();
        }
        for (int i = 0; i < n; i++)
         {
            System.out.println("Name of student " + (i + 1) + " : " + name[i]);
            System.out.println("Roll no of student " + (i + 1) + " : " + roll_no[i]);
            System.out.println("Marks of student " + (i + 1) + " : " + marks[i]);
        }
        sc.close();
    }
}