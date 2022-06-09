package S4D2Date_Time_ExceptionHandling;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class EmployeeBonus {

	public double Bonus(String date) throws InvalidAge {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		try {
			LocalDate ld = LocalDate.parse(date,dtf);
			LocalDate ld2 = LocalDate.now();
			
			if(ld.getYear()>ld2.getYear()) {
				InvalidAge ia = new InvalidAge("Age should not be in the future.");
				throw ia;
			}
			if(ld2.getYear()-ld.getYear()<1) {
				return 5000.0;
			}
			else if(ld2.getYear()-ld.getYear()==1 || ld2.getYear()-ld.getYear()<=2) {
				return 8000.0;
			}
			else {
				return 10000.0;
			}
		} 
		catch (DateTimeParseException e) {
			InvalidAge ia = new InvalidAge("Please pass the date in the correct format.");
			throw ia;
		}
		
	}
}
