import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int[] arr = new int[10];

        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = n * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + arr[i - 1]);
        }
    }
}
