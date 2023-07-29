package in.surya;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class NewdateDemo {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);

		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate plusYears = date.plusYears(2);
		System.out.println(plusYears);
		boolean leapYear = LocalDate.parse("2024-04-23").isLeapYear();
		System.out.println(leapYear);

		LocalTime time = LocalTime.now();
		System.out.println(time);
		int minute = time.getMinute();
		System.out.println(minute);

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		LocalDate localDate = now.toLocalDate();
		System.out.println(localDate);
		Period period = Period.between(LocalDate.parse("2002-04-30"), LocalDate.now());
		System.out.println(period);

	}

}
