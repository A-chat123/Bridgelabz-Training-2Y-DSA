import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("invalid input");
            input.close();
            return;
        }

        int[] even = new int[n / 2 + 1];
        int[] odd = new int[n  /  2 + 1];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
