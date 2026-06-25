import java.util.*;

class P98_common_characters {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String s2 = sc.nextLine();
        char arr1[] = new char[s1.length()];
        char arr2[] = new char[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            arr1[i] = s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            arr2[i] = s2.charAt(i);
        }
        System.out.println("Common characters are:");
        boolean ispresent1[] = new boolean[s1.length()]; // declaring a boolean array to check if the elements of the
                                                         // first array are present in the first array

        for (int i = 0; i < s1.length(); i++) {
            if (ispresent1[i]) // if the element is already present in the first array
            {
                continue; // skip the element
            }
            for (int j = i + 1; j < s1.length(); j++) {
                if (arr1[i] == arr1[j]) {
                    ispresent1[j] = true; // set the flag to true
                }
            }
            for (int j = 0; j < s2.length(); j++) {
                if (arr1[i] == arr2[j]) // if the element is present in the second array
                {
                    System.out.print(arr1[i] + " "); // print the element
                    break;
                }
            }
        }
        sc.close();
    }

}
