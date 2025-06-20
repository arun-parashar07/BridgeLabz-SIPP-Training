import java.util.Scanner;

public class RockPaperScissorsGame {
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    public static String getWinner(String player, String computer) {
        if (player.equals(computer)) return "draw";
        if ((player.equals("rock") && computer.equals("scissors")) ||
                (player.equals("paper") && computer.equals("rock")) ||
                (player.equals("scissors") && computer.equals("paper")))
            return "player";
        else return "computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt(), pWin = 0, cWin = 0;
        for (int i = 0; i < rounds; i++) {
            String player = sc.next();
            String comp = getComputerChoice();
            String result = getWinner(player, comp);
            if (result.equals("player")) pWin++;
            else if (result.equals("computer")) cWin++;
            System.out.println("Computer chose: " + comp + ", Result: " + result);
        }
        System.out.printf("Player Win %%: %.2f%%\n", pWin * 100.0 / rounds);
        System.out.printf("Computer Win %%: %.2f%%\n", cWin * 100.0 / rounds);
    }
}
