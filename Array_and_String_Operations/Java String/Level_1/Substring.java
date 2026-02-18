import java.util.*;

public class Substring {
    static String customSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < s.length(); i++) {
            result += s.charAt(i);
        }
        return result;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.next();
        System.out.print("Enter start index: ");
        int start = input.nextInt();
        System.out.print("Enter end index: ");
        int end = input.nextInt();
        input.close();

        String custom = customSubstring(text, start, end);
        String builtin = text.substring(start, end);

        System.out.println("Custom substring: " + custom);
        System.out.println("Built-in substring: " + builtin);
        System.out.println("Equal  ==> " + compare(custom, builtin));
    }
}
