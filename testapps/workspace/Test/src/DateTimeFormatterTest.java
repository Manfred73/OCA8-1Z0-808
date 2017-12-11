import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterTest {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);

		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(dateTime.format(shortDateTime));		// 1/20/20
		System.out.println(dateTime.format(mediumDateTime));	// Jan 20, 2020 11:12:34 AM
		System.out.println(date.format(shortDateTime));			// 1/20/20 
		// System.out.println(time.format(shortDateTime));		// UnsupportedTemporalTypeException >> time // cannot be formatted as a date

		DateTimeFormatter ft = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(ft.format(dateTime));					// 11:12
		System.out.println(ft.format(time));						// 11:12
		// System.out.println(ft.format(date));						// UnsupportedTemporalTypeException >> formatter which only contains time cannot be used on a date field
		
		DateTimeFormatter fd = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
		System.out.println(fd.format(dateTime));					// January 20, 2020 
		System.out.println(fd.format(date));						// January 20, 2020
		// System.out.println(fd.format(time));						// UnsupportedTemporalTypeException >> formatter which only contains date cannot be used on a time field

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date2 = LocalDate.parse("01 02 2015", dtf);
		LocalTime time2 = LocalTime.parse("11:22");
		System.out.println(date2);
		System.out.println(time2);
	}
}
