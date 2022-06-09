package S4D2Date_Time_ExceptionHandling;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InvalidAge{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter joining date of a employee in this format dd-MM-yyyy");
		String date = sc.next();
		
		try {
//		
			  EmployeeBonus eb = new EmployeeBonus();
			  double amount = eb.Bonus(date);
			  System.out.println("Your bonus is: "+"Rs"+amount);
//			
		} 
		catch (InvalidAge e) {
              System.out.println(e.getMessage());
		}
	}
}
