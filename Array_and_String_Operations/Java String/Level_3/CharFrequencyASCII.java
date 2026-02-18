import java.util.Scanner;

public class CharFrequencyASCII {
        static String[][] charFrequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;

        int count = 0;
        for (int i = 0; i < 256; i++) if (freq[i] > 0) count++;

        String[][] out = new String[count][2];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i);
            if (freq[idx] > 0) {
                out[k][0] = String.valueOf(s.charAt(i));
                out[k][1] = String.valueOf(freq[idx]);
                freq[idx] = 0;
                k++;
            }
        }
        return out;
    }

    static void print(String[][] arr) {
        System.out.println("Char\tFreq");
        for (String[] row : arr) System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = input.nextLine();
        input.close();
        String[][] table = charFrequency(s);
        print(table);
    }
}
