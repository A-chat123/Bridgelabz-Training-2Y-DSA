import java.util.*;

public class Anagram {
    public static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] fa = new int[256], fb = new int[256];
        for (int i = 0; i < a.length(); i++) {
            fa[a.charAt(i)]++;
            fb[b.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) if (fa[i] != fb[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First text : ");
        String str1 = input.nextLine();
        System.out.print("Second text: ");
        String str2 = input.nextLine();
        input.close();
        System.out.println("Anagrams  ==> " + areAnagrams(str1, str2));
    }
}
