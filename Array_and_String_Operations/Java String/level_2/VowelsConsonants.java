import java.util.*;

public class VowelsConsonants {
    static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    static String checkChar(char c) {
        c = (char)(c >= 'A' && c <= 'Z' ? c + 32 : c);
        if ("aeiou".indexOf(c) >= 0) return "Vowel";
        else if (isLetter(c)) return "Consonant";
        else return "Not a Letter";
    }

    static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            String type = checkChar(str.charAt(i));
            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = input.nextLine();

        int[] result = countVowelsConsonants(str);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
        input.close();
    }
}
