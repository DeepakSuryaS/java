import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	int theNumber;
	int max;
	Scanner scan = new Scanner(System.in);
	
	public GuessTheNumber() {
		Random rand = new Random();
		max = 100;
		theNumber = Math.abs(rand.nextInt()) % (max + 1);
	}
	
	public void play() {
		while(true) {
			int move = scan.nextInt();
			if(move > theNumber) System.out.println("That's too big.");
			else if(move < theNumber) System.out.println("That's too small.");
			else { 
				System.out.println("YOU GOT IT!"); 
				break;
			}
		}
	}
	
	public static void howBigIsMyNumber(int x) {
		if(x >= 0 && x <= 10) {
			System.out.println("Our number is pretty small!");
		} else if(x >= 11 && x <= 100) {
			System.out.println("Our number is pretty big!");
		} else {
			System.out.println("Our number is out of range.");
		}
	}
	
	public static void main(String[] args) {
		GuessTheNumber guess = new GuessTheNumber();
		System.out.println("Guess the number. It's between 0 and " + guess.max + " inclusive. Just type a number to get started.");
		guess.play();
	}
}
