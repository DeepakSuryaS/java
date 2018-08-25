package hotChocolate;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

	//degrees are in fahrenheit
	public static final double tooHot = 185;
	public static final double tooCold = 160;

	//methods
	public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException {
		if (cocoaTemp >= tooHot) {
			throw new TooHotException();
		} else if (cocoaTemp <= tooCold) {
			throw new TooColdException();
		}
	}

	public static void main(String[] args) throws TooHotException, TooColdException, InterruptedException {
		double currentCocoaTemp = 160;
		boolean wrongTemp = true;

		while(wrongTemp) {
			try {
				drinkHotChocolate(currentCocoaTemp);
				System.out.println("Aww, Nice and delicious cocoa!");
				wrongTemp = false;
			} catch (TooHotException e1) {
				System.out.println("Santa Maria, it's too hot, it burnt my tongue!");
				currentCocoaTemp = currentCocoaTemp - 5;
			} catch (TooColdException e2) {
				System.out.println("Oh blimey, it's too cold, it's like we're in the arctic!");
				currentCocoaTemp = currentCocoaTemp + 5;
			}
			TimeUnit.SECONDS.sleep(2);
		}
		System.out.println("And it's gone.");
	}
}
