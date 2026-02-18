import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (out of 100):");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1 ? "Chemistry" : "Maths");

                System.out.print(subject + ": ");
                int mark = input.nextInt();

                if (mark < 0) {
                    System.out.println("Marks cannot be negative. Re-enter student " + (i + 1) + " details.");
                    i--;
                    break;
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 80) {
                grade[i] = 'B';
            } else if (percentage[i] >= 70) {
                grade[i] = 'C';
            } else if (percentage[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        for (int i = 0; i < n; i++) {
            String status = (grade[i] == 'F') ? "Fail" : "Pass";
            System.out.printf("%-10d %-10d %-10d %-12.2f %-10c %-10s\n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i], status);
        }

        input.close();
    }
}
