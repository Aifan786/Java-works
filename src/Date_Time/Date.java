package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Date {
  
	public static void main(String[] args) {
		
//		LocalDate ld = LocalDate.now();
//		
//		System.out.println(ld);
//		
//		LocalTime lt = LocalTime.now();
//		System.out.println(lt);
//		
//		LocalDateTime ldt = LocalDateTime.now();
//		System.out.println(ldt);
//		
//		ZonedDateTime zdt = ZonedDateTime.now();
//		System.out.println(zdt);
//		
//		
//	    LocalDate dob = LocalDate.of(1985, 05, 20);
//	    System.out.println(dob);
//	    
//	    
//	    LocalDate date = LocalDate.of(2017, 1, 13);
//	    LocalDateTime datetime = date.atTime(1,50,9);
//	    System.out.println(datetime);
	    
//		LocalDate date = LocalDate.now();
//		LocalDate yesterday = date.minusDays(1);
//		LocalDate tomorrow = yesterday.plusDays(2);
//		System.out.println("Today date: "+date);
//		System.out.println("Yesterday date: "+yesterday);
//		System.out.println("Tomorrow date: "+tomorrow);
		
		LocalDate date1 = LocalDate.of(2020, 1, 13);
		System.out.println(date1.isLeapYear());
		
		LocalDateTime oldDate = LocalDateTime.of(1982, 5, 31, 10, 20, 55);
		LocalDateTime newDate = LocalDateTime.of(2016, 9, 9, 10, 21, 56);
		
		System.out.println(oldDate);
		System.out.println(newDate);
		System.out.println(ChronoUnit.YEARS.between(oldDate, newDate) + " years");
		System.out.println(ChronoUnit.MONTHS.between(oldDate, newDate) + " months");
		System.out.println(ChronoUnit.WEEKS.between(oldDate, newDate) + " weeks");
		System.out.println(ChronoUnit.DAYS.between(oldDate, newDate)+ " days");
		System.out.println(ChronoUnit.HOURS.between(oldDate, newDate) + " hours");
		System.out.println(ChronoUnit.MINUTES.between(oldDate, newDate) + " minutes");
		System.out.println(ChronoUnit.SECONDS.between(oldDate, newDate) + " seconds");
		System.out.println(ChronoUnit.MILLIS.between(oldDate, newDate) + " milis");
		System.out.println(ChronoUnit.NANOS.between(oldDate, newDate) + " nano");
	}
}











