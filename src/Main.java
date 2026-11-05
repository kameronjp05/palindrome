
//https://github.com/kameronjp05/palindrome.git


public class Main {

    public static void main(String[] args) {
        int number = 121;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number, 0);
    }

    public static int reverseNumber(int number, int reversed) {

        // Base case
        if (number == 0) {
            return reversed;
        }

        // Recursive case
        reversed = reversed * 10 + number % 10;

        return reverseNumber(number / 10, reversed);
    }
}
