package calendar;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalendarPractice {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();  //we're getting an instance of the Calendar class.
		cal.add(Calendar.DATE, 0);  //the DATE adds the entire date to the cal, 0 specifies that it's today's date.
		System.out.println(cal.getTime());
		SimpleDateFormat theFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = theFormat.format(cal.getTime());  //gets the time, the format method changes the format of the date to theFormat which has the date format and the date is saved in a string called formattedDate
		System.out.println(formattedDate);
	
	}
	
}
