import java.util.*;

class P93_check_string_rotation
 {

    public static void main()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = s1 + s1; // concatenating s1 with itself
        if (s3.contains(s2)&&s1.length()==s2.length()) // checking if s2 is a substring of s3
        {
            System.out.println("The string is rotated");
        }
        else 
        {
            System.out.println("The string is not rotated");
        }
    }
}