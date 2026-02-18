import java.util.Scanner;

public class ArrayTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            if (num <= 0) {
                break;
            }

            if (index == 10) {
                System.out.println("Array is full (10 numbers entered).");
                break;
            }

            arr[index] = num;
            index++;
        }
        input.close();

        for (int i = 0; i < index; i++) {
            total += arr[i];
        }

        System.out.println("Total of entered numbers = " + total);
    }
}
