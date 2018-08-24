import java.util.*;

class ExceptionsPractice {
	LinkedList<String> list;
	int[] intArray = new int[4];

	//constructors
	//for testing null pointer exception
	ExceptionsPractice() {
		this.list = null;
	}

	//for testing index out of bounds exception
	ExceptionsPractice(String str) {
		this.list = new LinkedList<String>();
		list.add(str);
	}

	//methods
	void exceptionDemo(int i, String str) {
		try {
			//throws index out of bounds exception
			int myInt = intArray[i];

			//throws null pointer exception
			list.indexOf(str);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("The following index is out-of-bounds : " + e.getMessage());
		}
		catch(NullPointerException e1) {
			System.err.println("Oh no! You tried to perform an operation on an object whose value is null!");
		}
		finally {
			System.out.println("This prints regardless of whether or not the program finishes execution.");
		}
		System.out.println("The program was able to continue execution.");
	}
	
	public static void main(String[] args) {
		ExceptionsPractice aNullList = new ExceptionsPractice();
		//attempt to access an element of the null list
		aNullList.exceptionDemo(1, "x");

		ExceptionsPractice aNotNullList = new ExceptionsPractice("x");
		//attempt to access invalid index
		aNotNullList.exceptionDemo(100, "x");

	}
}
