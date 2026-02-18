import java.util.*;

public class VowelConsonantType {
    static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32); // to lowercase
        if ((c >= 'a' && c <= 'z')) {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                return "Vowel";
            else return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    static String[][] analyzeString(String str) {
        int n = str.length();
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkChar(str.charAt(i));
        }
        return result;
    }

    static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = input.nextLine();
        input.close();

        String[][] result = analyzeString(str);
        displayTable(result);
    }
}
