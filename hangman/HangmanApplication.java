package hangman;

import java.util.Scanner;
import java.io.IOException;

public class HangmanApplication {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to Hangman! \n Now, I'm gonna pick a word and you're guess it.");
		System.out.println("If you guess it wrong 6 times, then I win. If you guess it before, then you win");
		System.out.println("Ready?");
		
		
		boolean wannaPlay = true;
		while (wannaPlay) {

			System.out.println("Let's begin");
			Hangman game = new Hangman();
			
			do {
				System.out.println();
				System.out.println(game.drawPerson());
				System.out.println();
				System.out.println(game.getFormalCurrentGuess());
				//System.out.println(game.mysteryWord);
				System.out.println();
				
				//get guess
				System.out.println("Enter a character that you think is in the word : ");
				char guess = scan.next().toLowerCase().charAt(0);
				System.out.println();
				
				//check if the character is already guessed
				while (game.isGuessedAlready(guess)) {
					System.out.println("Try again, 'cause you've already guess that character.");
					guess = scan.next().toLowerCase().charAt(0);
				}
				
				//play the guess
				if (game.playGuess(guess)) {
					System.out.println("Great guess! That character is in the word.");
				} else {
					System.out.println("Uh oh, that character is not in the word. Try again.");
				}

			} while (!game.gameOver());
			
			System.out.println();
			System.out.println("Do you wanna play again ? (y/ n) : ");
			char response = (scan.next().toUpperCase()).charAt(0);
			wannaPlay = (response == 'Y');
		}
	}	

}
