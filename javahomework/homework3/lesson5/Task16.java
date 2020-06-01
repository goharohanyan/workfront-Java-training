package javahomework.homework3.lesson5;

//    Check if the word is palindrome or not.

public class Task16 {

    public static boolean isPalindrome(String string){
        boolean isPalindrome = true;
        String lowerCased = string.toLowerCase();
        for (int i = 0; i < lowerCased.length() / 2; i++) {
            if (lowerCased.charAt(i) != lowerCased.charAt(string.length() - i -1)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println("Madam is palindrome : " + isPalindrome("Madam"));
        System.out.println("M ,ada m is palindrome : " + isPalindrome("M ,ada m"));
        System.out.println("Ma da.m is palindrome : " + isPalindrome("Ma da.m"));
    }
}
