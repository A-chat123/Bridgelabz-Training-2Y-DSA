import java.util.*;

public class WordsWithLength {
    static int getLength(String str) {
        int count = 0;
        try {
            while (true) { str.charAt(count); count++; }
        } catch (Exception e) { return count; }
    }

    static String[] customSplit(String str) {
        int len = getLength(str);
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (!word.equals("")) { words.add(word); word = ""; }
            } else {
                word += ch;
            }
        }
        if (!word.equals("")) words.add(word);
        return words.toArray(new String[0]);
    }

    static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = input.nextLine();

        String[] words = customSplit(str);
        String[][] data = getWordLengthArray(words);

        System.out.println("Word\tLength");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        input.close();
    }
}
