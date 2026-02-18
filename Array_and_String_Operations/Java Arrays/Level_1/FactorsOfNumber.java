import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int maxFact = 10;
        int[] fact = new int[maxFact];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (index == fact.length) {
                    maxFact *= 2;
                    int[] temp = new int[maxFact];

                    for (int j = 0; j < fact.length; j++) {
                        temp[j] = fact[j];
                    }

                    fact = temp;
                }
                fact[index++] = i;
            }
        }

        System.out.print("Factors of " + n + " : ");
        for (int i = 0; i < index; i++) {
            System.out.print(fact[i] + " ");
        }

        input.close();
    }
}
