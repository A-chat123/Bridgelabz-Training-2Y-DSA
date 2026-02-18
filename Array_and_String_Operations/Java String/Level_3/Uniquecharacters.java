import java.util.Arrays;
import java.util.Scanner;

public class Uniquecharacters {
    static char[] uniqueChars(String s) {
        int n = s.length();
        char[] temp = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) { seen = true; break; }
            }
            if (!seen) temp[k++] = ch;
        }
        char[] out = new char[k];
        for (int i = 0; i < k; i++) out[i] = temp[i];
        return out;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = input.nextLine();
        input.close();
        char[] u = uniqueChars(s);
        System.out.println("Unique characters: " + Arrays.toString(u));
    }
}
