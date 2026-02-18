import java.util.Scanner;

public class BMI {
    static String[] bmiAndStatus(double kg, double cm) {
        double m = cm / 100.0;
        double bmi = kg / (m * m);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        return new String[]{String.format("%.2f", bmi), status};
    }

    static String[][] buildTable(double[][] hw) {
        String[][] table = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            String[] b = bmiAndStatus(hw[i][0], hw[i][1]);
            table[i][0] = String.format("%.1f cm", hw[i][1]);
            table[i][1] = String.format("%.1f kg", hw[i][0]);
            table[i][2] = b[0];
            table[i][3] = b[1];
        }
        return table;
    }

    static void print(String[][] table) {
        System.out.printf("%-8s %-8s %-8s %-12s%n", "Height", "Weight", "BMI", "Status");
        for (String[] row : table) {
            System.out.printf("%-8s %-8s %-8s %-12s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] hw = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i+1) + " weight(kg): ");
            hw[i][0] = input.nextDouble();
            System.out.print("Person " + (i+1) + " height(cm): ");
            hw[i][1] = input.nextDouble();
        }
        input.close();
        String[][] table = buildTable(hw);
        print(table);
    }
}
