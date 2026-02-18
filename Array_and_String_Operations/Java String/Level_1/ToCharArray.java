import java.util.*;

public class ToCharArray {
    static char[] customToCharArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i);
        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = input.next();
        input.close();

        char[] custom = customToCharArray(str);
        char[] builtin = str.toCharArray();

        System.out.println("Custom array: " + Arrays.toString(custom));
        System.out.println("Built-in array: " + Arrays.toString(builtin));
        System.out.println("Equal  ==> " + compareArrays(custom, builtin));
    }
}
