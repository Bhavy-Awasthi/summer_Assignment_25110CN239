import java.util.*;

class P91_anagram_string 
{
    public static void main()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1:");
        String s1 = sc.nextLine();
        System.out.println("Enter the string2:");
        String s2 = sc.nextLine();
        char ch1[] = new char[s1.length()]; // converting string to char array
        char ch2[] = new char[s2.length()]; // converting string to char array
        for (int i = 0; i < s1.length(); i++) 
        {
            ch1[i] = s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) 
        {
            ch2[i] = s2.charAt(i);
        }
        // bubble sort
        for (int i = 0; i < ch1.length; i++) 
        {
            for (int j = 0; j < ch1.length - i - 1; j++) {
                if (ch1[j] > ch1[j + 1]) 
                {
                    char temp = ch1[j];
                    ch1[j] = ch1[j + 1];
                    ch1[j + 1] = temp;
                }
            }
        }
        // bubble sort
        for (int i = 0; i < ch2.length; i++) 
        {
            for (int j = 0; j < ch2.length - i - 1; j++) 
            {
                if (ch2[j] > ch2[j + 1])
                 {
                    char temp = ch2[j];
                    ch2[j] = ch2[j + 1];
                    ch2[j + 1] = temp;
                }
            }

        }
        int flag = 0; // flag to check if the strings are anagram
        for (int i = 0; i < ch1.length; i++) 
        {
            if (ch1[i] != ch2[i]) 
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0) // if the strings are anagram
        {
            System.out.println("The strings are anagram.");
        } else // if the strings are not anagram
        {
            System.out.println("The strings are not anagram.");
        }
        sc.close();
    }
}