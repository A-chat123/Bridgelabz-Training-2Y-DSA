import java.util.Scanner;

public class MultiplicationTableFrom_6To_9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 6 and 9: ");
        int n = input.nextInt();

        if (n < 6 || n > 9) {
            System.out.println("Please enter a number between 6 and 9.");
        } else {
            int[] arr = new int[10];

            for (int i = 1; i <= 10; i++) {
                arr[i - 1] = n * i;
            }

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + arr[i - 1]);
            }
        }

        input.close();
    }
}
