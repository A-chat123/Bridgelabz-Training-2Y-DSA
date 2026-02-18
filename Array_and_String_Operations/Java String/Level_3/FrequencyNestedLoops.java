import java.util.Scanner;

public class FrequencyNestedLoops {
    static String[] frequencyLines(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            if (chars[i] == 0) continue;
            freq[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = 0;
                }
            }
        }

        int unique = 0;
        for (int i = 0; i < n; i++) if (chars[i] != 0) unique++;

        String[] str = new String[unique];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != 0) {
                str[k++] = "'" + chars[i] + "' : " + freq[i];
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = input.nextLine();
        input.close();
        String[] str = frequencyLines(s);
        for (String i : str) System.out.println(i);
    }
}
