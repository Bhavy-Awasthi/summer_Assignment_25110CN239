import java.util.*;

 class P120_mini_project_Task_Manager
 {

    // 1. Arrays and variables declared at the class level
    // This allows all functions in the class to access and modify them.
    static int MAX_TASKS = 50;
    static String taskNames[] = new String[MAX_TASKS];
    static String taskStatus[] = new String[MAX_TASKS];
    static int taskCount = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main()
     {  P120_mini_project_Task_Manager ob= new P120_mini_project_Task_Manager();
        System.out.println(" Welcome to the Task Manager ");//
        boolean isRunning = true;

        // Main loop is now much cleaner because logic is hidden inside functions
        while (isRunning) 
        {
            ob.displayMenu();
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the hidden newline character

            if (choice == 1)
            {
                ob.addTask();
            } 
            else if (choice == 2)
            {
                ob.viewTasks();
            } 
            else if (choice == 3) 
            {
                ob.markTaskComplete();
            } 
            else if (choice == 4) 
            {
                System.out.println("Exiting Task Manager. Have a productive day!");
                isRunning = false;
            } 
            else 
            {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }

    

   
     // Function to display the user menu

     void displayMenu() 
     {
        System.out.println("Main Menu:");
        System.out.println("1. Add a New Task");
        System.out.println("2. View All Tasks");
        System.out.println("3. Mark a Task as Complete");
        System.out.println("4. Exit");
    }

   // Function to add a task to the String arrays
     
     void addTask()
      {
        if (taskCount < MAX_TASKS) 
        {
            System.out.print("Enter the task description: ");
            String newTask = sc.nextLine();

            taskNames[taskCount] = newTask;
            taskStatus[taskCount] = "Pending"; // Default status using Strings
            taskCount++;

            System.out.println("Success: Task added!");
        } 
        else 
        {
            System.out.println("Error: Task list is full!");
        }
    }

   // Function to iterate through the arrays and display data
   
     void viewTasks() 
    {
        if (taskCount == 0) 
        {
            System.out.println("Your task list is empty.");
            return; // Exits the function early
        }

        System.out.println(" Your Tasks ");
        for (int i = 0; i < taskCount; i++)
         {
            // Adding 1 to 'i' so the list displays as 1, 2, 3 instead of 0, 1, 2
            System.out.println((i + 1) + ". " + taskNames[i] + " [" + taskStatus[i] + "]");
        }
       
    }

    // Function to update a string in the array based on user input
     
     void markTaskComplete() 
     {
        if (taskCount == 0) 
        {
            System.out.println("No tasks available to complete.");
            return;
        }

        viewTasks(); // Reusing the view function to show tasks before selection
        System.out.print("Enter the task number you have completed: ");
        int taskNumber = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Validate the user's input to prevent ArrayOutOfBounds exceptions
        if (taskNumber > 0 && taskNumber <= taskCount) {
            int arrayIndex = taskNumber - 1; // Convert display number back to array index
            
            // Check if it's already completed using String's .equals() method
            if (taskStatus[arrayIndex].equals("Completed")) 
            {
                System.out.println("This task is already completed!");
            } 
            else 
            {
                taskStatus[arrayIndex] = "Completed";
                System.out.println("Awesome! Task '" + taskNames[arrayIndex] + "' marked as complete.");
            }
        } 
        
        else {
            System.out.println("Error: Invalid task number.");
        }
    }
}