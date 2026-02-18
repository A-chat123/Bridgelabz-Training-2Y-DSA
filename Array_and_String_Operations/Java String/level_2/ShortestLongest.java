import java.util.*;

public class ShortestLongest {
    static int getLength(String str) {
        int count = 0;
        try { while (true) { str.charAt(count); count++; } }
        catch (Exception e) { return count; }
    }

    static String[] customSplit(String str) {
        int len = str.length();
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (!word.equals("")) { words.add(word); word = ""; }
            } else { word += ch; }
        }
        if (!word.equals("")) words.add(word);
        return words.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = input.nextLine();
        input.close();

        String[] words = customSplit(str);
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (w.length() < shortest.length()) shortest = w;
            if (w.length() > longest.length()) longest = w;
        }

        System.out.println("Shortest Word: " + shortest);
        System.out.println("Longest Word: " + longest);
    }
}
