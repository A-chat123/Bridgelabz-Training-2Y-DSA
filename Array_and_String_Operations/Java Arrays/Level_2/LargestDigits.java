import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int maxDigit = 10;
        int[] dig = new int[maxDigit];
        int ind = 0;

        while (n != 0) {
            int digit = n % 10;
            dig[ind] = digit;
            ind++;
            if (ind == maxDigit) {
                break;
            }
            n = n / 10;
        }

        int Lar = 0, SecLar = 0;
        for (int i = 0; i < ind; i++) {
            if (dig[i] > Lar) {
                SecLar = Lar;
                Lar = dig[i];
            } else if (dig[i] > SecLar && dig[i] != Lar) {
                SecLar = dig[i];
            }
        }

        System.out.println("Largest digit: " + Lar);
        System.out.println("Second largest digit: " + SecLar);

        input.close();
    }
}
