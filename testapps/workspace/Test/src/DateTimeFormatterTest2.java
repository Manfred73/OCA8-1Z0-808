import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterTest2 {

	public static void main(String[] args) {
		//LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		//System.out.println(date.getYear() +  " " + date.getMonth() + " " + date.getDayOfMonth());

		LocalDateTime d1 = LocalDateTime.of(2015,  5, 10, 11, 22, 33);
		Period p1 = Period.of(1, 2, 3);
		d1 = d1.minus(p1);
		DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d1.format(f1));

		LocalDateTime d2 = LocalDateTime.of(2015,  5, 10, 11, 22, 33);
		Period p2 = Period.ofDays(1).ofYears(2);
		d2 = d2.minus(p2);
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(d2.format(f2));
	}
}
