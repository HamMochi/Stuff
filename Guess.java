import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class Guess {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int numGuesses = 0;
		int randomNum = new Random().nextInt(100) + 1;
		
		out.println("       *************       ");
		out.println("Welcome to my Guessing Game!");
		out.println("       Version 2.0       ");
		out.println("       *************       ");
		out.println();
		
		out.print("Pick a number between 1 and 100");
		int inputNum = keyboard.nextInt();
		numGuesses++;
		
		while (inputNum != randomNum) {
			if (inputNum < randomNum) {
				out.println();
				out.print("Guess higher");
				inputNum = keyboard.nextInt();
				numGuesses++;
			} else {
				out.println();
				out.print("Guess lower");
				inputNum = keyboard.nextInt();
				numGuesses++;
			}
		}
		
		out.println();
		out.print("You win!");
		out.println();
		out.println(numGuesses + " Guesses");
		
		keyboard.close();
	}
}
