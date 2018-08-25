package palindrome;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {

	Queue<Character> queue = new LinkedList<Character>();
	Stack<Character> stack = new Stack<Character>();

	//methods
	public void enqueueCharacter (char c) {
		queue.add(c);
	}

	public void pushCharacter (char c) {
		stack.push(c);
	}

	public char dequeueCharacter () {
		return (char) queue.remove();
	}

	public char popCharacter () {
		return (char) stack.pop();
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		char[] s = input.toCharArray();
		Palindrome p = new Palindrome();
		
		for(char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		boolean isPalindrome = true;
		for (int i = 0; i <= s.length/2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println("The word " + input + " is " + (isPalindrome ? "a palindrome." : "not a palindrome."));

	}

}
