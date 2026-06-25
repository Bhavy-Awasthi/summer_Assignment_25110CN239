import java.util.*;

class P99_sort_names_alphabetically {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names: ");
        int n = sc.nextInt(); // taking input of the number of names
        sc.nextLine(); // clearing the buffer
        String names[] = new String[n];
        System.out.println("Enter the names: "); // taking input of the names
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        // bubbling sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j]; // swapping
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted names: "); // printing the sorted names
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
        sc.close();
    }

}