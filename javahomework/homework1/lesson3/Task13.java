package javahomework.homework1.lesson3;

//    Print a string  "ROBOTS_WILL_KILL_ALL_HUMANZ" in reverse order.

public class Task13 {
    public static void main(String[] args) {
        String str = "ROBOTS_WILL_KILL_ALL_HUMANZ";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println(str);
        System.out.println(reversedStr);
    }
}
