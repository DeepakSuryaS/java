package tictactoe;

import java.util.Scanner;

public class TicTacToeApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean wannaPlay = true;
		while (wannaPlay) {
			System.out.println("Welcome to Tic Tac Toe. \n Pick a character.");
			System.out.println();
			System.out.println("Enter a character that's gonna represent you : ");
			char playerToken = scan.next().charAt(0);
			System.out.println("Now, pick one for the opponent : ");
			char opponentToken = scan.next().charAt(0);

			TicTacToe game = new TicTacToe(playerToken, opponentToken);
			AI ai = new AI();

			//setting up the board
			System.out.println("\nThis is how we're gonna play the game eh.");
			TicTacToe.printIndexBoard();
			System.out.println("To play, enter a number and you're token shall be put in that place.");

			while (game.gameOver().equals("Not over.")) {
				if (game.currentMarker == game.userMarker) {
					System.out.println("Your turn!");
					int spot = scan.nextInt();
					while (!game.playTurn(spot)) {
						System.out.println("Nah, give me another one.");
					spot = scan.nextInt();
					}
				System.out.println("You picked " + spot + "!");
				} else {
					System.out.println("It's my turn.");
					int aiSpot = ai.pickSpot(game);
					game.playTurn(aiSpot);
					System.out.println("I picked " + aiSpot + "!");
				}
				System.out.println();
				game.printBoard();
			}
			System.out.println(game.gameOver());
			System.out.println();
			System.out.println("D'ya wanna play again?\n Press y if yes else press something else.");
			char response = scan.next().charAt(0);
			wannaPlay = (response == 'y');
			System.out.println();
			System.out.println();
		}
		scan.close();
	}

}
