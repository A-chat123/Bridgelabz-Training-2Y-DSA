import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("invalid input");
            input.close();
            return;
        }

        String[] ans = new String[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                ans[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                ans[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                ans[i] = "Buzz";
            } else {
                ans[i] = String.valueOf(i);
            }
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + ans[i]);
        }

        input.close();
    }
}
