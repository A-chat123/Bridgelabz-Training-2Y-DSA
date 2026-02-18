import java.util.*;

public class TrimSpaces {
    static int[] findTrimIndexes(String str) {
        int n = str.length();
        int start = 0, end = n - 1;
        while (start < n && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String str = input.nextLine();
        input.close();

        int[] indexes = findTrimIndexes(str);
        String Trim_Custom = customSubstring(str, indexes[0], indexes[1]);
        String trim_BuiltIn = str.trim();

        System.out.println("Custom Trim: '" + Trim_Custom + "'");
        System.out.println("Built-in Trim: '" + trim_BuiltIn + "'");
        System.out.println("Equal? " + compareStrings(Trim_Custom, trim_BuiltIn));
        input.close();
    }
}
