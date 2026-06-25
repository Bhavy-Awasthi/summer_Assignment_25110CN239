
import java.util.*;

class P100_sort_words_by_length {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words: ");
        int n = sc.nextInt(); // taking input of the number of words
        sc.nextLine(); // clearing the buffer
        String word[] = new String[n];
        System.out.println("Enter the word: "); // taking input of the words
        for (int i = 0; i < n; i++) {
            word[i] = sc.nextLine();
        }
        // bubbling sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (word[j].length() > word[j + 1].length()) // comparing the length of the words
                {
                    String temp = word[j]; // swapping
                    word[j] = word[j + 1];
                    word[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted word: "); // printing the sorted word
        for (int i = 0; i < n; i++) {
            System.out.println(word[i]);
        }
        sc.close();
    }

}