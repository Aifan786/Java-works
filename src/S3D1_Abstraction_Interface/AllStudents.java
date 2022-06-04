package S3D1_Abstraction_Interface;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student name");
		String nameString = scanner.next();
		scanner.nextLine();
		System.out.println("Enter student address");
		String addString = scanner.nextLine();
		System.out.println("Enter marks of Physics");
		int marks1 = scanner.nextInt();
		System.out.println("Enter marks of Chemistry");
		int marks2 = scanner.nextInt();
		System.out.println("Enter marks of Mathematics");
		int marks3 = scanner.nextInt();
		
		ScienceStudent scienceStudent = 
		new ScienceStudent(nameString,addString,marks1,marks2,marks3);
		
		System.out.println("Percentage of "+nameString+"(Science student) = "
		                   +scienceStudent.getPercentage()+"%");
		
		System.out.println("=============================");
		
		System.out.println("Enter student name");
		String nameString2 = scanner.next();
		scanner.nextLine();
		System.out.println("Enter student address");
		String addString2 = scanner.nextLine();
		System.out.println("Enter marks of History");
		int marks4 = scanner.nextInt();
		System.out.println("Enter marks of Civics");
		int marks5 = scanner.nextInt();
		
		HistoryStudent historyStudent = 
		new HistoryStudent(nameString2,addString2,marks4,marks5);
		
		System.out.println("Percentage of "+nameString2+"(History student) = "
                +historyStudent.getPercentage()+"%");
		
		
	}
}
