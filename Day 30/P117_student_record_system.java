import java.util.Scanner;

public class P117_student_record_system
 {
    public static void main()
     {
        Scanner sc = new Scanner(System.in);

        // Arrays to store student data (Maximum 100 students)
        int maxStudents = 100;
        String ids[] = new String[maxStudents];
        String names[] = new String[maxStudents];
        double marks[] = new double[maxStudents];

        // Counter to track the current number of saved records
        int count = 0; 
        boolean isRunning = true;

        System.out.println(" Welcome to the Student Record System ");

        // Main application loop
        while (isRunning) 
        {
            System.out.println("Menu Options:");
            System.out.println("1. Add a Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) 
            {
                // ADD STUDENT
                if (count < maxStudents)
                 {
                    System.out.print("Enter Student ID: ");
                    ids[count] = sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    names[count] = sc.nextLine();

                    System.out.print("Enter Student Marks: ");
                    marks[count] = sc.nextDouble();
                    sc.nextLine(); // Consume newline

                    count++; // Move to the next index for the next student
                    System.out.println("Success: Student added!");
                } else 
                {
                    System.out.println("Error: System capacity reached. Cannot add more students.");
                }

            } else if (choice == 2) 
            {
                // VIEW ALL STUDENTS
                if (count == 0) 
                {
                    System.out.println("No records found. Please add a student first.");
                } 
                else 
                {
                    System.out.println(" Current Student Records ");
                    for (int i = 0; i < count; i++) {
                        System.out.println("ID: " + ids[i] + " | Name: " + names[i] + " | Marks: " + marks[i]);
                    }
                }

            } else if (choice == 3) 
            {
                // SEARCH STUDENT
                System.out.print("Enter Student ID to search: ");
                String searchId = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < count; i++)
                 {
                    // Using String's .equals() to compare text
                    if (ids[i].equals(searchId)) {
                        System.out.println("Student Found!");
                        System.out.println("ID: " + ids[i] + " | Name: " + names[i] + " | Marks: " + marks[i]);
                        found = true;
                        break; // Stop searching once found
                    }
                }

                if (!found) {
                    System.out.println("Error: Student with ID '" + searchId + "' not found.");
                }

            } else if (choice == 4) {
                // EXIT
                System.out.println("Exiting the system. Goodbye!");
                isRunning = false;

            } else {
                // INVALID INPUT
                System.out.println("Invalid choice! Please select a number between 1 and 4.");
            }
        }
        
        sc.close();
    }
}