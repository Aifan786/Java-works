package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

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
	    
	    LocalDate ld = LocalDate.now();
	    
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
	    String customformat = dtf.format(ld);
	    
	    System.out.println(customformat);
	}
}











