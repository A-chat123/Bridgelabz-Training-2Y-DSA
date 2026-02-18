import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int[] feq = new int[10];

        while (n > 0) {
            int dig = n % 10;
            feq[dig]++;
            n = n / 10;
        }

        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (feq[i] > 0) {
                System.out.println("Digit at " + i +"  "+ feq[i] + " times");
            }
        }

        input.close();
    }
}
