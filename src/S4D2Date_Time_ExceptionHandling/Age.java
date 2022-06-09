package S4D2Date_Time_ExceptionHandling;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Age {

	public int findAge(String dob) throws InvalidDateFormat {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
            LocalDate l1 = LocalDate.parse(dob,dtf);
			LocalDate ld = LocalDate.now();
			
			if(l1.getYear()>ld.getYear()) {
				return 0;
			}
			else {
				Period diff = Period.between(l1, ld);
				return diff.getYears();
			}
		} 
		catch (DateTimeParseException e) {
			
			InvalidDateFormat idf = new InvalidDateFormat("Please pass the date in proper format");
			throw idf;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date of birth in this format dd-MM-yyyy");
		String dob = sc.next();
		
		
		try {
			
			Age age = new Age();
			int result = age.findAge(dob);
			
			if(result != 0) {
				System.out.println("Your age is: "+result);	
			}
			else {
				System.out.println("Date should not be in Future");
			}
			
		} 
		
		catch (Exception ei) {
			System.out.println(ei.getMessage());
		}

	}
}
