public class StudentGrades {
    static int[][] generateMarks(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 41) + 60;
            }
        }
        return scores;
    }

    static String[][] calculateResults(int[][] scores) {
        int students = scores.length;
        String[][] result = new String[students][6]; 
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double pct = (total / 300.0) * 100;

            String grade;
            if (pct >= 90) grade = "A";
            else if (pct >= 80) grade = "B";
            else if (pct >= 70) grade = "C";
            else if (pct >= 60) grade = "D";
            else grade = "F";

            result[i][0] = String.valueOf(scores[i][0]);
            result[i][1] = String.valueOf(scores[i][1]);
            result[i][2] = String.valueOf(scores[i][2]);
            result[i][3] = String.valueOf(total);
            result[i][4] = String.format("%.2f", pct);
            result[i][5] = grade;
        }
        return result;
    }

    static void display(String[][] data) {
        System.out.println("Phy\tChem\tMath\tTotal\t% \tGrade");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateMarks(5);
        String[][] results = calculateResults(scores);
        display(results);
    }
}
