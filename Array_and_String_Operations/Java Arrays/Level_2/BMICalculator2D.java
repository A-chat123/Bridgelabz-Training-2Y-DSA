import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));

            double height;
            do {
                System.out.print("Enter height (m): ");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Try again.");
                }
            } while (height <= 0);

            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Try again.");
                }
            } while (weight <= 0);

            personData[i][0] = height;
            personData[i][1] = weight;

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0]+" " + personData[i][1] + " " + personData[i][2] + " "+ weightStatus[i]);
        }

        input.close();
    }
}
