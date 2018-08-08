package libraryCatalogue;

import java.util.Map;
import java.util.HashMap;

public class LibraryCatalogue {

	//properties
	Map<String, Book> bookCollection = new HashMap<String, Book>();
	int currentDay;
	int lengthOfCheckOutPeriod = 7;
	double initialLateFee = 0.50;
	double feePerLateDay = 1.00;

	//constructor
	public LibraryCatalogue (Map<String, Book> collection) {
		this.bookCollection = collection;
	}
	
	//another constructor because we need flexibility
	public LibraryCatalogue (Map<String, Book> collection, int lengthOfCheckOutPeriod, double initialLateFee, double feePerLateDay) {
		this.bookCollection = collection;
		this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
		this.initialLateFee = initialLateFee;
		this.feePerLateDay = feePerLateDay;
	}
	
	//getters
	public int getCurrentDay() {
		return this.currentDay;
	}
	
	public Map<String, Book> getBookCollection() {
		return this.bookCollection;
	}
	
	public Book getBook(String bookTitle) {
		return getBookCollection().get(bookTitle);
	}
	
	public int getLengthOfCheckOutPeriod() {
		return this.lengthOfCheckOutPeriod;	
	}
	
	public double getInitialLateFee() {
		return this.initialLateFee;
	}
	
	public double getFeePerLateDay() {
		return this.feePerLateDay;
	}

	//setters
	public void nextDay() {
		currentDay++;
	}
	
	public void setDay(int day) {
		currentDay = day;
	}
	
	//instance methods (PS: static methods are class methods)
	public void checkOutBook (String title) {
		Book book = getBook(title);
		if(book.getIsCheckedOut()) {
			sorryBookAlreadyCheckedOut(book);
		} else {
			book.setIsCheckedOut(true, currentDay);
			System.out.println("You just checked out " + title + ". It is due on " + (getCurrentDay() + getLengthOfCheckOutPeriod()) + ".");
		}
	}
	
	public void returnBook (String title) {
		Book book = getBook(title);
		int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckOutPeriod());
		if(daysLate > 0) {
			System.out.println("You are late by " + daysLate + " days. You owe the library $" + (getInitialLateFee() + daysLate * getFeePerLateDay()) + ".");
		} else {
			System.out.println("Book returned. Thank You!");
		}
		book.setIsCheckedOut(false, -1);
	}
	
	public void sorryBookAlreadyCheckedOut (Book book) {
		System.out.println("Sorry, " + book.getBookTitle() + " is already checked out. It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckOutPeriod()) + ".");
	}

	public static void main(String[] args) {
	
		Map<String, Book> bookCollection = new HashMap<String, Book>();
		Book harry = new Book("Harry Potter", 1209, 999999);
		bookCollection.put("Harry Potter", harry);	
		LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
		lib.checkOutBook("Harry Potter");
		lib.nextDay();
		lib.nextDay();
		lib.nextDay();
		lib.checkOutBook("Harry Potter");
		lib.setDay(17);
		lib.returnBook("Harry Potter");
		lib.checkOutBook("Harry Potter");
	}	
	
}
