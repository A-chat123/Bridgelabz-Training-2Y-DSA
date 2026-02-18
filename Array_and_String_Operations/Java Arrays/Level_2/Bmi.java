import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight (kg): ");
            weights[i] = input.nextDouble();
            System.out.print("Enter height (m): ");
            heights[i] = input.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Height "+heights[i] + " Weight "+ weights[i] + " bmi " +  bmi[i]+ " status "+ status[i]);
        }

        input.close();
    }
}
