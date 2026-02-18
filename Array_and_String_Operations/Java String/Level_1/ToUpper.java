import java.util.*;

public class ToUpper {
    static String customToUpper(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch = (char)(ch - 32);
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

        String custom = customToUpper(s);
        String builtin = s.toUpperCase();

        System.out.println("Custom uppercase: " + custom);
        System.out.println("Built-in uppercase: " + builtin);
        System.out.println("Equal ==>  " + compare(custom, builtin));
    }
}
