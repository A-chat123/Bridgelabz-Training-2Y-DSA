import java.util.*;

public class ToLower {
    static String customToLower(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
            result += ch;
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
        String s = input.nextLine();
        input.close();

        String custom = customToLower(s);
        String builtin = s.toLowerCase();

        System.out.println("Custom lowercase: " + custom);
        System.out.println("Built-in lowercase: " + builtin);
        System.out.println("Equal  ==> " + compare(custom, builtin));
    }
}
