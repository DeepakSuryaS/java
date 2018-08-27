package generics;

import java.util.*;

class Printer <T> {

	public static <E> void printArray (E[] array) {
		for (E element : array) {
			System.out.println(element);
		}
	}

}

public class genericsSolution {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Integer[] intArray = new Integer[n];
		for (int i = 0; i < n; i++) {
			intArray[i] = scan.nextInt();
		}

		n = scan.nextInt();
		String[] stringArray = new String[n];
		for (int i = 0; i < n; i++) {
			stringArray[i] = scan.next();
		}

		Printer<Integer> intPrinter = new Printer<Integer>();
		Printer<String> stringPrinter = new Printer<String>();
		intPrinter.printArray(intArray);
		stringPrinter.printArray(stringArray);

		//to check if there are different printArray methods for different data types
		//this is optional
		if (Printer.class.getDeclaredMethods().length > 1) {
			System.out.println("The printer class should only have one method named printArray");
		}
	}

}
