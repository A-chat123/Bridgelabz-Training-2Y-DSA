import java.util.Scanner;

public class FirstNonRepeating {
    static Character firstNonRepeating(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++) if (freq[s.charAt(i)] == 1) return s.charAt(i);
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = input.nextLine();
        input.close();
        Character c = firstNonRepeating(s);
        System.out.println(c == null ? "No non-repeating character" : "First non-repeating: " + c);
    }
}
