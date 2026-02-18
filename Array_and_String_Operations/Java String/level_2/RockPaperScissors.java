import java.util.*;

public class RockPaperScissors {
    static String getComputerChoice() {
        int val = (int)(Math.random() * 3);
        if (val == 0) return "rock";
        else if (val == 1) return "paper";
        else return "scissors";
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        int userWins = 0, compWins = 0;
        for (int i = 1; i <= games; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String YOU = findWinner(user, comp);
            System.out.println("Computer: " + comp + " | Winner: " + YOU);
            if (YOU.equals("User")) userWins++;
            else if (YOU.equals("Computer")) compWins++;
        }
        sc.close();

        double userPct = (userWins * 100.0) / games;
        double compPct = (compWins * 100.0) / games;

        System.out.println("\nResults:");
        System.out.println("YOU Wins: " + userWins + " (" + userPct + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPct + "%)");
    }
}
