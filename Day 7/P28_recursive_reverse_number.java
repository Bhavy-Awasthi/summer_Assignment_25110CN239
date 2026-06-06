import java.util.*;
class recursive_reverse_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); 
        int num = sc.nextInt(); //take imput from user
        recursive_reverse_number ob = new recursive_reverse_number(); //create an object of the class
        int rev = ob.reverseNumber(num , 0); //call the function to reverse the number
        System.out.println("Reversed number: " + rev);
        sc.close();
    }

    int reverseNumber(int num, int reversed) 
    {
         if (num == 0) //base case
         {
            return reversed;
        }
        reversed = reversed * 10 + num % 10;
        return reverseNumber(num/10 , reversed); //recursive call with the remaining number and the updated reversed value
    }
}