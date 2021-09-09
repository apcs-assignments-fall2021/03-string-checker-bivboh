import sun.font.TrueTypeFont;

import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count = 0;
        char a; char b; char c;
        for (int i = 0; i <str.length(); i++){
            a = str.charAt(i);
            b = str.charAt(i);
            c = str.charAt(i);
            if (a == 'a' || b == 'b' || c == 'c') {
                count ++;
            }
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
       if (str.indexOf("the") != -1){
           return true;
       }
       else if (str.indexOf("The") != -1){
           return true;
       }
       else{
           return false;
       }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String word_backwards = "";
        for (int i = str.length() - 1; i >= 0; i--){
            word_backwards = word_backwards + str.charAt(i);
        }
        if (str.equals(word_backwards)){
            return true;

        }else{return false;}
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a string: ");
        String str = scan.nextLine();
        System.out.println("Your string contains " + countABC(str) + "A's, B's, and C's.");
        System.out.println("Does your string contain the word 'the': " + containsThe(str));
        System.out.println("Your string's palindrome status is: " + isPalindrome(str));

        // YOUR CODE HERE
    }
}
