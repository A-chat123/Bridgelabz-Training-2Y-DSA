import java.util.Scanner;

public class FindTheBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int EMPLOYEES = 10;

        double[] salary = new double[EMPLOYEES];
        double[] years = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double sal = input.nextDouble();
            System.out.print("Enter Years of Service: ");
            double yrs = input.nextDouble();

            if (sal <= 0 || yrs < 0) {
                System.out.println("invalid input");
                i--;
                continue;
            }

            salary[i] = sal;
            years[i] = yrs;
        }

        for (int i = 0; i < EMPLOYEES; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02; 
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n      Bonus Report    ");

        System.out.println("Total Old Salary = " + totalOldSalary);
        
        System.out.println("Total Bonus Payout = " + totalBonus);
        
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}
