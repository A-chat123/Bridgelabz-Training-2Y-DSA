import java.util.Scanner;

public class LargestDigitsDynamic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int maxDig = 10;
        int[] dig = new int[maxDig];
        int ind = 0;

        while (n != 0) {
            int digit = n % 10;
            if (ind == maxDig) {
                maxDig += 10;
                int[] temp = new int[maxDig];
                for (int i = 0; i < dig.length; i++) {
                    temp[i] = dig[i];
                }
                dig = temp;
            }

            dig[ind] = digit;
            ind++;
            n = n / 10;
        }

        int largest = 0, secondLargest = 0;
        for (int i = 0; i < ind; i++) {
            if (dig[i] > largest) {
                secondLargest = largest;
                largest = dig[i];
            } else if (dig[i] > secondLargest && dig[i] != largest) {
                secondLargest = dig[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        input.close();
    }
}
