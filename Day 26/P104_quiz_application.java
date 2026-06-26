import java.util.*;
class P104_quiz_application
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int score=0;
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Enter your gender");
        String gender=sc.next();
        System.out.println("Lets start the quiz");
        System.out.println("1. What is the capital of India?");
        System.out.println("a. Delhi");
        System.out.println("b. Mumbai");
        System.out.println("c. Chennai");
        System.out.println("d. Kolkata");
        System.out.println("Enter your answer");
        String ans1=sc.next();
        if(ans1.equals("a"))
        {
            score++;
        }
        else
        {
            System.out.println("Its a wrong answer \n The correct answer is Delhi");
        }
        System.out.println("2. What is the capital of Uttar Pradesh?");
        System.out.println("a. Delhi");
        System.out.println("b. Mumbai");
        System.out.println("c. Chennai");
        System.out.println("d. Lucknow");
        System.out.println("Enter your answer");
        String ans2=sc.next();
        if(ans2.equals("d"))
        {
            score++;
        }
        else
        {
            System.out.println("Its a wrong answer \n The correct answer is Lucknow");
        }
        System.out.println("3. What is the capital of Maharashtra?");
        System.out.println("a. Delhi");
        System.out.println("b. Mumbai");
        System.out.println("c. Chennai");
        System.out.println("d. Pune");
        System.out.println("Enter your answer");
        String ans3=sc.next();
        if(ans3.equals("b"))
        {
            score++;
        }
        else
        {
            System.out.println("Its a wrong answer \n The correct answer is Mumbai");
        }
        System.out.println("Your score is "+score+" out of 3");
        sc.close();
    }
}
        