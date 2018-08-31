package hangman;

import java.util.*;
import java.io.*;

public class Hangman {

	String mysteryWord;
	StringBuilder currentGuess; //stringbuilder is used to make strings mutable
	ArrayList<Character> previousGuess = new ArrayList<>();

	int maxTries = 6;
	int currentTry = 0;

	private static FileReader fileReader;
	private static BufferedReader bufferedFileReader; //iterate through the file and get the words
	ArrayList<String> dictionary = new ArrayList<>(); //will store those words

	//constructor
	public Hangman() throws IOException { //exception in case the file is not available
		initializeStreams();
		mysteryWord = pickWord();
		currentGuess = initializeCurrentGuess();
	}

	//methods
	public void initializeStreams() throws IOException { //this is the reason the constructor has to throw
		try {
			File inFile = new File("hangman/dictionary.txt");
			fileReader = new FileReader(inFile);
			bufferedFileReader = new BufferedReader(fileReader);
			String currentLine = bufferedFileReader.readLine();

			//now, to add the words from the file to the dictionary in our program
			while (currentLine != null) {
				dictionary.add(currentLine);
				currentLine = bufferedFileReader.readLine();
			}
			bufferedFileReader.close();
			fileReader.close();
		} catch (IOException e) {
			System.out.println("Could not init streams.");
		}
	}
	
	public String pickWord() {
		Random rand = new Random();
		System.out.println(dictionary.size());
		int wordIndex = Math.abs(rand.nextInt()) % dictionary.size();
		return dictionary.get(wordIndex);
	}

	public StringBuilder initializeCurrentGuess() {
		StringBuilder current = new StringBuilder();
		for (int i = 0; i < mysteryWord.length() *2; i++) {
			if (i % 2 == 0) {
				current.append("_");
			} else {
				current.append(" ");
			}
		} 
		return current;
	}

	public String drawPerson() {
		switch(currentTry) {
			case 0: return noPersonDraw();
			case 1: return addHeadDraw();
			case 2: return addBodyDraw();
			case 3: return addOneArmDraw();
			case 4: return addSecondArmDraw();
			case 5: return addLegsDraw();
			default: return fullPersonDraw();
		}
	}

	public boolean gameOver() {
			if (didWeWin()) {
				System.out.println("\n Congrats! You won! You guessed the right word.");
				return true;
			} else if (didWeLose()) {
				System.out.println("\n Uh oh, You lost! The correct word is " + mysteryWord + ".");
				return true;
			}
			return false;
	}
	
	public boolean didWeLose() {
		return currentTry >= maxTries;
	}
	
	public boolean didWeWin() {
		String guess = getCondensedCurrentGuess();
		return guess.equals(mysteryWord);
	}
	
	public String getCondensedCurrentGuess() {
		String guess = currentGuess.toString();
		return guess.replace(" ", "");
	}
	
	public boolean isGuessedAlready(char guess) {
		return previousGuess.contains(guess);
	}
	
	public boolean playGuess(char guess) {
		boolean isItAGoodGuess = false;
		previousGuess.add(guess);
		for (int i = 0; i < mysteryWord.length(); i++) {
			if (mysteryWord.charAt(i) == guess) {
				currentGuess.setCharAt(i * 2, guess);
				isItAGoodGuess = true;
			}
		}
		
		if (!isItAGoodGuess) {
			currentTry++;
		}
		
		return isItAGoodGuess;
	}

	public String getFormalCurrentGuess() {
		return "Current Guess : " + currentGuess.toString();
	}

	private String noPersonDraw() {
		return  " - - - - -\n"+
			"|        |\n"+
			"|        \n" +
			"|        \n"+
			"|        \n" +
			"|        \n" +
			"|\n" +
			"|\n";

	}
	
	private String addHeadDraw() {
		return " - - - - -\n"+
			"|        \n"+
			"|        O\n" +
			"|         \n"+
			"|         \n" +
			"|         \n" +
			"|\n" +
			"|\n";

	}

	private String addBodyDraw() {
		return " - - - - -\n"+
			"|        \n"+
			"|        O\n" +
			"|        | \n"+
			"|        |\n" +
			"|         \n" +
			"|\n" +
			"|\n";

	}
	
	private String addOneArmDraw() {
		return " - - - - -\n"+
			"|        \n"+
			"|        O\n" +
			"|      / | \n"+
			"|        |\n" +
			"|         \n" +
			"|\n" +
			"|\n";

	}

	private String addSecondArmDraw() {
		return " - - - - -\n"+
			"|        \n"+
			"|        O\n" +
			"|      / | \\ \n"+
			"|        |\n" +
			"|         \n" +
			"|\n" +
			"|\n";

	}

	private String addLegsDraw() {
		return " - - - - -\n"+
			"|        \n"+
			"|        O\n" +
			"|      / | \\ \n"+
			"|        |\n" +
			"|       / \\ \n" +
			"|\n" +
			"|\n";

	}

	private String fullPersonDraw() {
		return " - - - - -\n"+
			"|        |\n"+
			"|        O\n" +
			"|      / | \\ \n"+
			"|        |\n" +
			"|       / \\ \n" +
			"|\n" +
			"|\n";

	}
}
