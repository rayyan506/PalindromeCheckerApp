import java.util.Stack;
public class PalindromeCheckerApp {
    public static boolean reverseCheck(String s) {

        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
    public static boolean twoPointerCheck(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
    public static boolean stackCheck(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        for (char c : s.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String input = "madam";
        long start1 = System.nanoTime();
        boolean r1 = reverseCheck(input);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        boolean r2 = twoPointerCheck(input);
        long end2 = System.nanoTime();
        long start3 = System.nanoTime();
        boolean r3 = stackCheck(input);
        long end3 = System.nanoTime();
        System.out.println("Input : " + input);
        System.out.println("\nReverse Method : " + r1 +
                " Time = " + (end1 - start1) + " ns");
        System.out.println("Two Pointer Method : " + r2 +
                " Time = " + (end2 - start2) + " ns");
        System.out.println("Stack Method : " + r3 +
                " Time = " + (end3 - start3) + " ns");
    }
}