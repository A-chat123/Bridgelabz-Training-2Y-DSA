import java.util.*;

public class SplitWords {

    static String[] customSplit(String str) {
        int n = str.length();
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[count];
        int idx = 0;
        String word = "";

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (!word.equals("")) {
                    words[idx++] = word;
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        if (!word.equals("")) {
            words[idx] = word;
        }

        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = input.nextLine();
        input.close();

        String[] custom = customSplit(str);
        String[] builtin = str.split(" ");

        System.out.println("Custom Split: " + Arrays.toString(custom));
        System.out.println("Built-in Split: " + Arrays.toString(builtin));
        System.out.println("Equal? " + compareArrays(custom, builtin));
    }
}
