package libraryCatalogue;

public class Book {

	String title;
	int pageCount;
	int ISBN;
	boolean isCheckedOut;
	int dayCheckedOut = -1;
	
	//constructor
	public Book (String bookTitle, int bookPageCount, int bookISBN) {
		this.title = bookTitle;
		this.pageCount = bookPageCount;
		this.ISBN = bookISBN;
		isCheckedOut = false;
	}
	
	//getters --> getters are instance methods, because they give the values of certain properties within the instance
	public String getBookTitle() {
		return this.title;
	}
	
	public int getPageCount() {
		return this.pageCount;
	}
	
	public int getISBN() {
		return this.ISBN;
	}
	
	public boolean getIsCheckedOut() {
		return this.isCheckedOut;
	}
	
	public int getDayCheckedOut() {
		return this.dayCheckedOut;
	}
	
	
	//setters --> instance methods, because they set values of certain properties within the instance
	public void setIsCheckedOut (boolean newIsCheckedOut, int currentDayCheckedOut) {
		this.isCheckedOut = newIsCheckedOut;
		setDayCheckedOut(currentDayCheckedOut);
	}
	
	//this is private, that means this method can only be called from within the Book.java and not from any other.
	private void setDayCheckedOut (int day) {
		this.dayCheckedOut = day;
	}
}
