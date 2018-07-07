import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		out.println("       *************       ");
		out.println("Welcome to Rock Paper Scissors!");
		out.println("       *************       ");
		out.println();
		
		int playerWins = 0;
		int compWins = 0;
		
		while (playerWins < 2 && compWins < 2) {	
			
			int randomNum = new Random().nextInt(10) + 1;
			out.print("Pick rock(r), paper(p), or scissors(s)");
			out.println();
			String rps = keyboard.next();
		
			switch (rps) {
			case "r":
				if (randomNum < 5) {
					out.println();
					out.print("Paper");
					out.println();
					out.print("You lose");
					compWins++;
				} else if (randomNum > 6) {
					out.println();
					out.print("Scissors");
					out.println();
					out.print("You win");
					playerWins++;
				} else {
					out.println();
					out.print("Rock");
					out.println();
					out.print("Tie");
				}
				break;
			case "p":
				if (randomNum < 5) {
					out.println();
					out.print("Scissors");
					out.println();
					out.print("You lose");
					compWins++;
				} else if (randomNum > 6) {
					out.println();
					out.print("Rock");
					out.println();
					out.print("You win");
					playerWins++;
				} else {
					out.println();
					out.print("Paper");
					out.println();
					out.print("Tie");
				}
				break;
			case "s":
				if (randomNum < 5) {
					out.println();
					out.print("Rock");
					out.println();
					out.print("You lose");
					compWins++;
				} else if (randomNum > 6) {
					out.println();
					out.print("Paper");
					out.println();
					out.print("You win");
					playerWins++;
				} else {
					out.println();
					out.print("Scissors");
					out.println();
					out.print("Tie");
				}
				break;
				}
			out.println();
			out.print(playerWins + " to " + compWins);
			out.println();
			}

		keyboard.close();
		if (playerWins > compWins) {
			out.println();
			out.print("Congratulations, you beat the computer!");
		} else {
			out.println();
			out.print("You lost to the computer. Try again.");
		}
	}
}
